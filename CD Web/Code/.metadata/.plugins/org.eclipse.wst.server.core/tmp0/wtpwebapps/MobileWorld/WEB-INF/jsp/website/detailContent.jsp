<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!--breadcrumbs-->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Trang Chủ</a></li>
				<li class="active">Sản Phẩm</li>
				<li class="active">${product.name}</li>
			</ol>
		</div>
	</div>
<!--//breadcrumbs-->
<!--single-page-->
	<div class="single">
		<div class="container">
			<div class="single-info">		
				<div class="col-md-6 single-top wow fadeInLeft animated" data-wow-delay=".5s">	
					<div class="flexslider">
						<ul class="slides">
							<li data-thumb="${product.image}">
								<div class="thumb-image"> <img src="${product.image}" data-imagezoom="true" class="img-responsive" alt=""> </div>
							</li>
						</ul>
					</div>
				</div>
				<div class="col-md-6 single-top-left simpleCart_shelfItem wow fadeInRight animated" data-wow-delay=".5s">
					<h3>${product.name}</h3>
					<!-- <div class="single-rating">
						<span class="starRating">
							<input id="rating5" type="radio" name="rating" value="5" checked>
							<label for="rating5">5</label>
							<input id="rating4" type="radio" name="rating" value="4">
							<label for="rating4">4</label>
							<input id="rating3" type="radio" name="rating" value="3">
							<label for="rating3">3</label>
							<input id="rating2" type="radio" name="rating" value="2">
							<label for="rating2">2</label>
							<input id="rating1" type="radio" name="rating" value="1">
							<label for="rating1">1</label>
						</span>
						<p>5.00 out of 5</p>
						<a href="#">Đánh Giá</a>
					</div> -->
					<h6 class="item_price">${product.price} VNĐ</h6>			
					<p>iPhone 6S Plus cũ bản quốc tế mới xài (cam kết chỉ bán nguyên bản 100%, đẹp long lanh không móp méo, cấn xước) xuất xứ từ Mỹ, Nhật, Sing...Sản phẩm được kiểm tra kĩ lưỡng đảm bảo hoạt động ổn định, pin còn rất tốt trước khi đến tay người dùng. Đặc biệt có chế độ bảo hành siêu tốc 12 tháng, cả rơi móp, 1 đổi 1 trong 45 ngày (dCareS) cho quý khách chọn lựa để an tâm với iPhone 6 cũ tại Di Động Thông Minh. Bộ sản phẩm chuẩn gồm: thân máy, sạc, cable pisen, dán màn hình, và que chọc sim.</p>
					<div class="clearfix"> </div>
					<div class="quantity">
						<p class="qty"> Số hàng trong kho : </p> <p style="font-weight: bold;"> ${product.quantity}</p><br>
						<p class="qty"> Số lượng :  </p>
						<input style="border: 1px solid #000; color: #000; font-weight: 700;" min="1" type="number" value="1" class="item_quantity">
					</div>
					<div class="btn_form">
						<form action="#" method="post">
							<fieldset>
								<input type="hidden" name="cmd" value="_cart" />
								<input type="hidden" name="add" value="1" />
								<input type="hidden" name="business" value="" />
								<input type="hidden" name="item_name" value="${product.name}" />
								<input type="hidden" name="amount" value="${product.price}" />
								<input type="hidden" name="discount_amount" value="" />
								<input type="hidden" name="currency_code" value="VND" />
								<input type="hidden" name="item_image" value="images/4.png" />
								<input type="hidden" name="return" value=" " />
								<input type="hidden" name="cancel_return" value=" " />
								<input style="background-color: transparent; padding: 0.8em 2em; border: 1px solid #FF590F; color: #FF590F;" type="submit" name="submit" value="Thêm vào giỏ" />
							</fieldset>
						</form>
						<!-- <a href="#" class="add-cart item_add">Thêm Vào Giỏ</a> -->
					</div>
				</div>
			   <div class="clearfix"> </div>
			</div>
			<!--collapse-tabs-->
			<div class="collpse tabs">
				<div class="panel-group collpse" id="accordion" role="tablist" aria-multiselectable="true">
					<div class="panel panel-default wow fadeInUp animated" data-wow-delay=".5s">
						<div class="panel-heading" role="tab" id="headingOne">
							<h4 class="panel-title">
								<a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
								  Mô Tả
								</a>
							</h4>
						</div>
						<div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
							<div class="panel-body">
								iPhone 6S Plus cũ bản quốc tế mới xài (cam kết chỉ bán nguyên bản 100%, đẹp long lanh không móp méo, cấn xước) xuất xứ từ Mỹ, Nhật, Sing...Sản phẩm được kiểm tra kĩ lưỡng đảm bảo hoạt động ổn định, pin còn rất tốt trước khi đến tay người dùng. Đặc biệt có chế độ bảo hành siêu tốc 12 tháng, cả rơi móp, 1 đổi 1 trong 45 ngày (dCareS) cho quý khách chọn lựa để an tâm với iPhone 6 cũ tại Di Động Thông Minh. Bộ sản phẩm chuẩn gồm: thân máy, sạc, cable pisen, dán màn hình, và que chọc sim.
							</div>
						</div>
					</div>
					<div class="panel panel-default wow fadeInUp animated" data-wow-delay=".6s">
						<div class="panel-heading" role="tab" id="headingTwo">
							<h4 class="panel-title">
								<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
								   Thông tin thêm
								</a>
							</h4>
						</div>
						<div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
							<div class="panel-body">
								Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							</div>
						</div>
					</div>
					<div class="panel panel-default wow fadeInUp animated" data-wow-delay=".7s">
						<div class="panel-heading" role="tab" id="headingThree">
							<h4 class="panel-title">
								<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
									Đánh giá (5)
								</a>
							</h4>
						</div>
						<div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
							<div class="panel-body">
								Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							</div>
						</div>
					</div>
					<div class="panel panel-default wow fadeInUp animated" data-wow-delay=".8s">
						<div class="panel-heading" role="tab" id="headingFour">
							<h4 class="panel-title">
								<a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
									Trợ giúp
								</a>
							</h4>
						</div>
						<div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
							<div class="panel-body">
								Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--//collapse -->
			<!--related-products-->
			
			<!--//related-products-->
		</div>
	</div>
<!--//single-page-->