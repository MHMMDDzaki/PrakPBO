package controller;

import model.ModelAdd;
import model.ModelBooking;
import view.ViewAdd;
import view.ViewBooking;

import javax.swing.*;

public class ControllerAdd extends JFrame {
    ViewAdd viewAdd;
    ModelAdd modelAdd;
    public ControllerAdd(ViewAdd viewAdd, ModelAdd modelAdd){
        this.viewAdd = viewAdd;
        this.modelAdd = modelAdd;

        viewAdd.hasil.addActionListener(e -> {
            String inputNama = viewAdd.getNamaInput();
            String inputDurasi = viewAdd.getDurasiInput();
            String inputLapangan = viewAdd.getListLapangan();
            String inputBooking = viewAdd.getJamBooking();
            modelAdd.inputJadwal(inputNama, inputDurasi, inputLapangan, inputBooking);
            viewAdd.dispose();
            ViewBooking viewBooking = new ViewBooking();
            ModelBooking modelBooking = new ModelBooking();
            ControllerBooking controllerBooking = new ControllerBooking(viewBooking, modelBooking);
        });

        viewAdd.hapus.addActionListener(e -> {
            viewAdd.setNamaInput();
            viewAdd.setDurasiInput();
            viewAdd.setJamBookingInput();
        });

        viewAdd.homeAdd.addActionListener(e -> {
            viewAdd.dispose();
            ViewBooking viewBooking = new ViewBooking();
            ModelBooking modelBooking = new ModelBooking();
            ControllerBooking controllerBooking = new ControllerBooking(viewBooking, modelBooking);
        });
    }

}
