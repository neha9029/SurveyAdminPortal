<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Profile</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Hi Admin</a>
    </div>
    <ul class="nav navbar-nav">
    <%--Users link --%>
     <c:url var ="userLink" value="/users">
	 </c:url>
	     <%--Add Survey  link --%>
     <c:url var ="addSureyLink" value="${pageContext.request.contextPath}/survey/add">
	 </c:url>
	    <%--View Survey  link --%>
     <c:url var ="viewSureyLink" value="/survey/view">
	 </c:url>
      <li class=""><a href="${pageContext.request.contextPath}/users">Users</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="${addSurveyLink}">Survey <span class="caret"></span></a>
        <ul class="dropdown-menu">
      
          <li><a href="${pageContext.request.contextPath}/survey/add">Add Survey</a></li>
          <li><a href="${pageContext.request.contextPath}/survey/view">View Surveys</a></li>
        </ul>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="${pageContext.request.contextPath}/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out</a></li>
    </ul>
  </div>
</nav>

</body>
</html>