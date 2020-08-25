<%@page import="DAO.SanPhamDAO"%>
<%@page import="Model.SanPham"%>
<%@page import="Model.Cart"%>
<%@page import="Controller.CartController"%>
<%@page import="Model.TaiKhoan"%>
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
    <!-- /Preloader -->
    <%
	SanPhamDAO spd=new SanPhamDAO();
String MaCM="";
	if(request.getParameter("ChuyenMuc")!=null)
	{
		MaCM=request.getParameter("ChuyenMuc");
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
   <!--header-->
		<div class="container">
			<div class="products">
					<h2 class=" products-in">PRODUCTS</h2>
					<div class="content">
				<div class="content-top">
					<div class="content-top-in">
								<%
					for(SanPham sp  : SanPhamDAO.getListSanPham(MaCM))
					{
					%>
						<div class="col-md-3 md-col">
							<div class="col-md">
								<a href="single.jsp?MaSP=<%=sp.getMaSP()%>"><img style="width: 235px;height: 235px"  src="images/<%=sp.getHinhAnh() %> " /></a>
								<div class="top-content">
									<center><h5><a href="single.jsp?MaSP=<%=sp.getMaSP()%>"><%=sp.getTenSP() %></a></h5></center>
									<div class="white">
									<p class="dollar"><span class="in-dollar"><%=sp.getGia() %></span><span>Đ</span></p>
										<a href="CartController?command=plus&MaSP=<%=sp.getMaSP()%>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">Add To Cart</a>	
										<div class="clearfix"></div>
									</div>

								</div>							
							</div>
							<p style="color: white;font-size:30px"> .</p>
						</div>
						<%} %>
						</div>
						
					<div class="clearfix"></div>
					</div>
				</div>
			</div>
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