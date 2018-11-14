<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>jQuery DataTable Tutorial With Bootstrap</title>
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
                            <td>Percentile</td>
                        </tr>
                    </thead>
                    <tbody>
              
            <tr>
                <td>1</td>
                <td>Neha</td>
                <td>Naik</td>
                <td>83</td>
                
             
            </tr>
            <tr>
                <td>2</td>
                <td>Shishir</td>
                <td>Shetty</td>
                <td>75</td>
         
            </tr>
            <tr>
                <td>3</td>
                <td>Joyson</td>
                <td>Lewis</td>
                <td>85</td>
         
            </tr>
             <tr>
                <td>4</td>
                <td>Sidd</td>
                <td>Shah</td>
                <td>85</td>
         
            </tr>
               <tr>
                <td>5</td>
                <td>Sheryl</td>
                <td>Lewis</td>
                <td>85</td>
         
            </tr>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <script
            src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $(".table").DataTable({
                "ordering": true,
                "searching": true,
                "paging": true,
                "columnDefs": [
                    {/* 
                        "targets": 3,
                        "orderData": [3,1], */
                        	
                        "searchable": false,
                        "visible": true
                    }
                ],
                // Ordering by Percentile - Primary Sort and then by FirstName - Secondary Sort
                "order": [[3, 'desc'],[1,'asc']]
            });
        });
    </script>
</body>
</html>