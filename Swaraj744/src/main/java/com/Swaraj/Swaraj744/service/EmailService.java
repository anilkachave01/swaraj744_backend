package com.Swaraj.Swaraj744.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String to, String language) {
        System.out.println("Trying to send email to: " + to + " in " + language);
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setFrom("anilkachave125@gmail.com");
        msg.setSubject("Tractor Service Confirmation - Swaraj 744");

        String content;
        if ("Marathi".equals(language)) {
            content = "आपली ट्रॅक्टर सर्व्हिस बुकिंग यशस्वीरीत्या निश्चित झाली आहे! 🚜\n\n" +
                    "आम्ही लवकरच आपल्याशी संपर्क साधू.\n" +
                    "Swaraj 744 निवडल्याबद्दल धन्यवाद!\n\n" +
                    "If any query, you can contact us on:\n" +
                    "📞 8805350493 / 8767004746\n\n" +
                    "Message by :- Prabhakar Kachave";
        } else {
            content = "Your Tractor Service Booking Has Been Successfully Confirmed! 🚜\n\n" +
                    "We will contact you shortly with further details.\n" +
                    "Thank you for choosing Swaraj 744.\n\n" +
                    "If any query, you can contact us on:\n" +
                    "📞 8805350493 / 8767004746\n\n" +
                    "Message by :- Prabhakar Kachave";
        }

        msg.setText(content);
        mailSender.send(msg);
        System.out.println("Email sent successfully!");
    }

    public void sendAdminNotification(com.Swaraj.Swaraj744.model.Registration reg) {
    	if( reg.getComponent().getName()=="THRESHER") {
        System.out.println("Sending admin notification for new booking");
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("anilkachave125@gmail.com");
        msg.setFrom("anilkachave125@gmail.com");
        msg.setSubject("New Tractor Service Booking: " + reg.getComponent().getName());

        String details = "New Booking Received! 🚜\n\n" +
                "User Details:\n" +
                "Name: " + reg.getUser().getName() + "\n" +
                "Mobile: " + reg.getUser().getMobile() + "\n" +
                "Email: " + reg.getUser().getEmail() + "\n\n" +
                "Service Details:\n" +
                "Equipment: " + reg.getComponent().getName() + "\n" +
                "Pots: " + (reg.getPots() != null ? reg.getPots() : "N/A") + "\n" +
                "Seed Type: " + (reg.getSeedType() != null ? reg.getSeedType() : "N/A") + "\n\n" +
                "Total Price: ₹" + reg.getTotalPrice() + "\n\n" +
                "Check the admin panel for more details.";

        msg.setText(details);
        mailSender.send(msg);
        System.out.println("Admin notification sent successfully!");
    	}
    	else {
    		System.out.println("Sending admin notification for new booking");
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo("anilkachave125@gmail.com");
            msg.setFrom("anilkachave125@gmail.com");
            msg.setSubject("New Tractor Service Booking: " + reg.getComponent().getName());

            String details = "New Booking Received! 🚜\n\n" +
                    "User Details:\n" +
                    "Name: " + reg.getUser().getName() + "\n" +
                    "Mobile: " + reg.getUser().getMobile() + "\n" +
                    "Email: " + reg.getUser().getEmail() + "\n\n" +
                    "Service Details:\n" +
                    "Equipment: " + reg.getComponent().getName() + "\n" +
                    "Acres: " + (reg.getAcres() != null ? reg.getAcres() : "N/A") + "\n" +
                    "Total Price: ₹" + reg.getTotalPrice() + "\n\n" +
                    "Check the admin panel for more details.";

            msg.setText(details);
            mailSender.send(msg);
            System.out.println("Admin notification sent successfully!");
    	}
    }
}
