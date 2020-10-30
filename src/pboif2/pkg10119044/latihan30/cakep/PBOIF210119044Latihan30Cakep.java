/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan30.cakep;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan pilihan apakah user
 * mengerjakan latihan 17 sampai 30 sendiri atau tidak.
 */


public class PBOIF210119044Latihan30Cakep {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jawab;
        
        //kode ANSI warna
        String merah = "\u001b[31m";
        String hijau = "\u001b[32m";
        String kuning = "\u001b[33m";
        String biru = "\u001b[34m";
        String ungu = "\u001b[35m";
        String cyan = "\u001b[36m";
        
        System.out.println(merah+"Kamu "+hijau+"ngerjain sendiri "+kuning+"latihan 17 sampe "+biru+"latihan 30 ini?");
        System.out.print(biru+"Jawab "+merah+"(Yoi/Enggak) : ");
        jawab = input.next();
        
        if("Yoi".equals(jawab) || "YOI".equals(jawab) || "yoi".equals(jawab)) {
                System.out.println();
                System.out.println(merah+"Cakep Bener. "+ungu+"Good Job");
            } else {
                    System.out.println();
                    System.out.println(merah+"Tetep cakep sih.");
                    System.out.println(cyan+"Sing penting paham konsep nya yee.");
                    System.out.println("Keep the code works dude");
            }    
    }
    
}
