//*Nama: Rangga Waskita Dewa
//* NIM: 20051397055
//*Prodi/Kelas: Manajemen Informatika/2020A
//*Mata Kuliah:Praktik Pemrograman Dasar

package rangga;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import rangga.waskita;
  
 public class waskita {
  double hasil;
  double a = 0;
  double b = 0;
  double c = 0;
  Scanner scan = new Scanner(System.in);
  protected void sisiMiring(){
    System.out.println(" ");
    System.out.print("Masukan nilai sisi a: ");
    a = scan.nextDouble();
    System.out.print("Masukan nilai sisi b: ");
    b = scan.nextDouble();
    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    System.out.println("Sisi miring: "+c);
    System.out.println(" ");
  }
  protected void keliling(){
    System.out.println(" ");
    System.out.print("Masukan nilai sisi pertama: ");
    a = scan.nextDouble();
    System.out.print("Masukan nilai sisi kedua: ");
    b = scan.nextDouble();
    System.out.print("Masukan nilai sisi ketiga: ");
    c = scan.nextDouble();
    hasil = a+c+b;
    System.out.println("Keliling: "+hasil);
    System.out.println(" ");
  }
  protected void luas(){
    System.out.println(" ");
    System.out.print("Masukan nilai sisi a: ");
    a = scan.nextDouble();
    System.out.print("Masukan nilai sisi b: ");
    b = scan.nextDouble();
    c = (a*b)/2;
    System.out.println("Luas: "+c);
    System.out.println(" ");
  }
  public static void main(String[] args){
    waskita h = new waskita();
    int i = 1;
    System.out.println("Rangga Waskita Dewa");
    System.out.println("20051397055");
    System.out.println(" ");
    System.out.println("Selamat Datang di Aplikasi Menghitung Segitiga!");
    while(i > 0){
      System.out.println("Pilih menu :");
      System.out.println("0. Exit");
      System.out.println("1. Sisi miring");
      System.out.println("2. Luas");
      System.out.println("3. Keliling");
      try{
        System.out.print("Ketik menu : ");
        i = h.scan.nextInt();
      }catch(InputMismatchException IME){
        System.out.print("Input tidak benar!");
        break;
      }
      switch(i){
        case 0:
        System.out.println("Terima kasih telah menggunakan aplikasi ini!");
        break;
        case 1:
        h.sisiMiring();
        break;
        case 2:
        h.luas();
        break;
        case 3:
        h.keliling();
        break;
      }
    }
  }
}