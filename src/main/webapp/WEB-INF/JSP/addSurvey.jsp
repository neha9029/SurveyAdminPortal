<!DOCTYPE HTML>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/addSurvey.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>

<body>
	<jsp:include page="/WEB-INF/JSP/header.jsp" />
	<div id="container">
		<form class="form-horizontal"
			action="${pageContext.request.contextPath}/survey/add"
			modelAttribute="surveyDetails" method="POST">
			<div class="form-group">
				<label for="exampleInputEmail1">Survey Name</label> <input
					type="text" class="form-control" id="exampleInputEmail1"
					name="surveyName" aria-describedby="emailHelp"
					placeholder="Enter Survey Name">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Survey Description</label> <input
					type="text" class="form-control" id="exampleInputPassword1"
					name="surveyDescription" placeholder="Description">
			</div>
			<div class="form-group">
				<label for="exampleFormControlSelect1">Select Account Type</label> <select
					class="form-control" id="exampleFormControlSelect1"
					name="accountType">
					<option value="HandyMan">HandyMan</option>
					<option value="Cleaner">Cleaner</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>


		</form>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/addSurvey.js"></script>

</body>

</html>