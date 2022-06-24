
package alanhesap;


class kare extends Sekil
{
    double a;
    private  float h;
    private float b;
    
    @Override
    public float alan(){
        
        return (h*b);
    }
    
    public float getalan(){
        float alan = 0;
        return alan;
    }
    public void setalan(float alan){
        this.alan();
    }
    
    public float geth(){
        float h = 0;
        return h; 
    }
    
    public void seth(float h){
        this.h = h;
    }
    
    public float getb(){
        float b = 0 ;
        return b;
    }
    
    public void setb(float b){
        this.b=b;
    }
    
     public void ücgenhesap(){
        System.out.println("hesap sonucu: " + this.getalan());
   }
}
   