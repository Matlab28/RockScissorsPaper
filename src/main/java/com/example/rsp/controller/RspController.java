package com.example.rsp.controller;

import com.example.rsp.dto.RspDto;
import com.example.rsp.service.RspService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequiredArgsConstructor
public class RspController {

    private final RspService service;

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/play-game")
    public String playIt(@RequestBody RspDto dto) {
        try {
            return service.play(dto);
        } catch (Exception e) {
            throw new RuntimeException("Invalid input.");
        }
    }
}
