package cl.inacap.productomvcswingapp.controller;
import cl.inacap.productomvcswingapp.view.AgregarProductoFrame;
import cl.inacap.productomvcswingapp.view.Frame;
import cl.inacap.productomvcswingapp.view.MostrarProductoFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameControlador implements ActionListener {
    private Frame fr = new Frame();
    private AgregarProductoFrame agregarProductoFrame = new AgregarProductoFrame();
    private MostrarProductoFrame mostrarProductoFrame = new MostrarProductoFrame();
   
    public void FrameControlador(Frame fr) { //Este método construye al JFrame y añade los listeners de los Menu Componentes.
    	this.fr = fr;
    	this.fr.mntmAgregarProducto.addActionListener(e -> showFrameAgregarProducto(e));	
    	this.fr.mntmMostrarProductos.addActionListener(e -> showFrameMostrarProductos(e));
    }
    
	private void showFrameAgregarProducto(ActionEvent e) {
		if (this.agregarProductoFrame != null) {
			this.fr.desktopPane.remove(this.agregarProductoFrame);
		}
		this.agregarProductoFrame = new AgregarProductoFrame();
		this.fr.desktopPane.add(this.agregarProductoFrame);
		this.agregarProductoFrame.setVisible(true);
	}
    
    private void showFrameMostrarProductos(ActionEvent e) {
    	if (this.mostrarProductoFrame != null) {
			this.fr.desktopPane.remove(this.mostrarProductoFrame);
		}
		this.mostrarProductoFrame = new MostrarProductoFrame();
		this.fr.desktopPane.add(this.mostrarProductoFrame);
		this.mostrarProductoFrame.setVisible(true);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
