/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Berli07122022;

/**
 *
 * @author USER
 */
public class ExampleException {
    public static void main(String[] args) {
        try{
            System.out.println(args[0]);
        } catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("index ke " + ex.getMessage()+ " Tidak ada");
        }
        
        
    }
}
