<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
    <title>Report</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<!-- Original CSS -->
	<link rel="stylesheet" type="text/css" href="css/core.css" />
	<script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
</head>

<body>
		<div id="header">
			<img src="images/spring_logo.png" alt="No content" />
			<h1 id="title">Report</h1>
		</div>
		<div id="menubar">
			<table id="tpbheader">
				<tr>
					<th>
						<span>Name</span>
					</th>
					<th>
						<span>Version</span>
					</th>
					<th>
						<span>License</span>
					</th>
					<th>
						<span>Redistributable</span>
					</th>
					<th>
						<span>Approval</span>
					</th>
				</tr>
			</table>
		</div>
		
		<div>
		    <table  id="tpbheader">
		    	<c:forEach var="artifactory" items="${artifactorytpbs}">
			    	<tr>
			    		<td><c:out value="${artifactory.name}"/></td>
			    		<td><c:out value="${artifactory.version}"/></td>
			    		<td><c:out value="${artifactory.license}"/></td>
			    		<td><c:out value="Yes"/></td>
			    		<td><c:out value="No"/></td>
			    	</tr>
		    	</c:forEach>
		    </table>
    	</div>
	</div>
</body>
</html>