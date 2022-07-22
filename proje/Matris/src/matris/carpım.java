
package matris;

import java.util.Scanner;


public abstract class carpım extends islemler {
    
     int satir;
     int sutun;
     

    carpım(int satir, int sutun) {
        this.satir = satir;
       this.sutun = sutun;
    }
     
   
     
   public int carp(int satir, int sutun) {
       
        int[][] matris1=new int[satir][sutun];
        int[][] matris2=new int[satir][sutun];
        int[][] Mcarpim=new int[satir][sutun];
     
      Scanner klavye = new Scanner(System.in);
       for (int i=0; i < satir; i++){
	    for (int j=0; j < sutun; j++){
                 System.out.println("Lütfen 1. matris için ["+i+"]["+j+"] konumundaki elemani yazin");
		  matris1[i][j]=klavye.nextInt();
				 
		 System.out.println("Lütfen 2. matris için ["+i+"]["+j+"] konumundaki elemani yazin");		 
		 matris2[i][j]=klavye.nextInt();
		Mcarpim[i][j]=matris1[i][j]*matris2[i][j];		 
		 }
       }
      
                 
        System.out.println("matris1 ve matris2'nin çarpımı:");
		 
          for (int i = 0; i < satir; i++) {
	    for (int j = 0; j < sutun; j++) {
	  System.out.print(Mcarpim[i][j] + "\t");
}
	System.out.println();
          }
         return 0;
   }
    
	     
}  
   
    
 
    
   
   