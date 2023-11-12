/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal2_UTS2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Buku> books = new ArrayList<>();

        boolean harusRestart = true;

        while (harusRestart) {
            System.out.print("Masukkan jenis pengguna (Admin/User): ");
            String userType = scanner.next();

            String lowercaseUserType = userType.toLowerCase();

            switch (lowercaseUserType) {
                case "admin":
                    Admin admin = new Admin("admin_user");
                    boolean adminMenu = true;

                    while (adminMenu) {
                        System.out.println("1. Lihat Buku");
                        System.out.println("2. Tambah Buku");
                        System.out.println("3. Hapus Buku");
                        System.out.println("4. Selesai (Kembali ke Pemilihan Jenis Pengguna)");

                        System.out.print("Pilih menu: ");
                        int adminChoice = scanner.nextInt();

                        switch (adminChoice) {
                            case 1:
                                lihatBuku(books);
                                break;
                            case 2:
                                tambahBuku(scanner, books);
                                break;
                            case 3:
                                hapusBuku(scanner, books);
                                break;
                            case 4:
                                adminMenu = false;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;
                case "user":
                    User user = new User("fitri_novi");
                    lihatBuku(books);
                    break;
                default:
                    System.out.println("Jenis pengguna tidak dikenal.");
            }

            System.out.print("Apakah Anda ingin menjalankan program lagi? (Ya/Tidak): ");
            String restartInput = scanner.next();

            harusRestart = restartInput.equalsIgnoreCase("Ya");
        }

        System.out.println("Terima kasih! Program berakhir.");
    }

    private static void lihatBuku(List<Buku> books) {
        System.out.println("Daftar Buku:");
        for (Buku book : books) {
            System.out.println("Judul: " + book.getTitle() + ", Kategori: " + book.getCategory());
        }
    }

    private static void tambahBuku(Scanner scanner, List<Buku> books) {
        System.out.print("Masukkan judul buku: ");
        scanner.nextLine(); 
        String bookTitle = scanner.nextLine();
        System.out.print("Masukkan kategori buku: ");
        String bookCategory = scanner.nextLine();
        Buku newBook = new Buku(bookTitle, bookCategory);
        books.add(newBook);
        System.out.println("Buku berhasil ditambahkan!");
    }

    private static void hapusBuku(Scanner scanner, List<Buku> books) {
        System.out.print("Masukkan judul buku yang akan dihapus: ");
        scanner.nextLine(); 
        String titleToDelete = scanner.nextLine();
        Buku bookToDelete = cariBuku(books, titleToDelete);
        if (bookToDelete != null) {
            books.remove(bookToDelete);
            System.out.println("Buku berhasil dihapus!");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    private static Buku cariBuku(List<Buku> books, String title) {
        for (Buku book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}


