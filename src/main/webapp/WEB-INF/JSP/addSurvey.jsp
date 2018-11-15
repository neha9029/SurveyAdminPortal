<!DOCTYPE HTML>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/addSurvey.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" /> 
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>  
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
 
</head>

<body>
<jsp:include page="/WEB-INF/JSP/header.jsp"/>
<div id="container">
 <form class="form-horizontal" action="survey/add" modelAttribute="surveyDetails" method="POST">
  <div class="form-group shadow-textarea">
  <label for="exampleFormControlTextarea6">Add Questions</label>
  <textarea class="form-check-input form-control z-depth-1" id="exampleFormControlTextarea6" rows="2" placeholder="Enter Question Here"></textarea>
</div>
    <div class="form-group shadow-textarea">
  <label for="exampleFormControlTextarea6">Choices</label>
  <textarea class="form-check-input form-control z-depth-1" id="exampleFormControlTextarea6" rows="2" placeholder="Enter Choices Here"></textarea>
</div>
  
    <div class="form-group shadow-textarea">
  <label for="exampleFormControlTextarea6">Choices</label>
  <textarea class="form-check-input form-control z-depth-1" id="exampleFormControlTextarea6" rows="2" placeholder="Enter Choices Here"></textarea>
</div>
  <div class="form-group shadow-textarea">
  <label for="exampleFormControlTextarea6">Choices</label>
  <textarea class="form-check-input form-control z-depth-1" id="exampleFormControlTextarea6" rows="2" placeholder="Enter Choices Here"></textarea>
</div>
  <div class="form-group shadow-textarea">
  <label for="exampleFormControlTextarea6">Choices</label>
  <textarea class="form-check-input form-control z-depth-1" id="exampleFormControlTextarea6" rows="2" placeholder="Enter Choices Here"></textarea>
</div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
<form name="myForm" id="myFormChoice" onsubmit="return validateForm()">
    <div class="form-group shadow-textarea">
 	 <label for="exampleFormControlTextarea6">Choices</label>
  	<textarea class="form-check-input form-control z-depth-1" id="exampleFormControlTextarea6" rows="2" placeholder="Enter Choices Here"></textarea>
  </div>
    <input type="button" id="addChoice" value="Add Choice" />
    <br/>
</form>




</div>
  <script type="text/javascript" src="js/addSurvey.js"></script>

</body>

</html>