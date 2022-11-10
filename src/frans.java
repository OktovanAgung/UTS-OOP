import java.util.Scanner;

class Pembuka{
    String judul;

    Pembuka(String judul){
        this.judul = judul;
    }

    void tampil(){
        System.out.println(this.judul);
    }

}

class Dosen{
    int kedudukan;
    String nama;
    String NIM;
    int usia;
    String alamat;
    String agama;
    String JenisKelamin;


    void method(){
        System.out.println("Masukkan Data Diri");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = keyboard.nextLine();
        System.out.print("NIM: ");
        NIM = keyboard.nextLine();
        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();
        System.out.print("Agama: ");
        agama = keyboard.nextLine();
        System.out.print("Jenis Kelamin: ");
        JenisKelamin = keyboard.nextLine();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        System.out.println("Halo " + nama + " Selamat Datang di Perpustakaan Universitas Pelita Bangsa");

    }
    void tampil(){
        System.out.println("\n\nNama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Alamat: " + alamat);
        System.out.println("Agama: " + agama);
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("Usia: " + usia);

    }

}

class Mahasiswa{
    int kedudukan;
    String nama;
    String NIM;
    String prodi;
    String alamat;
    String jurusan;
    int usia;
    String agama;
    String JenisKelamin;

    void method2(){
        System.out.println("Masukkan Data Diri:");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama: ");
        nama = keyboard.nextLine();
        System.out.print("NIM: ");
        NIM = keyboard.nextLine();
        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();
        System.out.print("Fakultas: ");
        jurusan = keyboard.nextLine();
        System.out.print("Agama: ");
        agama = keyboard.nextLine();
        System.out.print("Prodi: ");
        prodi = keyboard.nextLine();
        System.out.print("Jenis Kelamin: ");
        JenisKelamin = keyboard.nextLine();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        System.out.println("\nHalo " + nama + " Selamat Datang di Perpustakaan Universitas Pelita Bangsa\n\n");

    }
    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Alamat: " + alamat);
        System.out.println("Fakultas: " + jurusan);
        System.out.println("Prodi: " + prodi);
        System.out.println("Agama: " + agama);
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("Usia: " + usia);

    }

}

class BukuIT{
    String masukan;

    void method3(){
        System.out.println("\n\nKumpulan Buku IT");
        System.out.println("1. The Pragmatic Programmer: Your Journey to Mastery, 1999, Andrew Hunt, David Thomas ");
        System.out.println("2. Structure and Interpretation of Computer Programs, 1992, Harold Abelson, Gerald Jay Sussman, Julie Sussman");
        System.out.println("3. Code Complete: A Practical Handbook of Software Construction, 1995, Steve McConnel");
        System.out.println("4. Clean Code: A Handbook of Agile Software Craftsmanship, 2001, Robert C. Martin");
        System.out.println("5. Introduction to Algorithms 1889, Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, Clifford Stein");
        System.out.println("6. Peopleware: Productive Projects and Teams, 1990, Tom DeMarco, Tim Lister");
        System.out.println("7. Rapid Development: Taming Wild Software Schedules, 2001, Steve McConnel");
        System.out.println("8. The Self-Taught Programmer: The Definitive Guide to Programming Professionally, 2005, Cory Althoff");
        System.out.println("9. HTML and CSS: Design and Build Websites, 1999, Jon Duckett");
        System.out.println("10. Eloquent JavaScript: A Modern Introduction to Programming, 2000, Marijn Haverbeke");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Buku: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class BukuEkonomi{
    String masukan;

    void method4(){
        System.out.println("\n\nKumpulan Buku Ekonomi");
        System.out.println("1. Ekonomi Mikro, 2019, R. Misriah Ariyani");
        System.out.println("2. Ekonomi Makro, 2016, Nursalam, S.P., M.Si");
        System.out.println("3. Pengantar Ilmu Ekonomi, 2008, Jimmy Hasoloan, Drs, M.M.");
        System.out.println("4. Pengantar Ekonomi Pembangunan, 2000, Aris Triyono, S.E., M.M.");
        System.out.println("5. Pengantar Ekonomi Politik, 1998, Dr. Ir. Dyanasari, MBA.");
        System.out.println("6. Pengantar Bisnis, 2002, Drs. H. Agus Thoha, M.Si.");
        System.out.println("7. Pengantar Hukum Bisnis, 2001, Wiyanto");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Buku: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);

    }

}

class BukuPsikologi{
    String masukan;

    void method5(){
        System.out.println("\n\nKumpulan Buku Psikologi");
        System.out.println("1. Psikologi Industri dan Organisasi, 2000,  Hany Azza Umama, S.E., M.M.");
        System.out.println("2. Warna-Warni Psikologi Untuk Negeri: Pemikiran Dan Aplikasinya, 2000, Tim Pengajar Fakultas Psikologi Universitas Yarsi.");
        System.out.println("3. Bimbingan dan Konseling Belajar, 2001, Abdul Saman, Ph.D., Kons. dan Agustan Arifin M.Pd.");
        System.out.println("4. Psikologi Pedidikan, 1998, Mahsup, S,Pd., M.Pd dan Yunita Septriana Anwar, S.Pd., M.Sc.");
        System.out.println("5. Psikologi Belajar, 2002, Dr. Afi Parnawi, M.Pd,");
        System.out.println("6. Psikologi Komunikasi, 2000, Markus Utomo Sukendar, S.Sos, M.I.Kom.");
        System.out.println("7. Manusia Dalam Pandangan Psikologi, 2004, Pasiska, M.A.Takdir Alisyahbana, M.Pd.I.");
        System.out.println("8. Psikologi Kepribadian, 1999, ALWISOL");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Buku: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);

    }

}

