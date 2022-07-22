
package matris;

import java.util.Scanner;


public class Matris {

    
    public static void main(String[] args) {
   
         Scanner klavye=new Scanner(System.in);
	 System.out.println("Matrislerin satır satısı kaç olsun?");
	 int satir=klavye.nextInt();
		 
	 System.out.println("Matrislerin sutun satısı kaç olsun?");
	 int sutun=klavye.nextInt();
         
        
		 
	  islemler t1 = new toplam(satir,sutun) {};
          islemler c1 = new carpım(satir,sutun) {};
          
         System.out.println("toplamı" + t1.topla()+"/n");
         System.out.println("carpım" + c1.carp() + "/n");
}

}