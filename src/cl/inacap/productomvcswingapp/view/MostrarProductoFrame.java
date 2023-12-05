package cl.inacap.productomvcswingapp.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class MostrarProductoFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarProductoFrame frame = new MostrarProductoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MostrarProductoFrame() {
		setClosable(true);
		setTitle("Mostrar Producto");
		setBounds(100, 100, 700, 445);

	}

}
