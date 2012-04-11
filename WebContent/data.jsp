<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Load Data sets</title>

<script type="text/javascript">
	function validate(){
		
	}
	
	function reset(){
		
	}
</script>

</head>
<form name="dataLoadForm" enctype="multipart/form-data">
<body>
	<p><b><font size="4" face="Calibri">Load Data Sets</font></b></p>
	<br/>
	<table cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td height="35px">Type of data to load:&nbsp;</td>
			<td>
				<input type="radio" name="dataType" value="1" checked="checked"/>Incident Logs&nbsp;
				<input type="radio" name="dataType" value="2" />Volume Data&nbsp;
				<input type="radio" name="dataType" value="3" />Speed Data&nbsp;
				<input type="radio" name="dataType" value="4" />Help Logs&nbsp;
			</td>
		</tr>
		<tr>
			<td height="35px">Select file:&nbsp;</td>
			<td><input type="file" name="dataDir" size="50"/></td>
		</tr>
	</table>
	<br/>
	<span>
		<input type="button" value="Submit" onclick="validate();"/>
		&nbsp;
		<input type="button" value="Reset" onclick="reset();"/>
	</span>
	
</form>
</body>
</html>