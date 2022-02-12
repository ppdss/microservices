package com.payroll.services;

import org.springframework.stereotype.Service;

import com.payroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Pedro", 200.0, 10);
	}
}
