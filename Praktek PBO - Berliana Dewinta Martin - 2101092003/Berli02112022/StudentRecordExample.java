/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Berli02112022;

/**
 *
 * @author USER
 */
public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord student1= new StudentRecord();
        //isi objek
        student1.a = 10;
        student1.setName("Berliana Martin");
        student1.setAddress("padang");
        student1.setAge(19);
        student1.setMathGrade(90);
        student1.setEnglishGrade(97);
        student1.setScienceGrade(81);
        
        //menampilkan
        System.out.println("Nama        :"+student1.getName());
        System.out.println("Alamat      :"+student1.getAddress());
        System.out.println("Umur        :"+student1.getAge());
        System.out.println("Matematika  :"+student1.getMathGrade());
        System.out.println("B.inggris   :"+student1.getEnglishGrade());
        System.out.println("Sains       :"+student1.getScienceGrade());
        System.out.println("Rata-rata   :"+student1.getAverage());
        System.out.println("Nilai Mkas  :"+student1.getMax());
        
        System.out.println("=========================================");
        
        StudentRecord student2 = new StudentRecord();
        student2.setName("Arrasy Rizqi Taher");
        student2.setAddress("Gunung Pangilun");
        student2.setAge(20);
        student2.setMathGrade(100);
        student2.setEnglishGrade(100);
        student2.setScienceGrade(100);
        student2.print("");
        System.out.println("=========================================");
        student2.print(student2.getEnglishGrade(), student2.getMathGrade(), student2.getScienceGrade());
    }
}
