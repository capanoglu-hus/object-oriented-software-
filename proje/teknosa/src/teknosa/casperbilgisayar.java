/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teknosa;

/**
 *
 * @author Stark
 */
public class casperbilgisayar extends bilgisayar {
     private String bilgi;
    private String marka;
    private int fiyat ;

    
     @Override
     public String bilgi(String bilgi){
        
        System.out.println("bilgisayar hakkında bilgi" + this.bilgi);
        return String.format("  ", bilgi);
        
    }
     @Override
    public String marka (String marka){
        System.out.println("bilgisayarın markası " + this.marka);
        return String.format("" , marka);
    }
    
    /**
     *
     * @return
     */
    @Override
    public int fiyat(){
        System.out.println("bilgisayarın fiyatı : 20" + this.fiyat);
        return fiyat;
    }
}
