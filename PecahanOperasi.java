// File: PecahanOperasi.java
import java.util.Scanner;

class Pecahan {
    int pembilang;
    int penyebut;

    // Konstruktor
    Pecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    // Menyederhanakan pecahan
    void sederhanakan() {
        int fpb = gcd(pembilang, penyebut);
        pembilang /= fpb;
        penyebut /= fpb;
    }

    // Menghitung FPB
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Operasi penjumlahan
    Pecahan tambah(Pecahan p) {
        int pb = this.pembilang * p.penyebut + p.pembilang * this.penyebut;
        int py = this.penyebut * p.penyebut;
        Pecahan hasil = new Pecahan(pb, py);
        hasil.sederhanakan();
        return hasil;
    }

    // Operasi pengurangan
    Pecahan kurang(Pecahan p) {
        int pb = this.pembilang * p.penyebut - p.pembilang * this.penyebut;
        int py = this.penyebut * p.penyebut;
        Pecahan hasil = new Pecahan(pb, py);
        hasil.sederhanakan();
        return hasil;
    }

    // Operasi perkalian
    Pecahan kali(Pecahan p) {
        int pb = this.pembilang * p.pembilang;
        int py = this.penyebut * p.penyebut;
        Pecahan hasil = new Pecahan(pb, py);
        hasil.sederhanakan();
        return hasil;
    }

    // Operasi pembagian
    Pecahan bagi(Pecahan p) {
        int pb = this.pembilang * p.penyebut;
        int py = this.penyebut * p.pembilang;
        Pecahan hasil = new Pecahan(pb, py);
        hasil.sederhanakan();
        return hasil;
    }

    // Tampilkan hasil
    void tampil() {
        System.out.println(pembilang + "/" + penyebut);
    }
}

public class PecahanOperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan pecahan pertama:");
        System.out.print("Pembilang: ");
        int a1 = input.nextInt();
        System.out.print("Penyebut: ");
        int b1 = input.nextInt();

        System.out.println("Masukkan pecahan kedua:");
        System.out.print("Pembilang: ");
        int a2 = input.nextInt();
        System.out.print("Penyebut: ");
        int b2 = input.nextInt();

        Pecahan p1 = new Pecahan(a1, b1);
        Pecahan p2 = new Pecahan(a2, b2);

        System.out.println("\nHasil Operasi Pecahan:");
        System.out.print("Penjumlahan: ");
        p1.tambah(p2).tampil();

        System.out.print("Pengurangan: ");
        p1.kurang(p2).tampil();

        System.out.print("Perkalian: ");
        p1.kali(p2).tampil();

        System.out.print("Pembagian: ");
        p1.bagi(p2).tampil();
    }
}
