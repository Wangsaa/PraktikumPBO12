/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum12_wangsa;

/**
 *
 * @author Praktikan
 */
import java.util.ArrayList;
public class Praktikum12_wangsa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        ArrayList<Integer> nilai = new ArrayList<Integer>();
//        nilai.add(70);
//        nilai.add(75);
//        nilai.add(80);
//        System.out.println(nilai);
        
        Mahasiswa mhs1 = new Mahasiswa ("Wangsa","2117051086", nilai);
        System.out.println("Nilai Rata-Rata :" +mhs1.nilaiRataRata());
        mhs1.setNilai(nilai);
        System.out.println("Nilai Rata-Rata :" + mhs1.nilaiRataRata());
    }
    
}
