/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol;

import java.util.ArrayList;

/**
 *
 * @author MOKLET-2
 */
public class Petugas implements User {

    //deklarasi -- inisialisasi
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

//menambahkan data
    public Petugas() {
        this.namaPetugas.add("admin");
        this.alamat.add("kedung kandang");
        this.telepon.add("081112223333");
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
//implementasi dari class interface(User)

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return this.telepon.get(idPetugas);
    }

}
