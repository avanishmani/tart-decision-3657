package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.app.model.BillPayment;

public interface BillPaymentDao extends JpaRepository<BillPayment, Integer> {
}