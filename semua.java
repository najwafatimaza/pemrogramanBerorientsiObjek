class BangunDatarTigaDimensi {

    // ====================== 1. PERSEGI PANJANG ======================
    static class PersegiPanjang {
        static double panjang, lebar;

        static void setData(double p, double l) {
            panjang = p;
            lebar = l;
        }

        static double hitungLuas() {
            return panjang * lebar;
        }

        static double hitungKeliling() {
            return 2 * (panjang + lebar);
        }

        static void tampilkanData() {
            System.out.println("Persegi Panjang -> Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling());
        }
    }

    // ====================== 2. LINGKARAN ======================
    static class Lingkaran {
        static double jariJari;

        static void setData(double r) {
            jariJari = r;
        }

        static double hitungLuas() {
            return Math.PI * jariJari * jariJari;
        }

        static double hitungKeliling() {
            return 2 * Math.PI * jariJari;
        }

        static void tampilkanData() {
            System.out.println("Lingkaran -> Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling());
        }
    }

    // ====================== 3. BUJUR SANGKAR ======================
    static class BujurSangkar {
        static double sisi;

        static void setData(double s) {
            sisi = s;
        }

        static double hitungLuas() {
            return sisi * sisi;
        }

        static double hitungKeliling() {
            return 4 * sisi;
        }

        static void tampilkanData() {
            System.out.println("Bujur Sangkar -> Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling());
        }
    }

    // ====================== 4. BELAH KETUPAT ======================
    static class BelahKetupat {
        static double diagonal1, diagonal2, sisi;

        static void setData(double d1, double d2, double s) {
            diagonal1 = d1;
            diagonal2 = d2;
            sisi = s;
        }

        static double hitungLuas() {
            return (diagonal1 * diagonal2) / 2;
        }

        static double hitungKeliling() {
            return 4 * sisi;
        }

        static void tampilkanData() {
            System.out.println("Belah Ketupat -> Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling());
        }
    }

    // ====================== 5. SEGITIGA ======================
    static class Segitiga {
        static double alas, tinggi, sisi1, sisi2, sisi3;

        static void setData(double a, double t, double s1, double s2, double s3) {
            alas = a;
            tinggi = t;
            sisi1 = s1;
            sisi2 = s2;
            sisi3 = s3;
        }

        static double hitungLuas() {
            return (alas * tinggi) / 2;
        }

        static double hitungKeliling() {
            return sisi1 + sisi2 + sisi3;
        }

        static void tampilkanData() {
            System.out.println("Segitiga -> Luas: " + hitungLuas() + ", Keliling: " + hitungKeliling());
        }
    }

    // ====================== 6. KUBUS ======================
    static class Kubus {
        static double sisi;

        static void setData(double s) {
            sisi = s;
        }

        static double hitungVolume() {
            return sisi * sisi * sisi;
        }

        static double hitungLuasPermukaan() {
            return 6 * sisi * sisi;
        }

        static void tampilkanData() {
            System.out.println("Kubus -> Volume: " + hitungVolume() + ", Luas Permukaan: " + hitungLuasPermukaan());
        }
    }

    // ====================== 7. BALOK ======================
    static class Balok {
        static double panjang, lebar, tinggi;

        static void setData(double p, double l, double t) {
            panjang = p;
            lebar = l;
            tinggi = t;
        }

        static double hitungVolume() {
            return panjang * lebar * tinggi;
        }

        static double hitungLuasPermukaan() {
            return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        }

        static void tampilkanData() {
            System.out.println("Balok -> Volume: " + hitungVolume() + ", Luas Permukaan: " + hitungLuasPermukaan());
        }
    }

    // ====================== 8. KERUCUT ======================
    static class Kerucut {
        static double jariJari, tinggi;

        static void setData(double r, double t) {
            jariJari = r;
            tinggi = t;
        }

        static double hitungVolume() {
            return (1.0 / 3) * Math.PI * jariJari * jariJari * tinggi;
        }

        static double hitungLuasPermukaan() {
            double sisiMiring = Math.sqrt((jariJari * jariJari) + (tinggi * tinggi));
            return Math.PI * jariJari * (jariJari + sisiMiring);
        }

        static void tampilkanData() {
            System.out.println("Kerucut -> Volume: " + hitungVolume() + ", Luas Permukaan: " + hitungLuasPermukaan());
        }
    }

    // ====================== 9. BOLA ======================
    static class Bola {
        static double jariJari;

        static void setData(double r) {
            jariJari = r;
        }

        static double hitungVolume() {
            return (4.0 / 3) * Math.PI * Math.pow(jariJari, 3);
        }

        static double hitungLuasPermukaan() {
            return 4 * Math.PI * jariJari * jariJari;
        }

        static void tampilkanData() {
            System.out.println("Bola -> Volume: " + hitungVolume() + ", Luas Permukaan: " + hitungLuasPermukaan());
        }
    }

    // ====================== 10. SILINDER ======================
    static class Silinder {
        static double jariJari, tinggi;

        static void setData(double r, double t) {
            jariJari = r;
            tinggi = t;
        }

        static double hitungVolume() {
            return Math.PI * jariJari * jariJari * tinggi;
        }

        static double hitungLuasPermukaan() {
            return 2 * Math.PI * jariJari * (jariJari + tinggi);
        }

        static void tampilkanData() {
            System.out.println("Silinder -> Volume: " + hitungVolume() + ", Luas Permukaan: " + hitungLuasPermukaan());
        }
    }
public class semua {
    // ====================== MAIN (TESTER) ======================
    public static void main(String[] args) {
        System.out.println("=== HASIL PERHITUNGAN BANGUN DATAR DAN RUANG ===\n");

        PersegiPanjang.setData(10, 5);
        PersegiPanjang.tampilkanData();

        Lingkaran.setData(7);
        Lingkaran.tampilkanData();

        BujurSangkar.setData(6);
        BujurSangkar.tampilkanData();

        BelahKetupat.setData(10, 8, 7);
        BelahKetupat.tampilkanData();

        Segitiga.setData(8, 6, 5, 5, 6);
        Segitiga.tampilkanData();

        Kubus.setData(4);
        Kubus.tampilkanData();

        Balok.setData(10, 6, 4);
        Balok.tampilkanData();

        Kerucut.setData(7, 10);
        Kerucut.tampilkanData();

        Bola.setData(7);
        Bola.tampilkanData();

        Silinder.setData(7, 10);
        Silinder.tampilkanData();
    }
}
}