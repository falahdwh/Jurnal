package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();
        Scanner falah = new Scanner(System.in);
        String jawabanKesatu;
        String jawabanKedua;
        boolean pilihan = true;

        while (pilihan) {
            System.out.println("1. Masukkan Data");
            System.out.println("2. Hilangkan Data");
            System.out.println("3. Cetak Data Pegawai");
            System.out.println("4. Close");
            int choice = falah.nextInt();

            if (choice == 1) {
                System.out.println("Masukkan Data Baru");
                System.out.println("Masukkan NIP Pegawai, Nama Pegawai, dan Divisi Pegawai");
                String nip = falah.next();
                String nama = falah.next();
                String divisi = falah.next();

                System.out.println("Data ditambah di awal? (Iya / Tidak)");
                jawabanKesatu = falah.next();

                Pegawai listPegawai = new Pegawai(nip, nama, divisi);

                if(falah.next().equalsIgnoreCase("Iya")) {
                    linkedList.tambahDariDepan(listPegawai);
                }else if (falah.next().equalsIgnoreCase( "Tidak")){
                    linkedList.tambahDariBelakang(listPegawai);
                }
            } else if (choice == 2) {
                System.out.println("Data dihilangkan di akhir? (Iya / Tidak)");
                jawabanKedua = falah.next();

                if(falah.next().equalsIgnoreCase( "Iya")){
                    linkedList.hilangkanDataDepan();
                }else if (falah.next().equalsIgnoreCase("Tidak")) {
                    linkedList.hilangkanDataBelakang();
                }

            } else if (choice == 3) {
                linkedList.print();
            } else if (choice == 4) {
                break;
            }
        }
    }
}