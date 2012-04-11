<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="/WEB-INF/jsp/include.jsp" %>
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<TITLE>Intelligent Transportation System - CSSE, University at
Buffalo, SUNY</TITLE>
<META content="text/html; charset=windows-1252"
	http-equiv="Content-Type">
<!-- Import OL CSS, auto import does not work with our minified OL.js build -->
<LINK rel="stylesheet" type="text/css" href="map_files/style.css">
<!-- Basic CSS definitions -->
<STYLE type="text/css">
/* General settings */
body {
	font-family: Verdana, Geneva, Arial, Helvetica, sans-serif;
	font-size: small;
}

/* Toolbar styles */
#toolbar {
	position: relative;
	padding-bottom: 0.5em;
	display: none;
}

#toolbar ul {
	list-style: none;
	padding: 0;
	margin: 0;
}

#toolbar ul li {
	float: left;
	padding-right: 1em;
	padding-bottom: 0.5em;
}

#toolbar ul li a {
	font-weight: bold;
	font-size: smaller;
	vertical-align: middle;
	color: black;
	text-decoration: none;
}

#toolbar ul li a:hover {
	text-decoration: underline;
}

#toolbar ul li * {
	vertical-align: middle;
}

/* The map and the location bar */
#map {
	clear: both;
	position: relative;
	width: 512px;
	height: 462px;
	border: 1px solid black;
}

#wrapper {
	width: 512px;
}

#location {
	float: right;
}

#options {
	position: absolute;
	left: 13px;
	top: 7px;
	z-index: 3000;
}

/* Styles used by the default GetFeatureInfo output, added to make IE happy */
table.featureInfo,table.featureInfo td,table.featureInfo th {
	border: 1px solid #ddd;
	border-collapse: collapse;
	margin: 0;
	padding: 0;
	font-size: 90%;
	padding: .2em .1em;
}

table.featureInfo th {
	padding: .2em .2em;
	text-transform: uppercase;
	font-weight: bold;
	background: #eee;
}

table.featureInfo td {
	background: #fff;
}

table.featureInfo tr.odd td {
	background: #eee;
}

table.featureInfo caption {
	text-align: left;
	font-size: 100%;
	font-weight: bold;
	text-transform: uppercase;
	padding: .2em .2em;
}
</STYLE>
<!-- Import OpenLayers, reduced, wms read only version -->
<SCRIPT type="text/javascript" src="map_files/OpenLayers.js"></SCRIPT>

