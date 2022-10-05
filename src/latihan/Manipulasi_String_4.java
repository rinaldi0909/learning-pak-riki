package latihan;

import java.io.BufferedReader;
import java.io.IOException;

public class Manipulasi_String_4 {

	public static void main(String[] args) {
		

		
		 int [] supportedPhones1  = {1,2,3,4,5};
         int [] supportedPhones2  = {6,7,8,4,5};
         System.out.print ("Data 1 = ");
         for (int k = 0; k<supportedPhones1.length; k++){
                         System.out.print (supportedPhones1[k] + " ");
         }

         System.out.print ("\nData 2 = ");
         for (int l = 0; l<supportedPhones2.length; l++){
                         System.out.print (supportedPhones2[l] + " ");
         }
         System.out.print ("\n---------------------\nData yang sama = ");
         for (int i = 0; i<supportedPhones1.length; i++){
                         for (int j = 0; j<supportedPhones2.length; j++){
                                         if (supportedPhones1[i]==supportedPhones2[j])
                                                         System.out.print (supportedPhones1[i] + ", ");
                         }
                 }                
		
		}
	
}
