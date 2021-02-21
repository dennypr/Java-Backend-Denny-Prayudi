/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JsonWebToken.repository;

import com.example.JsonWebToken.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Denny
 */
public interface mahasiswaRepository extends JpaRepository<Mahasiswa, Integer>{
    
}
