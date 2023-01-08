/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Berli30122022;

/**
 *
 * @author Windows 10
 */
import java.io.*;
import java.util.Scanner;
public class bilanganprima {
    
    public boolean isPrima (int n){
       for (int i = 2; i <= n / 2; i++){
           if(n % i == 0){
               return false;
           }
       }
       return true;
    }
      
