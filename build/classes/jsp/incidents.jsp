<%@ include file="/WEB-INF/jsp/include.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Intelligent Transportation System - CSSE, SUNY at Buffalo</title>
<!-- dhtmlx css files -->
<link rel="STYLESHEET" type="text/css" href="./scripts/dhtmlx/dhtmlxGrid/codebase/dhtmlxgrid.css">
<link rel="STYLESHEET" type="text/css" href="./scripts/dhtmlx/dhtmlxGrid/codebase/skins/dhtmlxgrid_dhx_skyblue.css">

<!-- dhtmlx javascript files -->
<script src="./scripts/dhtmlx/dhtmlxGrid/codebase/dhtmlxcommon.js"></script>
<script src="./scripts/dhtmlx/dhtmlxGrid/codebase/dhtmlxgrid.js"></script>
<script src="./scripts/dhtmlx/dhtmlxGrid/codebase/dhtmlxgridcell.js"></script>
<script src="./scripts/dhtmlx/dhtmlxGrid/codebase/excells/dhtmlxgrid_excell_grid.js"></script>

</head>
<body>
<div id="gridbox" style="width:800px;height:200px"></div>
<script type="text/javascript">
	mygrid = new dhtmlXGridObject('gridbox');
	mygrid.setImagePath("./scripts/dhtmlx/dhtmlxGrid/codebase/imgs/");//path to images required by grid
	mygrid.setHeader("Id, Date, Time, Link, Caller Org, Event Desc, Owning Agency");//set column names
	mygrid.setInitWidthsP("10,10,10,10,10,*,20");//set column width in px
	mygrid.setColAlign("left,left,left,left,left,left,left");//set column values align
	mygrid.setColTypes("ro,ro,ro,ro,ro,ro,ro");//set column types
	mygrid.setColSorting("int,int,int,int,str,str,str");//set sorting
	mygrid.enableAutoWidth(true);
	mygrid.enableAutoHeight(true);
	//mygrid.setDelimiter(";");
	//mygrid.setCSVDelimiter(":")
	mygrid.init();//initialize grid
	mygrid.setSkin("dhx_skyblue");//set grid skin
	
	var i=1;
	<c:forEach items="${model.incidents}" var="inc">
		mygrid.addRow(mygrid.uid(),
				[<c:out value="${inc.id}"/>,<c:out value="${inc.incident_date}"/>, +
				<c:out value="${inc.incident_time}"/>,<c:out value="${inc.linkId}"/>, +
				'<c:out value="${inc.caller_org}"/>','<c:out value="${inc.eventDescription}"/>', +
				'<c:out value="${inc.owning_agency}"/>'],
				i);
		i = i+1;
	</c:forEach>
</script>
</body>
</html>