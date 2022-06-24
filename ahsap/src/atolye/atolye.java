/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atolye;

/**
 *
 * @author Stark
 */
public class atolye {

    public static void main(String[] args) {

        malzeme pen = new pencere(new birlestirme());
        pen.applyislem();

        malzeme ahsap = new ahsap(new birlestirme());
        ahsap.applyislem();
        
        
        malzeme kapı = new kapı(new birlestirme());
        kapı.applyislem();

     

    }
