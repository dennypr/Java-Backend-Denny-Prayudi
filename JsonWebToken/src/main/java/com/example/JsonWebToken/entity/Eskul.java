/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JsonWebToken.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Denny
 */
@Entity
@Table(name="eskul")
public class Eskul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_eskul;
    private String nama_eskul;
    private String jenis;

    public int getId_eskul() {
        return id_eskul;
    }

    public void setId_eskul(int id_eskul) {
        this.id_eskul = id_eskul;
    }

    public String getNama_eskul() {
        return nama_eskul;
    }

    public void setNama_eskul(String nama_eskul) {
        this.nama_eskul = nama_eskul;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    
}
