/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latian;

/**
 *
 * @author LENOVO
 */
public class Siswa {
    
    
    String nama ="Rayhan";
    String alamat = "Perumahan PI Dringu";
    int umur = 17;
    int beratBadan = 45;
    String hobi = "main game";

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    public String getHobi() {
        return hobi;
    }
    
}
