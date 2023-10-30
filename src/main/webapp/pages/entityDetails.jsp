<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<script type="text/javascript">
function show(elementId){
	document.getElementById(elementId).style.display="";
}
function hide(elementId){
	document.getElementById(elementId).style.display="none";
}
	function checker() {
		var aname = '${ent.aname}';
		var aid = '${ent.aid}';
		console.log(aname);
		console.log(aid);
		if (aname == '' || aname=='null') {
			show('notFound');
			hide('division');
		}else{
			hide('notFound');
			show('division');
		}
	}
</script>
<head>
<meta charset="ISO-8859-1">
<title>ENTITY</title>
</head>
<body onload="checker();">
	<div id="division" style="display: none">
		NAME : ${ent.aname}
	</div>
	<div id="notFound" style="display: none">
		NOT FOUND !!!
	</div>
</body>
</html>


