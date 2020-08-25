<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


    <section class="roberto-about-area section-padding-100-0">
        <!-- Hotel Search Form Area -->
        <div class="hotel-search-form-area">
            <div class="container-fluid">
                <div class="hotel-search-form">
                    <form action="/room.html"> <!--  method="post" -->
                        <div class="row justify-content-between align-items-end">
                            <div class="col-6 col-md-2 col-lg-3">
                                <label for="checkIn">Check In</label>
                                <input type="date" class="form-control" id="checkIn" name="checkin-date">
                            </div>
                            <div class="col-6 col-md-2 col-lg-3">
                                <label for="checkOut">Check Out</label>
                                <input type="date" class="form-control" id="checkOut" name="checkout-date">
                            </div>
                            <div class="col-6 col-md-2">
                                <label for="room">Room</label>
                                <select name="room" id="room" class="form-control" style="display: none;">
                                    <option value="01">Single Room</option>
                                    <option value="02">Double Room</option>
                                    <option value="03">Twin Room</option>
                                    <option value="04">Family Room</option>
                                   
                                </select><div class="nice-select form-control" tabindex="0"><span class="current">Single Room</span><ul class="list"><li data-value="01" class="option selected">Single Room</li><li data-value="02" class="option">Double Room</li><li data-value="03" class="option">Twin Room</li><li data-value="04" class="option">Family Room</li></ul></div>
                            </div>
                           
                            <div class="col-12 col-md-3">
                                <button type="submit" class="form-control btn roberto-btn w-100">Search Room</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

       
    </section>
    <section class="roberto-cta-area">
        <div class="container">
            <div class="cta-content bg-img bg-overlay jarallax" style="background-image: none;" data-jarallax-original-styles="background-image: url(/img/bg-img/1.jpg);">
                <div class="row align-items-center">
                    <div class="col-12 col-md-7">
                        <div class="cta-text mb-50">
                            <h2>Contact us now!</h2>
                            <h6>Contact (+84) 032 775 431                                to book directly or for advice</h6>
                        </div>
                    </div>
                    <div class="col-12 col-md-5 text-right">
                        <a href="#" class="btn roberto-btn mb-50">Contact Now</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <div class="partner-area">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="partner-logo-content d-flex align-items-center justify-content-between wow fadeInUp" data-wow-delay="300ms" style="visibility: hidden; animation-delay: 300ms; animation-name: none;">
                        
                    </div>
                </div>
            </div>
        </div>
    </div>