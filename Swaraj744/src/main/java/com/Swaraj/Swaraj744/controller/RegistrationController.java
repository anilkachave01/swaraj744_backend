package com.Swaraj.Swaraj744.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Swaraj.Swaraj744.model.Registration;
import com.Swaraj.Swaraj744.service.RegistrationService;

@RestController
@RequestMapping("/api/registration")
@org.springframework.web.bind.annotation.CrossOrigin("*")
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping
    public Registration register(@jakarta.validation.Valid @RequestBody Registration reg) {
        return service.save(reg);
    }
}
