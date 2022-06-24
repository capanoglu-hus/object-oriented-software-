
package carpetwashing;




public class ProductFactory {

    public static Product getProduct(String cins,  int id , int hesap_id, String asama, String deterjan ,
    int müsteri_id ,int Height, int Width) {
        
            Product product = null ;
        
        if ("Carpet".equalsIgnoreCase(cins)) {
            product = new  Carpt(id,hesap_id,asama,deterjan,müsteri_id,Height, Width);
        
        } else if ("Rug".equalsIgnoreCase(cins)) {
            product=  new Rug(id,hesap_id,asama,deterjan,müsteri_id,Height, Width);
        }

        return product;

    }

}