<SCRIPT type="text/javascript" defer="defer">

	var links = "";
	
	var map;
	var untiled;
	var tiled;
	var pureCoverage = false;
	// pink tile avoidance
	OpenLayers.IMAGE_RELOAD_ATTEMPTS = 5;
	// make OL compute scale according to WMS spec
	OpenLayers.DOTS_PER_INCH = 25.4 / 0.28;

	function init() {
		// if this is just a coverage or a group of them, disable a few items,
		// and default to jpeg format
		format = 'image/png';
		if (pureCoverage) {
			document.getElementById('filterType').disabled = true;
			document.getElementById('filter').disabled = true;
			document.getElementById('antialiasSelector').disabled = true;
			document.getElementById('updateFilterButton').disabled = true;
			document.getElementById('resetFilterButton').disabled = true;
			document.getElementById('jpeg').selected = true;
			format = "image/jpeg";
		}

		var bounds = new OpenLayers.Bounds(156593.791, 4735323.692, 230710.135,
				4802306.95);
		var options = {
			controls : [],
			maxExtent : bounds,
			maxResolution : 289.51696875000005,
			projection : "EPSG:2004",
			units : 'm'
		};
		map = new OpenLayers.Map('map', options);

		// setup tiled layer
		tiled = new OpenLayers.Layer.WMS("Geoserver layers - Tiled",
				"http://localhost:8081/geoserver/wms", {
					layers : 'Erie_County_Links_Group',
					styles : '',
					height : '462',
					width : '512',
					srs : 'EPSG:2004',
					format : format,
					tiled : 'true',
					tilesOrigin : map.maxExtent.left + ','
							+ map.maxExtent.bottom
				}, {
					buffer : 0,
					displayOutsideMaxExtent : true
				});

		// setup single tiled layer
		untiled = new OpenLayers.Layer.WMS("Geoserver layers - Untiled",
				"http://localhost:8081/geoserver/wms", {
					layers : 'Erie_County_Links_Group',
					styles : '',
					height : '462',
					width : '512',
					srs : 'EPSG:2004',
					format : format
				}, {
					singleTile : true,
					ratio : 1
				});

		map.addLayers([ untiled, tiled ]);

		// build up all controls            
		map.addControl(new OpenLayers.Control.PanZoomBar({
			position : new OpenLayers.Pixel(2, 15)
		}));
		map.addControl(new OpenLayers.Control.Navigation());
		map.addControl(new OpenLayers.Control.Scale($('scale')));
		map.addControl(new OpenLayers.Control.MousePosition({
			element : $('location')
		}));
		map.zoomToExtent(bounds);

		// wire up the option button
		var options = document.getElementById("options");
		options.onclick = toggleControlPanel;

		// support GetFeatureInfo
		map.events
				.register(
						'click',
						map,
						function(e) {
							document.getElementById('link_info').innerHTML = "Loading... please wait...";
							var params = {
								REQUEST : "GetFeatureInfo",
								EXCEPTIONS : "application/vnd.ogc.se_xml",
								BBOX : map.getExtent().toBBOX(),
								X : e.xy.x,
								Y : e.xy.y,
								INFO_FORMAT : 'text/html',
								QUERY_LAYERS : map.layers[0].params.LAYERS,
								FEATURE_COUNT : 50,
								Layers : 'Erie_County_Links_Group',
								Styles : '',
								Srs : 'EPSG:2004',
								WIDTH : map.size.w,
								HEIGHT : map.size.h,
								format : format
							};
							OpenLayers.loadURL(
									"http://localhost:8081/geoserver/wms",
									params, this, setHTML, setHTML);
							OpenLayers.Event.stop(e);
						});
	}

	// sets the HTML provided into the nodelist element
	function setHTML(response) {
		links = response.responseText;
		document.getElementById('link_info').innerHTML = response.responseText;
	};

	// shows/hide the control panel
	function toggleControlPanel(event) {
		var toolbar = document.getElementById("toolbar");
		if (toolbar.style.display == "none") {
			toolbar.style.display = "block";
		} else {
			toolbar.style.display = "none";
		}
		event.stopPropagation();
		map.updateSize()
	}

	// Tiling mode, can be 'tiled' or 'untiled'            
	function setTileMode(tilingMode) {
		if (tilingMode == 'tiled') {
			untiled.setVisibility(false);
			tiled.setVisibility(true);
			map.setBaseLayer(tiled);
		} else {
			untiled.setVisibility(true);
			tiled.setVisibility(false);
			map.setBaseLayer(untiled);
		}
	}

	// changes the current tile format
	function setImageFormat(mime) {
		// we may be switching format on setup
		if (tiled == null)
			return;

		tiled.mergeNewParams({
			format : mime
		});
		untiled.mergeNewParams({
			format : mime
		});
		/*
		var paletteSelector = document.getElementById('paletteSelector')
		if (mime == 'image/jpeg') {
		    paletteSelector.selectedIndex = 0;
		    setPalette('');
		    paletteSelector.disabled = true;
		}
		else {
		    paletteSelector.disabled = false;
		}
		 */
	}

	// sets the chosen style
	function setStyle(style) {
		// we may be switching style on setup
		if (tiled == null)
			return;

		tiled.mergeNewParams({
			styles : style
		});
		untiled.mergeNewParams({
			styles : style
		});
	}

	function setAntialiasMode(mode) {
		tiled.mergeNewParams({
			format_options : 'antialias:' + mode
		});
		untiled.mergeNewParams({
			format_options : 'antialias:' + mode
		});
	}

	function setPalette(mode) {
		if (mode == '') {
			tiled.mergeNewParams({
				palette : null
			});
			untiled.mergeNewParams({
				palette : null
			});
		} else {
			tiled.mergeNewParams({
				palette : mode
			});
			untiled.mergeNewParams({
				palette : mode
			});
		}
	}

	function setWidth(size) {
		var mapDiv = document.getElementById('map');
		var wrapper = document.getElementById('wrapper');

		if (size == "auto") {
			// reset back to the default value
			mapDiv.style.width = null;
			wrapper.style.width = null;
		} else {
			mapDiv.style.width = size + "px";
			wrapper.style.width = size + "px";
		}
		// notify OL that we changed the size of the map div
		map.updateSize();
	}

	function setHeight(size) {
		var mapDiv = document.getElementById('map');

		if (size == "auto") {
			// reset back to the default value
			mapDiv.style.height = null;
		} else {
			mapDiv.style.height = size + "px";
		}
		// notify OL that we changed the size of the map div
		map.updateSize();
	}

	function updateFilter() {
		if (pureCoverage)
			return;

		var filterType = document.getElementById('filterType').value;
		var filter = document.getElementById('filter').value;

		// by default, reset all filters                
		var filterParams = {
			filter : null,
			cql_filter : null,
			featureId : null
		};
		if (OpenLayers.String.trim(filter) != "") {
			if (filterType == "cql")
				filterParams["cql_filter"] = filter;
			if (filterType == "ogc")
				filterParams["filter"] = filter;
			if (filterType == "fid")
				filterParams["featureId"] = filter;
		}
		// merge the new filter definitions
		mergeNewParams(filterParams);
	}

	function resetFilter() {
		if (pureCoverage)
			return;

		document.getElementById('filter').value = "";
		updateFilter();
	}

	function mergeNewParams(params) {
		tiled.mergeNewParams(params);
		untiled.mergeNewParams(params);
	}
