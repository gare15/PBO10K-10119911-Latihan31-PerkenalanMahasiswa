/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k;

/**
 *
 * @author tegar
 */
public class perkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mhs1 = new mahasiswa();
        mahasiswa mhs2 = new mahasiswa();
        mahasiswa mhs3 = new mahasiswa();
        mahasiswa mhs4 = new mahasiswa();
        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs2.nim = "10112270";
        mhs2.nama = "Indra Tiola";
        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tansil Ganefi";
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awaludin";
        mhs1.pekenalkanMhs();
        mhs2.pekenalkanMhs();
        mhs3.pekenalkanMhs();
        mhs4.pekenalkanMhs();
    }
    
}
