package cl.inacap.productomvcswingapp;

import cl.inacap.productomvcswingapp.controller.FrameControlador;
import cl.inacap.productomvcswingapp.view.Frame;

public class Start {

    public static void main(String[] args) { 	
    	Frame fr = new Frame(); //Crea un objeto perteneciente al JFrame.
        FrameControlador fc = new FrameControlador(); //Crea un objeto perteneciente al controlador de JFrame.
        fc.FrameControlador(fr); //Se llama al constructor para que se construya el JFrame.
        fr.setVisible(true); //Aca se hace visible el JFrame.
    }
    
}
