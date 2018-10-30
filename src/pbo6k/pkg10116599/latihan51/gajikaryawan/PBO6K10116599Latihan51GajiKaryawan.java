/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author eka
 */
public class PBO6K10116599Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Inisialisasi
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        
        Perhitungan perhitungan = new Perhitungan();
        Identitas identitas = new Identitas();

        System.out.println("====Program Perhitungan Gaji KAryawan====");
        System.out.print("Masukkan NIK\t: ");
        int nik = scan.nextInt();
        perhitungan.setNik(nik);

        System.out.print("Masukkan Nama\t: ");
        String nama = scan2.nextLine();
        identitas.setNama(nama);

        System.out.print("Masukkan Golongan (1/2/3) : ");
        int golongan = scan3.nextInt();
        perhitungan.setGolongan(golongan);

        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        String jabatan = scan4.next();
        perhitungan.setJabatan(jabatan);

        System.out.print("Masukkan jumlah kehadiran : ");
        int kehadiran = scan5.nextInt();
        perhitungan.setKehadiran(kehadiran);

        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t: " + perhitungan.getNik());
        System.out.println("Nama\t: " + identitas.getNama());
        System.out.println("GOLONGAN\t: " + perhitungan.getGolongan());
        System.out.println("JABATAN\t:" + perhitungan.getJabatan());
        
        System.out.println();
        System.out.println("TUNJANGAN GOLONGAN : " +perhitungan.getTunjanganGolongan());

    }

}
