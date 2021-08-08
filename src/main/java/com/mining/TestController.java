package com.mining;

import java.nio.charset.StandardCharsets;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping
	public void test() {
		LOGGER.info("[INICIO]");
		try {
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED, StandardCharsets.UTF_8.name());
			helper.setTo("kenyojoel903@gmail.com");
			helper.setSubject("Test");
			helper.setText("TEst sadad");
			javaMailSender.send(message);
			LOGGER.info("[FIN]");
		} catch (Exception e) {
			LOGGER.error("[ERROR] enviarEmail", e);
		}
	}

}
