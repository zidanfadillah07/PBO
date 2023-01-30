/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class segitiga {
    Scanner in = new Scanner(System.in);
    int alas;
    int tinggi;

    public segitiga(){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void input(){
        System.out.println("masukkan alas : ");
        alas = in.nextInt();
        
        System.out.println("masukkan tinggi : ");
        tinggi = in.nextInt();
    }
    public void hasilluas(){ 
        System.out.println("hasil luas segitiga : "+0.5*(alas*tinggi));
    }
    public void hasilkel(){
        
        System.out.println("keliling segitiga harus pakai pytagoras jadi gausa yaa maaf");
    }
    
}
