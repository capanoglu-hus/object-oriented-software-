/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carpetwashing;

import java.util.ArrayList;

/**
 *
 * @author Stark
 */
public class Celebrity implements Subject {

    private final String carpet;
    private final ArrayList<Observer> customer;

    public Celebrity(String carpet) {
        this.carpet = carpet;
        customer = new ArrayList<>();
    }

    public void register(carpetwashing.Observer o) {
        customer.add((Observer) o);
        System.out.println(o + " " + carpet + "nin halısıdır");
         System.out.println(o + " " + carpet + "halı işleme alındı ");
    }

    

    private void notifyAllObservers(String messages) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void notifyAllObservers(Message m) {
        for (Observer customer : customer) {
            String messages = null;
            customer.update(carpet, messages);
        System.out.println("\n" + carpet + "işlemi bitti " + m + "\n");

       //notifyAllObservers(m);

    }

}
}
