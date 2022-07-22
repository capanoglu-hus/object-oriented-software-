/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpetwashing;

/**
 *
 * @author Stark
 */
public abstract class process {

    protected int id;
    protected String name;
    protected Wash wash;
    protected Drying drying;

    public process(int id, String name, Wash wash,Drying drying) {
        this.id = id;
        this.name = name;
        this.wash = wash;
        this.drying = drying;
    }

   

    
  abstract void allProcess();

}
   
    

