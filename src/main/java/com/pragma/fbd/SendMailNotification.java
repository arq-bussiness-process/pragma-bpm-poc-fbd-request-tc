package com.pragma.fbd;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class SendMailNotification implements JavaDelegate {

	@Autowired
	JavaMailSender javaMailSender;

	private final static Logger LOGGER = Logger.getLogger(SendMailNotification.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String firstName = execution.getVariableTyped("firstname").getValue().toString();
		String documentId = execution.getVariableTyped("documentId").getValue().toString();
		String emailUser =  execution.getVariable("email").toString();
		
		
		String template = "De Parte de XXXX, te damos la bienvenida " + firstName +
				". Te informamos que finalizo existosamente el proceso para adquir tu tarjeta de credito. Por favor ingresa "+
				"a la aplicación y empieza a disfrutar del producto. Para ello se habilito la tarjeta virtual ";
		
		
		
		//Se genera notificacion al cliente
		if ("OK".equals("OK")) {

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");

			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setTo(emailUser);

			msg.setSubject("Aprobacion Tarjeta de credito en linea!!!. Test ");
			msg.setText(template);

			javaMailSender.send(msg);
		} else {
			System.out.println("Notificacion no se aplica");

		}
	}

}
