package latihan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution1 {
	static ArrayList listLatihan = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException{
        
        System.out.println("========= MENU========");
        System.out.println("[1] Show All Latihan");
        System.out.println("[2] Persegi Panjang");
        System.out.println("[3] Volume Kubus");
        System.out.println("[0] Exit");
        System.out.print("PILIH MENU> ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                showAllLatihan();
                break;
            case 2:
            	persegipanjang();
                break;
            case 3:
            	volumekubus();
                break;
            
            case 0:
                //System.exit(0);
                System.out.println("Pak Riki, Anda Sudah Keluar Dari Menu!");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Pak Riki salah, Tidak ada didalam list Menu!");
                     
        }       
       
    }

    static void showAllLatihan(){
        if(listLatihan.isEmpty()){
           //System.out.println("Belum ada data");
        } else {
             // tampilkan semua latihan dari pak riki
            for(int i = 0; i < listLatihan.size(); i++){
                System.out.println(String.format("[%d] %s",i, listLatihan.get(i)));
            }
        }
    }
    
    static void persegipanjang() throws IOException{
    	 Scanner input=new Scanner(System.in);

         int panjang, lebar, luas;	
       
         System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
         System.out.println("-----------------------------------------------");

         System.out.print("Masukan Panjang      : ");
         panjang=input.nextInt();
         System.out.print("Masukan Lebar        : ");
         lebar=input.nextInt();
         
         System.out.println("Processing .....");
         
         luas=panjang*lebar;

         System.out.println("Luas Persegi Panjang adalah: "+luas);
    }
    
    static void volumekubus() throws IOException{
    	Scanner input=new Scanner(System.in);

        int panjang, lebar,tinggi, volume;	
      
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS Volume Kubus : ");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukan Panjang      : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar        : ");
        lebar=input.nextInt();
        
        System.out.print("Masukan tinggi       : ");
        tinggi=input.nextInt();
        
        System.out.println("Processing .....");
        
        volume=panjang*lebar*tinggi;

        System.out.println("Luas volume kubus adalah: "+volume);
              
    }   
    
    public static void main(String[] args) throws IOException {
        
        do {
            showMenu();
        } while (isRunning);
        
    }
    
}