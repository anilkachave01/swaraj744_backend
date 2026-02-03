package com.Swaraj.Swaraj744;

import com.Swaraj.Swaraj744.model.Admin;
import com.Swaraj.Swaraj744.model.Component;
import com.Swaraj.Swaraj744.repository.AdminRepository;
import com.Swaraj.Swaraj744.repository.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class DataSeeder implements CommandLineRunner {

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    ComponentRepository componentRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        
        if (adminRepository.count() == 0) {
            Admin admin = new Admin();
            admin.setUsername("Swaraj@744");
            admin.setPassword(passwordEncoder.encode("PK@Swaraj744"));
            admin.setRole("ROLE_ADMIN");
            adminRepository.save(admin);
            System.out.println("Seeded Admin user: Swaraj@744 / PK@Swaraj744");
        }

        if (componentRepository.count() == 0) {
            seedComponent("Thresher", null, 200.0);
            seedComponent("Vakhar", 500.0, null);
            seedComponent("Five Fanti", 800.0, null);
            seedComponent("Perni Yantra", 600.0, null);
            seedComponent("Rotavator", 1000.0, null);
            seedComponent("Nagar", 600.0, null); 
            seedComponent("Nine Fanti", 600.0, null); 
            seedComponent("Trolly", 1000.0, null); 
        }
    }

    private void seedComponent(String name, Double perAcre, Double perPot) {
        Component c = new Component();
        c.setName(name);
        c.setPricePerAcre(perAcre);
        c.setPricePerPot(perPot);
        componentRepository.save(c);
    }
}
