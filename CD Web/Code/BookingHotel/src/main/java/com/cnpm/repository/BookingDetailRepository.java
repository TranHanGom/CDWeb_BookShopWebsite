package com.cnpm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnpm.model.BookingDetail;
import com.cnpm.utils.BookingId;

public interface BookingDetailRepository extends JpaRepository<BookingDetail, Integer> {

}
