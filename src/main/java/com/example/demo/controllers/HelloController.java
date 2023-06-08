package com.example.demo.controllers;

import com.microsoft.applicationinsights.TelemetryConfiguration;
import com.microsoft.applicationinsights.TelemetryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
    private TelemetryClient telemetryClient;

    public HelloController() {
        String instrumentationKey ="a14ba32c-32dd-4b6f-9372-ab97d448caaf" ;
        TelemetryConfiguration configuration = TelemetryConfiguration.createDefault();
        configuration.setInstrumentationKey(instrumentationKey);
        telemetryClient = new TelemetryClient(configuration);
    }

    @GetMapping("/hello")
    public String showForm(Model model) {
        model.addAttribute("message", "");
        return "hello";
    }

    @PostMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, you!");

        // Track telemetry event
        telemetryClient.trackEvent("HelloButtonClicked");

        return "hello";
    }
}