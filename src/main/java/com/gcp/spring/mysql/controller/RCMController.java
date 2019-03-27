package com.gcp.spring.mysql.controller;

import com.gcp.spring.mysql.model.RCM;
import com.gcp.spring.mysql.repository.RCMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class RCMController {

    @Autowired
    RCMRepository rcmRepository;

    @GetMapping
    public ResponseEntity<String> testApi(){
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }

    @PostMapping("/rcm")
    public ResponseEntity<RCM> saveRCMMember(@RequestBody @Valid RCM rcm){
        return new ResponseEntity<>(rcmRepository.save(rcm), HttpStatus.OK);
    }

    @GetMapping("/rcm")
    public ResponseEntity<List<RCM>> getAllMembers(){
        return new ResponseEntity<>(rcmRepository.findAll(),HttpStatus.OK);
    }
}
