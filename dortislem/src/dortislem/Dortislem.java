
package dortislem;

import java.util.Scanner;


public class Dortislem {

    
    public static void main(String[] args) {
     
        System.out.println(" sayı girinz: ");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println("sayı giriniz  : ");
        float m = sc.nextFloat();
        
        
        islem s1 = new toplama(n,m);
        islem s2 = new cıkarma(n,m);
        islem s3 = new carpma (n,m);
        islem s4 = new bolme (n,m);
  
      
        
       
       
        
                
                
                
    }
   
   
   
   
    
}
