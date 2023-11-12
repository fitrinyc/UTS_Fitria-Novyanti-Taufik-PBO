/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2_UTS2;
import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Buku> books = new ArrayList<>();

    public void addBook(Buku book) {
        books.add(book);
    }

    public void deleteBook(Admin admin, Buku book) {
        if (admin != null) {
            books.remove(book);
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Hanya admin yang dapat menghapus buku.");
        }
    }

    public void viewBooks(User user) {
        System.out.println("Daftar Buku:");
        for (Buku book : books) {
            System.out.println("Judul: " + book.getTitle() + ", Kategori: " + book.getCategory());
        }
    }

    public Buku findBook(String title) {
        for (Buku book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
}
