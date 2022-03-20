package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LinkedList<Data> lists = new LinkedList<Data>();
        lists.addLast(new Data("Smile", "R5"));
        lists.addLast(new Data("Happy", "Skinnyfabs"));
        Scanner scanner = new Scanner(System.in);

        boolean pilihan = true;
        while (pilihan) {
            menu();
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("Buat Playlist Kamu!");
                    String Judul = scanner.next();
                    String Penyanyi = scanner.next();
                    lists.addLast(new Data(Judul, Penyanyi));
                    break;

                case 2:
                    System.out.println("1. Hapus Berdasarkan Judul");
                    System.out.println("2. Hapus urutan terakhir");
                    if (scanner.nextInt() == 1){
                        System.out.println("Masukkan Judul Lagu");
                        removeWithJudul(lists, scanner.next());
                    }else {
                        lists.removeLast();
                        System.out.println("Terhapus");
                    }
                    break;

                case 3:
                    System.out.println("Tunggu");
                    print(lists);
                    break;
                default:
                    pilihan = false;
                    System.out.println("Berhasil Keluar");
                    break;
            }
        }
}
public static void print(LinkedList playerLists){
    ListIterator<Data> iterator = playerLists.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if (iterator.hasNext()){
                System.out.print(" || ");
            }
        }
    System.out.println();
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()){
                System.out.print(" || ");
            }
        }
}
public static void removeWithJudul(LinkedList playerLists, String judul) {
    ListIterator<Data> iterator = playerLists.listIterator();
    while (iterator.hasNext()){
        Data playerList = iterator.next();
        if (playerList.getJudul().equals(judul)){
            iterator.remove();
            System.out.println("Berhasil Terhapus");
        }
    }
}
public static void menu() {
    System.out.println(" Urutan Lagu");
    System.out.println("1. Masukkan Lagu");
    System.out.println("2. Menghapus Lagu");
    System.out.println("3. Mulai Lagu");
    System.out.println("4. Keluar");

    }
}
