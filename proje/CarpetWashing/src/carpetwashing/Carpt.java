
package carpetwashing;

/**
 *
 * @author Stark
 */
public class Carpt  implements  Product  {

    private int id;
    private int hesap_id;
    private String asama;
    private String deterjan ;
    private int müsteri_id;
    private int Height;
    private int Width;

    public Carpt(int id, int hesap_id, String asama, String deterjan, int müsteri_id, int Height, int Width) {
        this.id = id;
        this.hesap_id = hesap_id;
        this.asama = asama;
        this.deterjan = deterjan;
        this.müsteri_id = müsteri_id;
        this.Height = Height;
        this.Width = Width;
    }

    @Override
    public int getId() {
        return id;
    }

    public int getHesap_id() {
        return hesap_id;
    }

    public String getAsama() {
        return asama;
    }

    public String getDeterjan() {
        return deterjan;
    }

    public int getMüsteri_id() {
        return müsteri_id;
    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

   @Override
    public String toString() {
        return "id = " + this.getId() + ", "
                + "hesap_id = " + this.getHesap_id() + ", "
                + "aşama = " + this.getAsama() + ", "
                + "deterjan = " + this.getDeterjan() + ", "
                + "müşteri id = " + this.getMüsteri_id() + ", "
                + "height =" + this.getHeight() + ","
                + "Wight =" + this.getWidth();
    }

   
    
}