class BukuPolitik{
    String masukan;

    void method6() {
        System.out.println("\n\nKumpulan Buku Politik");
        System.out.println("1. Politik dan Kebebasan, 2013, Tom G. Palmer");
        System.out.println("2. Mengenal Orde Baru, 2021, Dhianita Kusuma Pertiwi");
        System.out.println("3. Genealogi Hoaks Indonesia, 2021, Rony K. Pratama");
        System.out.println("4. Negeri Para Jenderal, 2019, Petrik Matanasi");
        System.out.println("5. Politik Sirkulasi Budaya Pop: Media Baru, Pelintiran Agama, dan Pergeseran Otoritas , 2019, Wahyudi Akmaliah");
        System.out.println("6. Ada Apa dengan China: Esai-Esai Agama dan Politik China untuk Indonesia, 2019, Novi Basuki\n\n");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Buku: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }

}

class BukuMotivasi{
    String masukan;

    void method7(){
        System.out.println("\n\nKumpulan Buku Motivasi");
        System.out.println("1. Think and Grow Rich, 1937, Napoleon Hill");
        System.out.println("2. The 7 Habits of Highly Effective People, 1989, Stephen R Covey");
        System.out.println("3. The Power of Positive Thinking, 1952, Norman Vincent");
        System.out.println("4. Mestakung, 1992, Prof. Yohanes Surya");
        System.out.println("5. How to Win Friends and Influence People, 1935, Dale Carnegie");
        System.out.println("6. Man's Search for Meaning, 2000, Victor E. Fankl");
        System.out.println("7. The Four Agreement , 2001, Don Miquel Ruiz");
        System.out.println("8. Mindset: the New Psychology for Success, 2000, Karya Carol  S. Dweck");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama Buku: ");
        masukan = keyboard.nextLine();
        System.out.println(masukan);
    }
}

class Pemilihan {
    int pilihan;

    void method() {
        System.out.println("\n\nPilihan Buku yang Tersedia");
        System.out.println("1. Buku IT");
        System.out.println("2. Buku Ekonomi");
        System.out.println("3. Buku Psikologi");
        System.out.println("4. Buku Politik");
        System.out.println("5. Buku Motivasi");
        System.out.print("Masukan Nomor Buku yang Ingin di Pinjam: ");
        Scanner keyboard = new Scanner(System.in);
        pilihan = keyboard.nextInt();
        switch (pilihan) {
            case 1:
                BukuIT cetak1 = new BukuIT();
                cetak1.method3();
                break;

            case 2:
                BukuEkonomi cetak2 = new BukuEkonomi();
                cetak2.method4();
                break;
            case 3:
                BukuPsikologi cetak3 = new BukuPsikologi();
                cetak3.method5();
                break;

            case 4:
                BukuPolitik cetak4 = new BukuPolitik();
                cetak4.method6();
                break;

            case 5:
                BukuMotivasi cetak5 = new BukuMotivasi();
                cetak5.method7();
                break;
            default:
                System.out.println("Input yang anda Masukkan Salah");
        }

    }
}

class pengembalian{
    String pemulangan;

    void method(){
        System.out.print("\nMasukan Tanggal Pengembalian: ");
        Scanner keyboard = new Scanner(System.in);
        pemulangan = keyboard.nextLine();
        System.out.println("Tanggal Pengembalian " + pemulangan);
    }
}

class penutup{
    String salam;

    penutup(String salam){

        this.salam = salam;
    }
    void method(){

        System.out.println(this.salam);
    }
}

public class frans {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        Mahasiswa frans = new Mahasiswa();
        pengembalian cetak = new pengembalian();
        Pembuka print = new Pembuka("APLIKASI PEMINJAMAN BUKU PERPUSTAKAAN");
        penutup salam = new penutup("Trimakasih Telah Berkunjung di Perpustakaan Universitas Pelita Bangsa, Sampai Jumpa Kembali");
        Pemilihan pilih = new Pemilihan();
        Scanner keyboard = new Scanner(System.in);

        //Ekseskusi Program
        print.tampil();
        System.out.println("Pilih Jabatan ");
        System.out.println("1. Dosen");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan : ");
        int kedudukan;
        int jumlah;
        String pengembalian;
        kedudukan = keyboard.nextInt();
        switch (kedudukan) {
            case 1:
                dosen1.method();
                System.out.print("Masukkan Jumlah Buku yang Ingin di Pinjam: ");
                jumlah = keyboard.nextInt();
                for (int i=1; i<=jumlah; i++) {
                    pilih.method();
                }
                cetak.method();
                dosen1.tampil();
                System.out.println("Jumlah Buku yang dipinjam: " + jumlah + " Buku");
                salam.method();
                break;

            case 2:
                frans.method2();
                System.out.print("Masukkan Jumlah Buku yang Ingin di Pinjam: ");
                jumlah = keyboard.nextInt();
                for (int i=1; i<=jumlah; i++) {
                    pilih.method();
                }
                cetak.method();
                frans.tampil();
                System.out.println("Jumlah Buku yang dipinjam: " + jumlah + " Buku");
                salam.method();
                break;

            default:
                System.out.println("Input yang anda Masukkan Salah");
        }
    }
}









