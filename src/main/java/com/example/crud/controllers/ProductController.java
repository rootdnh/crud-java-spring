package com.example.crud.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok("server is running");
    }
}
