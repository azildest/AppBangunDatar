/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbangundatar;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setNamaBangunDatar("Lingkaran");
        lingkaran.setR(5);
        System.out.println("Nama Bangun Datar: " + lingkaran.getNamaBangunDatar());
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());
        
        System.out.println("");
        
        Persegi persegi = new Persegi();
        persegi.setNamaBangunDatar("Persegi");
        persegi.setSisi(6);
        System.out.println("Nama Bangun Datar: " + persegi.getNamaBangunDatar());
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());
    }
    
    
    
}
