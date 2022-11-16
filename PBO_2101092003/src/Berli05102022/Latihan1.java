/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Berli05102022;

/**
 *
 * @author USER
 */
import java.io.*;
public class Latihan1 {
    public static void main( String[] args ){ 

    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
    String Nama = "";
    String Alamat = "";
    String Jurusan ="";

    try{ 
        System.out.print("Nama : ");
        Nama = dataIn.readLine();
        System.out.print("Alamat : ");
        Alamat = dataIn.readLine();
        System.out.print("Jurusan : ");
        Jurusan = dataIn.readLine();
        }catch( IOException ex ){ 
         System.out.println("Error!" +ex.getMessage());        
    }
    System.out.println("Hello, " + Nama + " di " + Alamat + " Selamat Datang Di " + Jurusan); 

    } 
}