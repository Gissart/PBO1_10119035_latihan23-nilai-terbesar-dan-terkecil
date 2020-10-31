package com.tugasPBO;
import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menentukan max dan min nilai mahasiswa

public class MaxMin {
    static int[] nilai;
    static int jumlah;
    static String dev;
    public static void main(String[] args){
        MaxMin maxmin = new MaxMin();
        maxmin.input();
        maxmin.tampil();
        System.out.print("Developed by " + dev);
    }

    public static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan nama petugas : ");
        dev = scan.next();
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = scan.nextInt();
        nilai = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai mahasiswa ke-"+(i + 1)+" :");
            nilai[i] = scan.nextInt();
        }
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static void tampil(){
        System.out.println("=====HASIL NILAI MAHASISWA=====");
        for(int i= 0; i < jumlah;i++){
            System.out.println("Nilai Mahasiswa ke-"+i+" = "+nilai[i]);
        }

        System.out.println("maka nilai terbesar adalah : "+ getMax(nilai));
        System.out.println("maka nilai terkecil adalah : "+ getMin(nilai));


    }
}




