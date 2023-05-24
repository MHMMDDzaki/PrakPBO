/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ControllerBooking;
import model.ModelBooking;
import view.ViewBooking;

/**
 *
 * @author dzaki
 */
public class ProjekPrakPbo {
    public static void main(String[] args) {
        // TODO code application logic here
        ViewBooking view = new ViewBooking();
        ModelBooking model = new ModelBooking();
        ControllerBooking controllerBooking = new ControllerBooking(view, model);
    }
    
}
