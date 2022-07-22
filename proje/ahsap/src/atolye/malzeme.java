/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atolye;

/**
 *
 * @author Stark
 */
public abstract class malzeme {
    //Composition - implementor

    protected islem islem;

    //constructor with implementor as input argument
    public malzeme(islem i) {
        this.islem = i;
    }

    abstract public void applyislem();

}
