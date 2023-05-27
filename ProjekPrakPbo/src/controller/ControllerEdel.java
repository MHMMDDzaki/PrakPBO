/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;

import model.ModelBooking;
import model.ModelEdel;
import view.ViewBooking;
import view.ViewEdel;

/**
 *
 * @author dzaki
 */
public class ControllerEdel extends JFrame {
    ViewEdel viewEdel;
    ModelEdel modelEdel;
    
    
    public ControllerEdel(ViewEdel viewEdel, ModelEdel modelEdel){
        this.viewEdel = viewEdel;
        this.modelEdel = modelEdel;
        
        viewEdel.edit.addActionListener(e -> {
            String idEdit = String.valueOf(viewEdel.getID().charAt(0));
            String namaEdit = viewEdel.getEditNama();
            String lapanganEdit = viewEdel.getEditLapangan();
            String bookingEdit = viewEdel.getEditBooking();
            String jamBookingEdit = viewEdel.getEditJamBooking();
            modelEdel.updateJadwal(namaEdit, bookingEdit, lapanganEdit, jamBookingEdit, Integer.parseInt(idEdit));
            viewEdel.dispose();
            ViewBooking viewBooking = new ViewBooking();
            ModelBooking modelBooking = new ModelBooking();
            ControllerBooking controllerBooking = new ControllerBooking(viewBooking, modelBooking);
        });

        viewEdel.delete.addActionListener(e -> {
            String idEdit = String.valueOf(viewEdel.getID().charAt(0));
            modelEdel.deleteJadwal(Integer.parseInt(idEdit));
            viewEdel.dispose();
            ViewBooking viewBooking = new ViewBooking();
            ModelBooking modelBooking = new ModelBooking();
            ControllerBooking controllerBooking = new ControllerBooking(viewBooking, modelBooking);
        });

        viewEdel.homeEdel.addActionListener(e -> {
            viewEdel.dispose();
            ViewBooking viewBooking = new ViewBooking();
            ModelBooking modelBooking = new ModelBooking();
            ControllerBooking controllerBooking = new ControllerBooking(viewBooking, modelBooking);
        });
    }
    
}
