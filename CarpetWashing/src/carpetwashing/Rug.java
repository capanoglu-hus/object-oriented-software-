
package carpetwashing;

/**
 *
 * @author Stark
 */
public class Rug implements Product{
    private int id;
    private int hesap_id;
    private String asama;
    private String deterjan ;
    private int müsteri_id;
    private int Height;
    private int Width;

    public Rug(int id, int hesap_id, String asama, String deterjan, int müsteri_id, int Height, int Width) {
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

    @Override
    public int getHesap_id() {
        return hesap_id;
    }

    @Override
    public String getAsama() {
        return asama;
    }

    @Override
    public String getDeterjan() {
        return deterjan;
    }

    @Override
    public int getMüsteri_id() {
        return müsteri_id;
    }

    @Override
    public int getHeight() {
        return Height;
    }

    @Override
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
