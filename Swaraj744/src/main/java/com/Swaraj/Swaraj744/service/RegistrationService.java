package com.Swaraj.Swaraj744.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Swaraj.Swaraj744.model.Registration;
import com.Swaraj.Swaraj744.repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository repo;

    @Autowired
    private PricingService pricingService;

    @Autowired
    private EmailService emailService;

    public Registration save(Registration reg) {

        double price = pricingService.calculate(
                reg.getComponent(),
                reg.getAcres(),
                reg.getPots(),
                reg.getSeedType());

        reg.setTotalPrice(price);

        Registration saved = repo.save(reg);

        try {
            emailService.sendMail(reg.getUser().getEmail(), reg.getUser().getLanguage());
            emailService.sendAdminNotification(saved);
        } catch (Exception e) {
            System.err.println("Failed to send email: " + e.getMessage());
         
        }

        return saved;
    }
}
