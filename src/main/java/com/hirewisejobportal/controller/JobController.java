package com.hirewisejobportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class JobController {

    @GetMapping("/jobs")
    public List<String> getJobs() {
        return List.of("Software Engineer", "Data Analyst");
    }
}
