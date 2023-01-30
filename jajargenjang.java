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
public class jajargenjang {
    Scanner in = new Scanner(System.in);
    int alas;
    int tinggi;

    public jajargenjang(){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void luas(){
        System.out.println("luas jajar genjang : "+(alas*tinggi));
    }
    public void keliling(){
        System.out.println("keliling jajar genjang : "+2*(alas+tinggi));
    }
    public void input(){
        System.out.println("masukkan alas : ");
        alas = in.nextInt();
        System.out.println("masukkan tinggi : ");
        tinggi = in.nextInt();
    
}
}