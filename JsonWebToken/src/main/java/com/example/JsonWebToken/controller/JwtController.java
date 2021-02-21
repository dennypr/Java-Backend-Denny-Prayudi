/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JsonWebToken.controller;

import com.example.JsonWebToken.entity.Mahasiswa;
import com.example.JsonWebToken.repository.mahasiswaRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Denny
 */
@RestController
public class JwtController {
    
    @Autowired
    private mahasiswaRepository MahasiswaRepository;
    
    @GetMapping("/inquiry")
    public String hell(){
        return "Hello JWT";
    }
  
   
    @GetMapping("/response_account_name")
    public List<Mahasiswa> find(){
        return MahasiswaRepository.findAll();
    }
    
    @PostMapping("/save_transaction")
    public Mahasiswa insert(@Valid @RequestBody Mahasiswa request){
        return MahasiswaRepository.save(request);
    }
}
