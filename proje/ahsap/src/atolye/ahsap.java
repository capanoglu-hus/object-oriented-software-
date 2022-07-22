/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atolye;

/**
 *
 * @author Stark
 */
public class ahsap extends malzeme {
    public ahsap(islem i) {
		super(i);
	}

	@Override
	public void applyislem() {
		System.out.print("ahsap islem");
		islem.applyislem();
	} 
}
