package latihan;

public class Manipulasi_String_3 {

	public static void main(String[] args) {
		int [] sd1  = {1,2,3,4,5};
		int [] sd2  = {6,7,8,4,5};
		System.out.print ("Data sd1 = ");
		for (int k = 0; k<sd1.length; k++){
		                System.out.print (sd1[k] + " ");
		}
		
		System.out.print ("\nData sd2 = ");
		for (int l = 0; l<sd2.length; l++){
		                System.out.print (sd2[l] + " ");
		}
		System.out.print ("\n---------------------\nData yang tidak sama = ");
		for (int i = 0; i<sd1.length; i++){
		                for (int j = 0; j<sd2.length; j++){
		                                if (sd1[i]!=sd2[j]);
		                                                System.out.print (sd2[j] + ", ");
                }
        }                

}

}
