/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import model.ModelEdel;
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
        
        viewEdel.edit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String idEdit = viewEdel.getID();
                String namaEdit = viewEdel.getEditNama();
                String lapanganEdit = viewEdel.getEditLapangan();
                String bookingEdit = viewEdel.getEditBooking();
                System.out.println(idEdit);
                modelEdel.updateJadwal(namaEdit, bookingEdit, lapanganEdit, Integer.parseInt(idEdit));
            }
        });
    }
    
}
