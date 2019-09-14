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
import javax.swing.JPanel;
public class Tugas2 {
    public static void main(String[] args) {
       double F;
       double C;
       
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Conversi Celsius ke Fahrenheit");
       System.out.print("Masukan Celsius: ");
       C = scan.nextInt();
       
       F = (C/5 * 9) + 32;
       System.out.println("Fahrenheit= " +F);
   }
}
