<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE HTML>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/addSurvey.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>

<body>
	<jsp:include page="/WEB-INF/JSP/header.jsp" />
	<div id="container">
		<form class="form-horizontal" action="${pageContext.request.contextPath}/questions/add"
			modelAttribute="questionDetails" method="POST">
			<div class="form-repeat">
			<div class="formdiv">
			
				<div class="form-group shadow-textarea">
					<label for="exampleFormControlTextarea6">Add Questions</label>
					<textarea class="form-check-input form-control z-depth-1"
						id="exampleFormControlTextarea6" rows="2"
						name="questionTitle" placeholder="Enter Question Here"></textarea>
				</div>
				
				
				
				
				<div id="removeElem" class="form-group shadow-textarea">
					<label for="exampleFormControlTextarea6">Choices</label>
                    <input type="radio" name="answer" value="0" />
 				<textarea class="form-check-input form-control z-depth-1"
						id="exampleFormControlTextarea6" rows="2"
						name="optionTitle" placeholder="Enter Choices Here"></textarea>
				</div>
				<div id="removeElem" class="form-group shadow-textarea">
					<label for="exampleFormControlTextarea6">Choices</label>
					 <input type="radio" name="answer" value="2"/>
					<textarea class="form-check-input form-control z-depth-1"
						id="exampleFormControlTextarea6" rows="2"
						name="optionTitle" placeholder="Enter Choices Here"></textarea>
				</div>

			</div>
			<input type="button" class="btn btn-primary" id="addChoice" value="Add Choice" />
			<input type="button" class="btn btn-primary" id="removeChoice" value="Remove Choice" />
            
            
			<button type="submit" class="btn btn-primary">Submit</button>
			</div>
			
		</form>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/addSurvey.js"></script>

</body>

</html>