/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusktp;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class nonvoid {
    String nama, alamat, ttl,provinsi, kota,jeniskelamin, keldes, kecamatan, agama, statusperkawinan,
                pekerjaan, kewarganegaraan, berlakuhingga, nik, rt, rw;
    int umur;
    String judul = "KTP SEDERHANA";
    String judul (){
        return judul;
    }
    void biodata(){
        System.out.println("ISI BIODATA BERIKUT");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan asal provinsi = ");
        provinsi = input.nextLine();
        System.out.println("Masukkan asal kota = ");
        kota = input.nextLine();
        System.out.println("Masukkan NIK = ");
        nik = input.nextLine();
        System.out.println("Masukkan nama = ");
        nama = input.nextLine();
        System.out.println("Masukkan tempat tanggal lahir = ");
        ttl = input.nextLine();
        System.out.println("Masukkan alamat = ");
        alamat = input.nextLine();
        System.out.println("Masukkan RT = ");
        rt = input.nextLine();
        System.out.println("Masukkan RW = ");
        rw = input.nextLine();
        System.out.println("Masukkan Kel/desa = ");
        keldes = input.nextLine();
        System.out.println("Masukkan kecamatan = ");
        kecamatan = input.nextLine();
        System.out.println("Masukkan agama = ");
        agama = input.nextLine();
        System.out.println("Masukkan Status perkawinan = ");
        statusperkawinan = input.nextLine();
        System.out.println("Masukkan Pekerjaan = ");
        pekerjaan = input.nextLine();
        System.out.println("Masukkan kewarganegaraan = ");
        kewarganegaraan = input.nextLine();
    }
    String akhiran;
    String akhiran(){
        akhiran = "Trimakasih telah mengisi data diri anda";
        return akhiran;
    }
    void datadiri(){
        System.out.println("KARTU TANDA PENDUDUK");
        System.out.println("Provinsi = "+provinsi);
        System.out.println("Kota = "+kota);
        System.out.println("NIK = "+nik);
        System.out.println("Nama = "+nama);
        System.out.println("Tempat Tanggal Lahir = "+ttl);
        System.out.println("Alamat = "+alamat);
        System.out.println("RT / RW = "+rt+"/"+rw);
        System.out.println("Kel/Desa = "+keldes);
        System.out.println("Kecamatan = "+kecamatan);
        System.out.println("Agama = "+agama);
        System.out.println("Status Perkawinan = "+statusperkawinan);
        System.out.println("Pekerjaan = "+pekerjaan);
        System.out.println("Kewarganegaraan = "+kewarganegaraan);
        }
    String berlaku;
    String berlaku(){
        berlaku = "Berlaku Seumur Hidup";
                return berlaku;
    }
}
