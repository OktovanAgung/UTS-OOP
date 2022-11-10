/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Peminjaman {

    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public Peminjaman() {
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);

        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);

        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);

        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }

    public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, Buku buku, Laporan laporan) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan meminjam");
        System.out.println("=================");
        System.out.print("Masukkan ID Siswa: ");
        int idSiswa = myObj.nextInt();

        System.out.println("Selamat datang " + siswa.getNama(idSiswa));

        //menyimpan data sementara untuk bisa meminjam banyak buku berkali - kali
        ArrayList<Integer> idBuku = new ArrayList<Integer>();// 0=1
        ArrayList<Integer> banyak = new ArrayList<Integer>();// 0=2

        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode buku : or end file : 99");
            temp = myObj.nextInt();//1
            if (temp != 99) {
                idBuku.add(temp);
                System.out.print(buku.getNamaBuku(idBuku.get(i)) + " sebanyak: ");
                banyak.add(myObj.nextInt());//2

                if (banyak.get(i) > buku.getStok(idBuku.get(i))) {
                    System.out.println("Sisa stok buku tidak mencukupi");
                    System.out.println("Silahkan Mengisi Ulang Datanya");
                    this.prosesPeminjaman(siswa, peminjaman, buku, laporan);
                }
                i++;
            }
        } while (temp != 99);

        System.out.println();
        System.out.println("<<< Transaksi pinjam " + siswa.getNama(idSiswa) + " sebagai berikut : >>>");
        System.out.println("Nama Barang   \tQty   \tHarga   \tJumlah \t");

        int total = 0;
        int x = idBuku.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
            total += jumlah;
            System.out.println(buku.getNamaBuku(idBuku.get(j)) + "\t"
                    + banyak.get(j) + "\t"
                    + buku.getHarga(idBuku.get(j)) + "\t\t"
                    + jumlah);
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
        }

        System.out.println("Total Peminjaman Buku : " + total);

        siswa.editStatus(idSiswa, siswa.getStatus(idSiswa) == false);
        System.out.println("Status " + siswa.getNama(idSiswa) + " = " + siswa.getStatus(idSiswa));
        if (siswa.getStatus(idSiswa) == true) {
            System.out.println("Dapat meminjam");
        } else {
            int answer;
            do {
                System.out.println("============================================");
                System.out.println("1 ---> Yes");
                System.out.println("2 ---> No");
                System.out.print("Apakah anda ingin mengembalikan : ");
                answer = myObj.nextInt();

                if (answer == 1) {
                    siswa.editStatus(idSiswa, true);
                    System.out.println("Status " + siswa.getNama(idSiswa) + " = " + siswa.getStatus(idSiswa));
                    for (int j = 0; j < x; j++) {
                        peminjaman.setPengembalian(buku, idSiswa, idBuku.get(j), banyak.get(j));
                    }

                } else {
                    System.out.println("Anda Belum Mengembalikan Buku");
                    laporan.laporan(buku);
                    laporan.laporan(siswa);
                }
            } while (answer == 2);
        }
    }

    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyaknya) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyaknya);
    }

    public void setPengembalian(Buku buku, int idSiswa, int idBuku, int banyaknya) {
        //this.idSiswa.add(idSiswa);
        //this.idBuku.add(idBuku);
        //this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) + banyaknya);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    public int getJmlPeminjaman() {
        return this.idSiswa.size();
    }
}
