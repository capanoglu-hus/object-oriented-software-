/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpetwashing;

/**
 *
 * @author Stark
 */
public class follow implements Observer {

    private String CustomerName;
    private String carpet;

    public follow(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    @Override
    public void update(String name, String s) {
        
        System.out.println(CustomerName + " kişisinin " + carpet + "bildirim" + s);
    }

    public String toString() {
        return CustomerName;
    }
}
