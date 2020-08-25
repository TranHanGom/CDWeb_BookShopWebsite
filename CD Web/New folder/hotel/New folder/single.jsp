<%@page import="DAO.SanPhamDAO"%>
<%@page import="Model.SanPham"%>
<%@page import="Model.ChiTietSanPham"%>
<%@page import="DAO.ChiTietSPDAO"%>
<%@page import="Model.Cart"%>
<%@page import="Controller.CartController"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Title -->
    <title>Hotel Booking</title>

    <!-- Favicon -->
    <link rel="icon" href="./img/core-img/favicon.png">

    <!-- Stylesheet -->
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <!-- Preloader -->
    <div id="preloader">
        <div class="loader"></div>
    </div>
  <%
	SanPhamDAO spd=new SanPhamDAO();
ChiTietSPDAO ctspd=new ChiTietSPDAO();
SanPham sp=new SanPham();
ChiTietSanPham ctsp= new ChiTietSanPham();
String MaSP="";
	if(request.getParameter("MaSP")!=null)
	{
		MaSP=request.getParameter("MaSP");
		sp=spd.getSanPham(MaSP);
		ctsp=ctspd.getChiTietSP(MaSP);
	}
	Cart cart=(Cart) session.getAttribute("cart");
	if(cart==null)
	{
		cart=new Cart();
		session.setAttribute("cart", cart);
		}
%>
  <!--header-->
  <jsp:include page="header.jsp"></jsp:include>
  
		<div class="container">
			<div class="single">
				<div class="col-md-9 top-in-single">
					<div class="col-md-5 single-top">
						<ul id="etalage">
							<li>
								<a href="optionallink.jsp">
									<img class="etalage_thumb_image img-responsive" src="images/<%=sp.getHinhAnh() %>" alt="" >
									<img class="etalage_source_image img-responsive" src="images/<%=sp.getHinhAnh() %>" alt="" >
								</a>
							</li>
						
						</ul>
				
					</div>	
					<div class="col-md-7 single-top-in">
						<div class="single-para">
							<h2><%=sp.getTenSP() %></h2>
							<div class="para-grid">
								<span  class="add-to"><%=sp.getGia()%> Đ</span>
										
								<div class="clearfix"></div>
							 </div>			
						
						<a href="CartController?command=plus&MaSP=<%=MaSP%>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>	
	
					
						</div>
					</div>
				<div class="clearfix"> </div>
						
					<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="single-bottom">
						<h3>Ngày sản xuất:</h3>
						<ul>
						<li><i></i><%=ctsp.getNgaySX() %></li>
						</ul>
					</div>
				</div>
				<br>
				<br>
				<div class="col-md-3">
					<div class="single-bottom">
						<h3>Xuất sứ</h3>
						<ul>
						<li><i></i><%=ctsp.getXuatSu() %></li>
						</ul>
					</div>
				</div>
				<br>
				<br>
				<div class="col-md-3">
					<div class="single-bottom">
						<h3>Nơi sản xuất</h3>
						<ul>
						<li><i></i><%=ctsp.getNoiSX() %></li>
						</ul>
					</div>
				</div>
					<br>
				<br>
				</div>
				<div class="col-md-3">
					<div class="single-bottom">
						<h3>Thời gian bảo hành:</h3>
						<ul>
						<li><i></i><%=ctsp.getHanSD() %></li>
						</ul>
					</div>
				</div>
				<div class="clearfix"> </div>
		</div>
		
<!-- footer -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- footer -->
    <!-- **** All JS Files ***** -->
    <!-- jQuery 2.2.4 -->
    <script src="js/jquery.min.js"></script>
    <!-- Popper -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap -->
    <script src="js/bootstrap.min.js"></script>
    <!-- All Plugins -->
    <script src="js/roberto.bundle.js"></script>
    <!-- Active -->
    <script src="js/default-assets/active.js"></script>

</body>

</html>