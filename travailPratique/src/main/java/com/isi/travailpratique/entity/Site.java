/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isi.travailpratique.entity;

/**
 *
 * @author isi
 */
public class Site extends Entity {

    private String name;
    private String address;
    private String description;

    public Site(int id, String name, String address, String description) {
        super(id);
        this.name = name;
        this.address = address;
        this.description = description;
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString(){
        
        return this.id + " " + this.name; 
    }

}
