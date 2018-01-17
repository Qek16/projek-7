/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qek;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Qek {public static void main(String[]args){
    Scanner input= new Scanner(System.in);
        int umur;
        
System.out.print("Masukkan umur anda hari ini: ");
umur=input.nextInt();
    
if(umur <= 45){
        System.out.println("ANDA MASIH MUDA DAN CANTIK");

}else{
        System.out.println("ANDA SUDAH TUA DAN PERLUKAN REHAT");
}
    }
}