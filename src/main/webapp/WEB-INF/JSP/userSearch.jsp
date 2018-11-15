<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Search table</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/dataTables.bootstrap.min.css">
</head>
<body>
<jsp:include page="/WEB-INF/JSP/header.jsp"/>

    <div class="container" style="margin-top: 20px">
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <table class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <td>User Id</td>
                            <td>First Name</td>
                            <td>Last Name</td>
                            <td>Email</td>
                            <td>Account Type</td> 
                            <td>Percentile</td>
                         </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="userList" items="${userData}">
                      <tr>
                			<td>${userList.userId }</td>
                			<td>${userList.firstName}</td>
                			<td>${userList.lastName}</td>
                			<td>${userList.email}</td>
                			<td>${userList.accountType}</td>
                			<td>${userList.score}</td>
                			
                			

             
            			</tr>
                    </c:forEach>
                    
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <script
            src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
        <script type="text/javascript" src="js/userSearch.js"></script>

</body>
</html>