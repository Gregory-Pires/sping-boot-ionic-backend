package com.blene.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.blene.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage meg);

}
