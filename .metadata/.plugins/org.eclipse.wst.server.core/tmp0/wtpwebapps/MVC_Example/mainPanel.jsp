<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>MainPanel</title>
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/style.css"/>
	<script src="js/jquery-1.11.2.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<title>Insert title here</title>
</head>
<body>
	 <div class="row">
        <form action="mainPanelServlet" method="post">    
            <div class="col-lg-2 pull-right">
                <a class="btn btn-primary" href="DanhSachKHServlet" role="button">Danh Sách Khách Hàng</a>
            </div>
            
            <div class="col-lg-2 pull-right">
                <a class="btn btn-primary" href="DanhSachVacXin" role="button">Danh Sách Vaccine</a>
            </div>
        </form>
    </div>
</body>
</html>