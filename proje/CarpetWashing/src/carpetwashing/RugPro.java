/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpetwashing;

/**
 *
 * @author Stark
 */
public class RugPro extends process{

    public RugPro(int id, String name, Wash wash, Drying drying) {
        super(id, name, wash, drying);
    }

    @Override
    void allProcess() {
        this.wash.doProcess();
        System.out.println(" ve ");
        this.drying.doProcess();
        System.out.println(" kilim için yapıldı");
    }
  
    
}


