package com.mycompany1.app;

public class LatihanOverloadingConstructor{
    public static void main(String[] args){
        Mahasiswa mah1 = new Mahasiswa();
        mah1.setDataMahasiswa("Albert","Unklab",28);
        mah1.tampil();
        Mahasiswa mah2 = new Mahasiswa();
        mah2.setDataMahasiswa("Jacks","Unklab",29);
        mah2.tampil();
        Mahasiswa mah3 = new Mahasiswa();
        mah3.setDataMahasiswa("alex","Unklab",29);
        mah3.tampil();
    }
}
class Mahasiswa{
    private String nama;
    private String alamat;
    private int umur;

    public Mahasiswa(){
        System.out.println("Tanpa Parameter\n");
    }
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    public Mahasiswa(int umur){
        this.umur = umur;
    }
    public Mahasiswa(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    public void tampil(){
        System.out.println("Nama = "+this.nama);
        System.out.println("Alamat = "+this.alamat);
        System.out.println("Umur = "+this.umur);
    }
    public void setDataMahasiswa(String nama, String alamat, int umur){
        this.nama = nama;
        this.alamat= alamat;
        this.umur = umur;
    }
}