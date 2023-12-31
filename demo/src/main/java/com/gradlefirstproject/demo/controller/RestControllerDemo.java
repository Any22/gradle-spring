package com.gradlefirstproject.demo.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1")
public class RestControllerDemo {
    @GetMapping("/demo")
    public ResponseEntity<String> helloWorld (@RequestParam(value="name" ,defaultValue = "Saba") String name){
        return ResponseEntity.ok(String.format("hello %s", name));
    }
}
