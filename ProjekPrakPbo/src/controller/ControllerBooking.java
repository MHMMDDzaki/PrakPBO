package controller;

import model.ModelAdd;
import model.ModelBooking;
import model.ModelEdel;
import view.ViewAdd;
import view.ViewBooking;
import view.ViewEdel;

import javax.swing.*;

public class ControllerBooking extends JFrame {
    ViewBooking viewBooking;
    ModelBooking modelBooking;
    public ControllerBooking(ViewBooking viewBooking, ModelBooking modelBooking) {
        this.viewBooking = viewBooking;
        this.modelBooking = modelBooking;

        if (modelBooking.getBanyakData()!=0) {
            String[][] dataTransaksi = modelBooking.bookingList();
            viewBooking.table.setModel((new JTable(dataTransaksi, viewBooking.judul)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data masih kosong");
        }

        viewBooking.addMenu.addActionListener(e -> {
            viewBooking.dispose();
            ViewAdd viewAdd = new ViewAdd();
            ModelAdd modelAdd = new ModelAdd();
            ControllerAdd controllerAdd = new ControllerAdd(viewAdd, modelAdd);
        });

        viewBooking.editDelete.addActionListener(e -> {
            viewBooking.dispose();
            ViewEdel viewEdel = new ViewEdel();
            ModelEdel modelEdel = new ModelEdel();
            ControllerEdel controllerEdel = new ControllerEdel(viewEdel, modelEdel);
        });
    }
}


