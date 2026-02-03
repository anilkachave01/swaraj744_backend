package com.Swaraj.Swaraj744.controller;

import com.Swaraj.Swaraj744.model.Component;
import com.Swaraj.Swaraj744.model.Registration;
import com.Swaraj.Swaraj744.repository.ComponentRepository;
import com.Swaraj.Swaraj744.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    RegistrationRepository registrationRepository;

    @Autowired
    ComponentRepository componentRepository;

    @GetMapping("/orders")
    public List<Registration> getAllOrders() {
        return registrationRepository.findAll();
    }

    @PostMapping("/components")
    public Component addComponent(@RequestBody Component component) {
        return componentRepository.save(component);
    }

    @PutMapping("/components/{id}")
    public Component updateComponent(@PathVariable Long id, @RequestBody Component details) {
        Component comp = componentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Component not found"));
        comp.setName(details.getName());
        comp.setPricePerAcre(details.getPricePerAcre());
        comp.setPricePerPot(details.getPricePerPot());
        return componentRepository.save(comp);
    }

    @DeleteMapping("/components/{id}")
    public void deleteComponent(@PathVariable Long id) {
        componentRepository.deleteById(id);
    }
}
