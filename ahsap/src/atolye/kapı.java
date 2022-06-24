/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atolye;

/**
 *
 * @author Stark
 */
public class kapı extends malzeme  {

   public kapı(islem i) {
		super(i);
	}

	@Override
	public void applyislem() {
		System.out.print("kapı islemde ");
		islem.applyislem();
	} 

   
}
