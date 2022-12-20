/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbangundatar;

/**
 *
 * @author HP
 */
public class Lingkaran extends BangunDatar{

    public final float PHI = 3.14f;
    float r;

    public Lingkaran() {
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    
    @Override
    double luas() {
        return PHI * r * r;
    }

    @Override
    double keliling() {
        return 2 * PHI * r;
    }
    
}
