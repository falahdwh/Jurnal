package DoList;
import java.util.*;

public class LinkedQueueImplement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = 'Y';
        linkedQueue linkQueue = new linkedQueue();

        System.out.println("\n\t\tTo-Do List Apps");
        System.out.println("\t\t--Pilihan Menu--");
        System.out.println("1. Tambah Nama Pekerjaan");
        System.out.println("2. Hapus Pekerjaan Yang Sudah Selesai");
        System.out.println("3. Lihat Data Terdepan");
        System.out.println("4. Status Empty Nama Pekerjaan");
        System.out.println("5. Status Jumlah Data\n");
        while (ch == 'Y' || ch == 'y') {
            System.out.print("Pilih Menu :  ");
            int Pilih = in.nextInt();
            switch (Pilih){
                case 1:
                    System.out.print("Masukan Nama Pekerjaan : ");
                    linkQueue.insert(in.next());
                    break;
                case 2:
                    try {
                        System.out.println("Removed Element = " + linkQueue.remove());
                    }
                    catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Peek Element = " + linkQueue.peek());
                    }
                    catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Empty status = " + linkQueue.isEmpty());
                    break;
                case 5:
                    System.out.println("Size = " + linkQueue.getSize());
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            // display queue
            linkQueue.display();

            System.out.print("\nApakah Ingin Melanjutkan ( 'Y' Atau 'N') : ");
            ch = in.next().charAt(0);
        }
    }
}


