<%@page import="common.StringProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/style.css" />
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h3>Đăng nhập hệ thống</h3>
		<br>
		<form action="DangNhapServlet" method="post">
			<div class="row form-group">
				<label class="col-lg-2">Tên đăng nhập</label>
				<div class="col-lg-3">
					<input type="text" class=" form-control" name="username" value = "admin" />
				</div>
			</div>
			<div class="row form-group">
				<label class="col-lg-2">Mật khẩu</label>
				<div class="col-lg-3">
					<input type="password" value = "admin" class="form-control" name="password" />
				</div>
			</div>
			<div class="row form-group">
				<div class="col-lg-3 col-lg-offset-2">
					<p style="color: red;"><%=StringProcess.getVaildString((String)request.getAttribute("thongBao"))%></p>
				</div>
			</div>
			<div class="row form-group">
				<div class="col-lg-3 col-lg-offset-2">
					<button class="btn btn-primary" type="submit" value="submit" name="submit">Đăng nhập</button>
					<button class="btn btn-primary" type="reset" value="submit" name="submit">Hủy</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>