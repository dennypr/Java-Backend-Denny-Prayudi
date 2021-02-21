/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.JsonWebToken.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Denny
 */
@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    
    private int age;
    
    private String address;
    
    @OneToMany(targetEntity = Matkul.class, cascade= CascadeType.ALL)
    @JoinColumn(name="cs_fk", referencedColumnName="id")
    private List<Matkul> matkuls;
    
    @OneToMany(targetEntity = Eskul.class, cascade = CascadeType.ALL)
    @JoinColumn(name="ce_fk", referencedColumnName="id")
    private List<Eskul> eskuls;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Matkul> getMatkuls() {
        return matkuls;
    }

    public void setMatkuls(List<Matkul> matkuls) {
        this.matkuls = matkuls;
    }

    public List<Eskul> getEskuls() {
        return eskuls;
    }

    public void setEskuls(List<Eskul> eskuls) {
        this.eskuls = eskuls;
    }
    
    
}
