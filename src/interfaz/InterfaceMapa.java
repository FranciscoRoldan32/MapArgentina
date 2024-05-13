package interfaz;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class InterfaceMapa  {

	private JFrame frame;
	private int width;
	private int height;



	private Diseño_Regiones diseñoRegiones;

	// Icono creado por Alexis Knack
	private URL image = getClass().getResource("/images/Icon mark 3.png");

	// Lo que hace esta clase es inicializar la ventana en general
	public InterfaceMapa() {
		initialize();

	}

	private void initialize() {

		height = 950;
		width = 900;

		frame = new JFrame();

		frame.setTitle("Designing Regions Argentina");

		ImageIcon icon = new ImageIcon(image);
		frame.setIconImage(icon.getImage());

		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		diseñoRegiones = new Diseño_Regiones(width, height);
		diseñoRegiones.setVisible(true);
		frame.add(diseñoRegiones);
		frame.pack();

		diseñoRegiones.requestFocus();
	}
	 public Diseño_Regiones getDiseñoRegiones() {
	        return diseñoRegiones;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public int getHeight() {
	        return height;
	    }


}