</SCRIPT>
<script type="text/javascript">
	
	var window_options = "menubar=1,resizable=1,width=850,height=600,status=yes";
	
	function popUp(id){
		if(id == 'DATA'){
			// Data load
			var url = "<c:url value='/data.jsp'/>";
			
			window.open(url, "Incident Logs - ITS, SUNY at Buffalo", window_options);
		}
		if(id == 'SEARCH'){
			validate();
		}
	}

	function validate() {
		alert(links);
		links = "5887,6842";
		var params = links+"&stDate=11/10/2010&enDate=11/12/2010&stTime=15:00&enTime=10:00";
		var url = "<c:url value='/process.htm?linkId='/>"+params;
		alert(url);
		//document.search_form.action = "process.jsp";
		//document.search_form.method = "POST";
		//document.search_form.target = "blank";
		//document.search_form.submit();
		
		window.open(url, "Incident Logs - ITS, SUNY at Buffalo", window_options);
	}
</script>
<!-- ExtJS script 
<script type="text/javascript" src="scripts/ExtJS/adapter/ext/ext-base.debug.js"></script>
<script type="text/javascript" src="scripts/ExtJS/ext-all-debug.js"></script>

 My custom scripts 
<script type="text/javascript" src="scripts/sunyab/searchform.js"></script>

 Include Ext stylesheets here: 
<link rel="stylesheet" type="text/css" href="css/ext-all.css">

-->
<!-- dhtmlx css files -->
<!--<link rel="STYLESHEET" type="text/css" href="./scripts/dhtmlx/dhtmlxCalendar/codebase/dhtmlxcalendar.css">
<link rel="STYLESHEET" type="text/css" href="./scripts/dhtmlx/dhtmlxCalendar/codebase/skins/dhtmlxcalendar_dhx_skyblue.css">

--><!-- dhtmlx javascript files -->
<!--<script src="./scripts/dhtmlx/dhtmlxCalendar/codebase/dhtmlxcommon.js"></script>
<script src="./scripts/dhtmlx/dhtmlxCalendar/codebase/dhtmlxcalendar.js"></script>
<script src="./scripts/dhtmlx/dhtmlxCalendar/codebase/excells/dhtmlxgrid_excell_grid.js"></script>
<script>window.dhx_globalImgPath="./scripts/dhtmlx/dhtmlxCalendar/codebase/imgs/";</script> 

-->

<link rel="stylesheet" type="text/css" href="./css/zapatec/zpcal.css" />
<link rel="stylesheet" type="text/css" href="./css/zapatec/winxp.css" />

<script type="text/javascript" src="./scripts/zapatec/zapatec.js"></script>
<script type="text/javascript" src="./scripts/zapatec/calendar.js"></script>
<script type="text/javascript" src="./scripts/zapatec/calendar-en.js"></script>

