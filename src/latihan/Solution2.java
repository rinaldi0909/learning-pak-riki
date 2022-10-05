package latihan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {

	static ArrayList listLatihan = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException{
        
        System.out.println("========= MENU========");
        System.out.println("[1] Show All Latihan");
        System.out.println("[2] Karyawan");
        System.out.println("[3] Training");
        System.out.println("[0] Exit");
        System.out.print("PILIH MENU> ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                showAllLatihan();
                break;
            case 2:
            	karyawan();
                break;
            case 3:
            	training();
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
   
    public static void main(String[] args) throws IOException {      
        do {
            showMenu();
        } while (isRunning);
        
    }
    static void karyawan() throws IOException{
		File file = new File("C:/latihan/karyawan.csv");
		Scanner scan = new Scanner(file);	
		String fileContent = "";

		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() +"\n");			
		}
		System.out.print("\n");
		System.out.println("INFORMATION..!!! Data txt karyawan Sudah dicetak ya pak Riki, silahkan cek di folder nya ");
		System.out.print("\n");
		FileWriter writer = new FileWriter("C:/latihan/karyawan.txt");
		writer.write(fileContent);
		writer.close();

	}
        
    static void training() throws IOException{
		File file = new File("C:/latihan/training.csv");
		Scanner scan = new Scanner(file);	
		String fileContent = "";

		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() +"\n");
			
		}
		System.out.print("\n");
		System.out.println("INFORMATION..!!! Data txt training Sudah dicetak ya pak Riki, silahkan cek di folder nya ");
		System.out.print("\n");
		FileWriter writer = new FileWriter("C:/latihan/training.txt");
		writer.write(fileContent);
		writer.close();

	}   
}
