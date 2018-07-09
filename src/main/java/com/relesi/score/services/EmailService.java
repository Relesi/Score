package com.relesi.score.services;

import org.springframework.mail.SimpleMailMessage;

import com.relesi.score.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
