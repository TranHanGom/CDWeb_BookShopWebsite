package com.cnpm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cnpm.model.Booking;
import com.cnpm.model.BookingDetail;
import com.cnpm.repository.BookingDetailRepository;
import com.cnpm.repository.BookingRepository;



@Service
public class BookingDetailServiceImpl implements BookingDetailService {

	@Autowired
	private BookingDetailRepository bookingdetailRepository;
	
	@Override
	public BookingDetail save(BookingDetail booking) {
		// TODO Auto-generated method stub
		return bookingdetailRepository.save(booking);
	}
	
}
