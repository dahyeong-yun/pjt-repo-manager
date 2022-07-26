package com.repo.manager.member.ui;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class MemberController {

    @GetMapping("/me")
    public ResponseEntity me() {
        String test = "text";
        return ResponseEntity.ok().body(test);
    }
}
