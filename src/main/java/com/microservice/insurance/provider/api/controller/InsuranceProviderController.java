package com.microservice.insurance.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/insurance-service")
public class InsuranceProviderController {

    @GetMapping("/get-all-plans")
    public List<String> getAllPlans(){
        return Stream.of("Premium", "Gold", "Platinum").collect(Collectors.toList());
    }
}
