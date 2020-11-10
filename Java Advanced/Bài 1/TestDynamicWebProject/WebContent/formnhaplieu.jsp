<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./CSS/bootstrap.css">

<style>
.form {
	display: flex;
	flex-direction: column;
}
</style>


</head>


<body style="margin: 10px;">
	<div class="container">
		<table class="table talbe-stipple table-hover table-bordered">
			<thead>
				<tr>
					<th>STT</th>
					<th>Tên VXL</th>
					<th>Hãng sx</th>
					<th>Ngày ra mắt</th>
					<th>Giá (VNĐ)</th>
				</tr>

			</thead>
			<tbody>
			</tbody>



		</table>
		<div class="row">
			<div class="col-4  offset-8">
				<div class="card">
					<div class="card-body">
						<form class="form">

							<div class="form-group">
								<label for="exampleInputEmail1">Tên VXL:</label> 
								<input type="text" class="form-control">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1">Hãng:</label> 
								<input type="text" class="form-control">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Ngày ra mắt:</label> 
								<input type="datetime-local" class="form-control">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Giá:</label> 
								<input type="number" class="form-control" >
							</div>
							
							<div class="text-right">
								<button type="submit" class="btn btn-primary btn-group-toggle">Thêm</button>
								<button type="button" class="btn btn-secondary btn-group-toggle">Hủy</button>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>


	</div>




</body>
</html>