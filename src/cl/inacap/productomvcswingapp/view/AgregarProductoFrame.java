package cl.inacap.productomvcswingapp.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class AgregarProductoFrame extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarProductoFrame frame = new AgregarProductoFrame();
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
	public AgregarProductoFrame() {
		setTitle("Agregar Producto");
		setClosable(true);
		setBounds(100, 100, 700, 445);

	}

}
