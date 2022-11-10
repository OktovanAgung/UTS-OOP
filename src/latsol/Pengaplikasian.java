/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pengaplikasian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        System.out.println("Selamat Datang di Aplikasi Perpus Online");
        System.out.println();
        Scanner myObj = new Scanner(System.in);
        int temp = 0;

        do {
            Buku bk = new Buku();
            Siswa siswa1 = new Siswa();
            Petugas petugas1 = new Petugas();
            Peminjaman peminjaman1 = new Peminjaman();
            Laporan laporan1 = new Laporan();

            laporan1.laporan(bk);
            laporan1.laporan(siswa1);
            laporan1.laporan(peminjaman1, bk);

            peminjaman1.prosesPeminjaman(siswa1, peminjaman1, bk, laporan1);

            laporan1.laporan(bk);
            laporan1.laporan(siswa1);
            System.out.println("lanjutkan atau matikan 1 : 99");

            temp = myObj.nextInt();
        } while (temp != 99);

        System.exit(0);
    }
}
