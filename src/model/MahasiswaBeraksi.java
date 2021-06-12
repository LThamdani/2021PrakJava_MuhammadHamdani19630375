package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.npm = "19630375";
        mahasiswa.nama = "awal";
        mahasiswa.tangallahir = new Date();

        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tangallahir);
    }
}
