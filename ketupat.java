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
public class ketupat {
    Scanner in = new Scanner(System.in);
    int diagonal1;
    int diagonal2;
    int sisi;

    public ketupat(){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }
    public void inputluas(){
        System.out.println("masukkan diagonal 1 : ");
        diagonal1 = in.nextInt();
        System.out.println("masukkan diagonal 2 : ");
        diagonal2 = in.nextInt();
    }
    public void keliling(){
        System.out.println("keliling ketupat : "+(sisi*4));
    }
    public void luas(){
        System.out.println("luas ketupat : "+0.5*diagonal1*diagonal2);
    }
    public void inputkeliling(){
        System.out.println("masukkan sisi : ");
        sisi = in.nextInt();
    }
}
