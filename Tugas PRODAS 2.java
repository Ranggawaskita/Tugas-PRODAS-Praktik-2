//*Nama: Rangga Waskita Dewa
//* NIM: 20051397055
//*Mata Kuliah:Praktik Pemrograman Dasar
package rangga;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import rangga.waskita;

public class waskita {
  String[] namaKaryawan = new String[99];
  String[] gol = new String[99];
  int[] gajiPekerja = new int[99];
  int[] jamKerjaKaryawan = new int[99];
  int[] jamLemburKaryawan = new int[99];
  int jamKerjaNormal = 48;
  int bbbbb = 0;
  String cetak = "";
  int x;
  Scanner scan = new Scanner(System.in);
  
  protected void karyawanBuildIn(){
    int jamKerja = 0;
    int gaji = 0;
    int jamLembur = 0;
    String golongan, nama;
    int pengulang = 1;
    
    System.out.println("Karyawan Build in!");
    while(pengulang == 1){
    System.out.println(" ");
    try{
      System.out.print("Buat karyawan lagi?");
      System.out.println(" ");
      System.out.println("0. Tidak");
      System.out.println("1. Ya");
      System.out.print("Pilih: ");
      pengulang = scan.nextInt();
      if(pengulang == 0)break ;
    }catch(InputMismatchException kl){
      System.out.println("Input tidak valid!");
    }
    System.out.println("=====================================");
      System.out.print("Masukan nama karyawan: ");
      nama = scan.next();
      System.out.print("Masukan golongan pekerja: ");
      golongan = scan.next();
      try{
        System.out.print("Masukan jumlah jam kerja karyawan: ");
        jamKerja = scan.nextInt();
      }catch(InputMismatchException j){
        System.out.println("Input tidak valid!");
      }
      try{
        System.out.print("Masukan jumlah jam lembur anda: ");
        jamLembur = scan.nextInt();
      }catch(InputMismatchException mc){
        System.out.println("Input tidak valid!");
      }

      int bonus = jamLembur * 4000;
      
      switch (golongan){
        case "A":
        gaji = (jamKerja * 5000) + bonus;
        System.out.println(nama+" memiliki gaji sejumlah "+gaji);
        break ;
        case "B":
        gaji = (jamKerja * 7000) + bonus;
        System.out.println(nama+" memiliki gaji sejumlah "+gaji);
        break ;
        case "C":
        gaji = (jamKerja * 8000) + bonus;
        System.out.println(nama+" memiliki gaji sejumlah "+gaji);
        break ;
        case "D":
        gaji = (jamKerja * 10000) + bonus;
        System.out.println(nama+" memiliki gaji sejumlah "+gaji);
        break ;
        default:
        System.out.println("Golongan pekerja "+golongan+" tidak ditemukan!");
        break ;
      }
      namaKaryawan[bbbbb] = nama;
      gajiPekerja[bbbbb] = gaji;
      jamKerjaKaryawan[bbbbb] = jamKerja;
      jamLemburKaryawan[bbbbb] = jamLembur;
      bbbbb++;
    }
  }
  public void daftarAllKaryawan(){
    int i;
    for(i=0;i<bbbbb;i++){
      System.out.println(
        (i+1)+". "+
        "Karyawan: "+
        namaKaryawan[i]+" | "+
        "Gaji: "+gajiPekerja[i]+" | "+
        "Jam kerja: "+jamKerjaKaryawan[i]
        +" | "+
        "Jam lembur: "+
        jamLemburKaryawan[i]
      );
    }
  }
  public static void main(String[] args) {
    waskita h = new waskita();
    int p = 1;
    int m = 0;
    System.out.println("Rangga Waskita Dewa");
    System.out.println("20051397055");
    System.out.println(" ");
    System.out.println("Selamat Datang di Aplikasi Pekerja Builder!");
    while(p == 1){
      System.out.println(" ");
      System.out.println("Pilih menu:");
      System.out.println("1. Buat pekerja baru");
      System.out.println("2. Tampilkan semua pekerja");
      try{
        System.out.print("Pilih: ");
      m = h.scan.nextInt();
      }catch(InputMismatchException io){
        System.out.println("Input tidak valid!");
      }
      switch (m){
        case 1:
        h.karyawanBuildIn();
        break;
        case 2:
        h.daftarAllKaryawan();
        break;
      }
    }
  }
}