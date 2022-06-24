
package matris;

import java.util.Scanner;


public abstract class toplam extends islemler  {
    
    
    private int satir;
    private int sutun;
    

    toplam(int satir, int sutun) {
        this.satir = satir;
         this.sutun = sutun;
    }

  
   
   public int topla(int satir, int sutun){
       
       
     int[][] matris1=new int[satir][sutun];
     int[][] matris2=new int[satir][sutun];
     int[][] Mtoplam=new int[satir][sutun];

     Scanner klavye = new Scanner(System.in);
     
     
     for (int i=0; i < satir; i++){
       for (int j=0; j < sutun; j++){
         System.out.println("Lütfen 1. matris için ["+i+"]["+j+"] konumundaki elemani yazin");
	 matris1[i][j]=klavye.nextInt();
				 
	System.out.println("Lütfen 2. matris için ["+i+"]["+j+"] konumundaki elemani yazin");		 
	 matris2[i][j]=klavye.nextInt();
	Mtoplam[i][j]=matris1[i][j]+matris2[i][j];		 
		 }
    }
		 
	
	 for (int i = 0; i < satir; i++) {
	  for (int j = 0; j < sutun; j++) {
	    System.out.print(Mtoplam[i][j] + "\t");
                }
       }	    
        return 0;
   }          
                 
                 
                 
		 
    
    
 
		 
	        
                 
	    }
        
    
    
   
    
  

