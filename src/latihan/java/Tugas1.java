/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.java;

/**
 *
 * @author LABPUSAT
 */
import java.util.Scanner;
public class Tugas1 {
   public static void main(String[] args) {
       int r;
       double luas;
       double keliling;
       
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Menghitung Luas & Keliling Lingkaran");
       System.out.print("Masukan Jari-Jari: ");
       r = scan.nextInt();
       
       luas = (r * r) * 22/7;
       keliling = (2 * r) * 22/7;
       System.out.println("Luas Lingkaran= " +luas);
       System.out.println("Keliling Lingkaran= " +keliling);
   }
 
}
