/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekprakpbo;

import controller.ControllerEdel;
import java.util.Arrays;
import model.ModelEdel;
import view.ViewAdd;
import view.ViewBooking;
import view.ViewEdel;

/**
 *
 * @author dzaki
 */
public class ProjekPrakPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TableValuesDemo testing = new TableValuesDemo();
        // System.out.println(Arrays.toString(testing.ambilPilihan()));
        // testing.bookingList();
        // testing.inputJadwal("varik", "2 jam", "A44DS");
        // testing.updateJadwal("Alfin", "1 jam", "1BC", 3);
        // testing.deleteJadwal(3);
        // System.out.println(Arrays.toString(testing.ambilPilihan()));
        // ViewAdd viewAdd = new ViewAdd();
        // ViewBooking viewBooking = new ViewBooking();
        // ViewAdd viewAdd = new ViewAdd();
        ViewEdel view = new ViewEdel();
        ModelEdel model = new ModelEdel();
        ControllerEdel con = new ControllerEdel(view, model);

        
    }
    
}
