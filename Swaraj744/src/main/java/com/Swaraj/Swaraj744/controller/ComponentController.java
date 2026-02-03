package com.Swaraj.Swaraj744.controller;

@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/api/components")
@org.springframework.web.bind.annotation.CrossOrigin("*")
public class ComponentController {

    @org.springframework.beans.factory.annotation.Autowired
    private com.Swaraj.Swaraj744.repository.ComponentRepository repository;

    @org.springframework.web.bind.annotation.GetMapping
    public java.util.List<com.Swaraj.Swaraj744.model.Component> getComponents() {
        return repository.findAll();
    }
}
