/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carpetwashing;

/**
 *
 * @author Stark
 */
public interface Subject {

    public void register(Observer o);

   

    public void notifyAllObservers( Message m);
}
