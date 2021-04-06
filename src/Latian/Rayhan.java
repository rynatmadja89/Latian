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
public class Rayhan extends Siswa {
    public static void main(String[] args){
        
        
        Siswa baru = new Siswa();
        
        baru.setNama("Rayhan");
        baru.getNama();
        baru.setAlamat("Perumahan PPI");
        baru.getAlamat();
        baru.setHobi("Ngegame");
        baru.getHobi();
        baru.setBeratBadan(55);
        baru.getBeratBadan();
        baru.setUmur(17);
        baru.getUmur();
        
        
        System.out.println("Nama Siswa = " + baru.getNama());
        System.out.println("Alamat Siswa = " + baru.getAlamat());
        System.out.println("Hobi Siswa = " + baru.getHobi() );
        System.out.println("Berat Badan Siswa = " + baru.getBeratBadan());
        System.out.println("Umur siswa = " + baru.getUmur());
        
        //jarak
        
        System.out.println("=========================================================");
        
        baru.setNama("Rizky");
        baru.getNama();
        baru.setAlamat("Probolinggo");
        baru.getAlamat();
        baru.setHobi("Mencuri");
        baru.getHobi();
        baru.setBeratBadan(45);
        baru.getBeratBadan();
        
        System.out.println("Nama Teman = " + baru.getNama());
        System.out.println("Alamat Temann = " + baru.getAlamat());
        System.out.println("Hobi Teman = " + baru.getHobi());
        System.out.println("Berat Badan teman = " + baru.getBeratBadan());
    }
}