<META name="GENERATOR" content="MSHTML 9.00.7930.16406">
</HEAD>
<BODY onload="init()">
<form method="POST" name="search_form">
<!--<div id="header">
	<span id="dataload" >
		<input type="button" value="Load Data" name="btnLoadData" onclick="popUp('DATA');"/>
	</span>
</div>
-->
<br/>
<span style="position: absolute; top: 50px;">
<DIV id=map><IMG id=options title="Toggle options toolbar"
	src="map_files/options.png"></DIV>
</span>
<span style="position: absolute; width: 645px; height: 457px; z-index: 1; border-style: solid; left: 530px; top: 50px; border-width: 1px; padding-left: 4px; padding-right: 4px; padding-top: 1px; padding-bottom: 1px"
	id="layer2">
<p><b><font size="5" face="Calibri">Selected
Route/Station on the Map</font></b></p>

<div id="link_info"></div>

<p><b><font size="4" face="Calibri">Input Parameters</font></b></p>
<p><font face="Calibri"><span>Start Date</span> 
	<span><font size="3"> 
		<input type="text" name="stDate" size="8">
	</font>
	</span>
	<span><img src="./scripts/dhtmlx/dhtmlxCalendar/codebase/imgs/calendar.gif" id="imgStDate"/></span>
	<script type="text/javascript">
	Zapatec.Calendar.setup({
	    inputField  : "stDate", // This is the ID of your form's text field
	    ifFormat    : "%m/%d/%Y", // Format in which you want the date returned
	    button      : "imgStDate" // "trigger" is the ID of the form's button
	});
	</script>
    <span> 
	End Date
	</span> 
	<span>
		<font size="3"> 
			<input type="text" name="enDate" size="8">
		</font>
	</span>
	<span><img src="./scripts/dhtmlx/dhtmlxCalendar/codebase/imgs/calendar.gif" id="imgEnDate"/></span>
	<script type="text/javascript">
	Zapatec.Calendar.setup({
	    inputField  : "enDate", // This is the ID of your form's text field
	    ifFormat    : "%m/%d/%Y", // Format in which you want the date returned
	    button      : "imgEnDate" // "trigger" is the ID of the form's button
	});
	</script>
</font></p>
<fieldset style="padding: 2">
	<legend> <font	face="Calibri">Day of Week</font> </legend> 
	<font face="Calibri">
		<font size="3"><input type="checkbox" name="DOW" value="1"></font>Monday
		<font size="3"> <input type="checkbox" name="DOW" value="2"></font>Tuesday
		<font size="3"> <input type="checkbox" name="DOW" value="3"></font>Wednesday
		<font size="3"> <input type="checkbox" name="DOW" value="4"></font>Thursday
		<font size="3"> <input type="checkbox" name="DOW" value="5"></font>Friday
		<font size="3"> <input type="checkbox" name="DOW" value="6"></font>Saturday
		<font size="3"> <input type="checkbox" name="DOW" value="7"></font>Sunday
	</font></fieldset>
</font>
<p>
	<font face="Calibri">Start Time (hh:mm:ss) 
		<font size="3"><input type="text" name="stTime" size="14"></font>
		&nbsp; End Time(hh:mm:ss) 
		<font size="3"> <input type="text" name="enTime" size="14"></font>
	</font></p>
<p>
	<font face="Calibri">Time Aggregate 
		<font size="3">
			<select size="1" name="D1" disabled="disabled">
				<option selected>10 Minutes</option>
			</select> 
		</font> 
	</font>
</p>
<fieldset style="padding: 2">
	<legend>
		<font face="Calibri">Type of Data to View</font>
	</legend> 
	<font face="Calibri">
		<font size="3"> <input type="checkbox" name="Inc" value="ON"></font>Incident
		<font size="3"> <input type="checkbox" name="Help" value="ON"></font>Incident Help 
		<font size="3"> <input type="checkbox" name="Traffic" value="ON"></font>Traffic
	</font>
</fieldset>
</font>
<p>
	<font face="Calibri"><font size="3"> 
		<input type="button" value="Show Data" name="btnShow" onclick="popUp('SEARCH');">
	</font>
	<font size="3"> <input type="button" value="Reset Fields" name="btnReset"></font></font>
</p>

<p>&nbsp;
</span>
<DIV id="wrapper">
<DIV id="location">location</DIV>
<DIV id="scale"></DIV>
</DIV>

</form>
</BODY>
</HTML>
