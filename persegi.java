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
public class persegi {
     Scanner in = new Scanner(System.in);
    int sisi;

    public persegi(){
        this.sisi = sisi;
    }
    public void luasper(){

        System.out.println("laus per : "+(sisi*sisi));
    }
    public void kelpersegi(){
        System.out.println("keliling per : "+(sisi*4));
    }
    public void input(){
        System.out.println("masukkan sisi");
        sisi = in.nextInt();
    }
}
