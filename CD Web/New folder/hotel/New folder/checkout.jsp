<%@page import="java.util.Map"%>
<%@page import="Model.Cart"%>
<%@page import="Model.Items"%>
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
  Cart cart=(Cart) session.getAttribute("cart");
if(cart==null)
{
	cart=new Cart();
	session.setAttribute("cart", cart);
	}
TaiKhoan tk= null;
if(session.getAttribute("user")==null)
{
response.sendRedirect("/DoAnWebShop/login.jsp");
	}
%>
  <jsp:include page="header.jsp"></jsp:include>
   <!--header-->
   		<div class="container">
			<div class="products">
					<h2 style="color: black;" class=" products-in">Danh sách sản phẩm đã chọn</h2>
					<div class="content">
				<div class="content-top">
					<div class="content-top-in">
				 <%for(Map.Entry<String,Items> list: cart.getCartItems().entrySet()) { %>
						<div class="col-md-3 md-col">
							<div class="col-md">
								<a><img  src="images/<%=list.getValue().getSanpham().getHinhAnh() %>" alt="" /></a>	
								<div class="top-content">
									<center><h5><a><%=list.getValue().getSanpham().getTenSP() %></a></h5></center>
									<div class="white">
									<p class="dollar"><span class="in-dollar"><%=list.getValue().getSanpham().getGia() %></span><span>VND</span></p>
						
									</div>
									<center><h5 style="color: red;">Số lượng=<%=list.getValue().getSoLuong()%></h5></center>
									<br>
									<div>
											 <center><a href="CartController?command=sum&MaSP=<%=list.getKey()%>"><button><span> + </span></button></a></center>
									 <center><a href= "CartController?command=sub&MaSP=<%=list.getKey()%>"><button ><span> - </span></button></a></center>
							
									  
									  </div>
									 <center><li><a href= "CartController?command=remove&MaSP=<%=list.getKey()%>">Xóa khỏi giỏ hàng</a></li></center>
								</div>							
							</div>
						</div>
						<%} %>
						</div>
					<div class="clearfix"></div>
					</div>
					<br>
					 <div class="total">
	                        	<div class="total_left"><h3 style="color: black;">Tổng tiền : </h3></div>
	                        	<div ><h3><%=cart.sumTotalCart() %></h2></div>
	                        	<div class="clearfix"> </div>
	                        </div>
				</div>
			</div>
		</div>
  				
	<div class="container">
		<div class="account">
			<h2 class="account-in">Thanh Toán</h2>
				<form action="CheckoutController" method="POST">
			
				<div>
					<span class="word">Địa chỉ *</span>
					<input type="text" name="address">
				</div> 	
				
					<div>
					<span>Hình thức</span>
				<select name="payment">
				<option value="BIDV">BIDV</option>
				<option value="ARGIBANK">ARGIBANK</option>
				<option value="OCEANBANK">OCEANBANK</option>
				<option value="ACB">ACB</option>
					<option value="OCB">OCB</option>
					<option value="ViettinBank">ViettinBank</option>
				</select>
    	</div>
    	<input type="submit" value="Thanh Toán"> 
				</form>
		</div>
	</div>		<!---->
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