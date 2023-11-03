package com.travel.baenang.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/user")
public class UserController {

    @GetMapping
    public ResponseEntity<?> login() {
        return ResponseEntity.ok("dfdf");
    }
}
