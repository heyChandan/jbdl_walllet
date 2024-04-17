package org.example;

import org.example.dto.RechargeRequestDto;
import org.example.dto.RechargeResponseDto;
import org.example.dto.SendMailNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendMail {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(SendMailNotification notification) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("2270104@kiit.ac.in");
        simpleMailMessage.setSubject(notification.getSubject());
        simpleMailMessage.setTo(notification.getReceiverMailId());
        simpleMailMessage.setText(notification.getMessage());
        javaMailSender.send(simpleMailMessage);
    }

    public void sendRechargeMail(RechargeResponseDto dto) {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom("2270104@kiit.ac.in");
            simpleMailMessage.setSubject("Recharge Done Successfully");
            simpleMailMessage.setTo(dto.getGmail());
            simpleMailMessage.setText(String.format("Recharge of %f done successfully in your wallet", dto.getBalance()));
            javaMailSender.send(simpleMailMessage);
    }
}
