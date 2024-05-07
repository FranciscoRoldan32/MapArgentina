package interfaz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;
import org.openstreetmap.gui.jmapviewer.interfaces.MapPolygon;

public class InterfaceMapa implements ActionListener {

	private JFrame frame;
	private JMapViewer mapa;
	private JMenuBar barraMenu;
	private JMenu opciones;
	private JMenuItem reiniciar;
	private JMenuItem salir;
	private Dimension tamañoPaneles;
	private JPanel panelPrincipal;
	private JPanel panelMapa;
	private JPanel panelDeControl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceMapa window = new InterfaceMapa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceMapa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("jMapViewer");
//		
//		mapa = new JMapViewer(); 
////		mapa.setZoomControlsVisible(false);
//		frame.getContentPane().add(mapa);
//		
//		//LLEVAR UNA COORDENADA Y UN PUNTO ESPECIFICO
//		Coordinate coordenadas = new Coordinate (-34.52255337521493, -58.700951901525855);
//		Coordinate coordenadas2 = new Coordinate (-34.521186, -58.714310);
//		Coordinate coordenadas3 = new Coordinate (-34.51531, -58.69825);
//		mapa.setDisplayPosition(coordenadas,12);
//		
//		//MARCADOR
//		MapMarkerDot punto1 = new MapMarkerDot("puntito1", coordenadas);
//		punto1.getStyle().setBackColor(Color.blue);
//		punto1.getStyle().setColor(Color.yellow);
//		mapa.addMapMarker(punto1);
//		
//		//MARCADOR 2
//		MapMarkerDot punto2 = new MapMarkerDot("puntito2", coordenadas2);
//		punto1.getStyle().setBackColor(Color.blue);
//		punto1.getStyle().setColor(Color.red);
//		mapa.addMapMarker(punto2);
//		
//		//MARCADOR 3
//		MapMarkerDot punto3 = new MapMarkerDot("puntito3", coordenadas3);
//		punto1.getStyle().setBackColor(Color.blue);
//		punto1.getStyle().setColor(Color.green);
//		mapa.addMapMarker(punto3);
//		
//
//		ArrayList<Coordinate> coordenada = new ArrayList<Coordinate>();
//		coordenada.add(coordenadas3);
//		coordenada.add(coordenadas2);
//		coordenada.add(coordenadas);
//		
////POLIGONO 
//		 MapPolygon poligono = new MapPolygonImpl(coordenada);
//		 mapa.addMapPolygon(poligono);
//		
//		frame.getContentPane().add(mapa);

		generarFrame();
		crearMenu();
		generarPanelMapa();
		generarPanelDeControl();
	}

	private void generarFrame() {
		frame = new JFrame();
		frame.setTitle("Diseñando Regiones");
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(500, 20, 1200, 1020);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tamañoPaneles = new Dimension(600, 600);
		panelPrincipal = new JPanel(new GridLayout(1, 2));
		frame.getContentPane().add(panelPrincipal);
		frame.setVisible(true);
	}

	private void crearMenu() {
		barraMenu = new JMenuBar();
		opciones = new JMenu("Opciones");
		frame.setJMenuBar(barraMenu);
		frame.setVisible(true);

		barraMenu.add(opciones);

		reiniciar = new JMenuItem("Reiniciar");
		reiniciar.addActionListener(this);

		salir = new JMenuItem("Salir");
		salir.addActionListener(this);

		opciones.add(reiniciar);
		opciones.add(salir);
	}

	private void generarPanelMapa() {
		generarMapa();
		panelMapa = new JPanel();
		panelMapa.setForeground(new Color(128, 128, 128));
		panelMapa.setBackground(new Color(128, 128, 128));
		panelMapa.setPreferredSize(tamañoPaneles);
		panelMapa.setMaximumSize(new Dimension(750, 750));
		panelPrincipal.add(panelMapa);
		panelMapa.add(mapa);
	}

	private void generarMapa() {
		mapa = new JMapViewer();
		mapa.setBorder(null);
		mapa.setAlignmentX(Component.LEFT_ALIGNMENT);
		mapa.setAlignmentY(Component.TOP_ALIGNMENT);
		mapa.setZoomControlsVisible(false);
		mapa.setPreferredSize(new Dimension(500, 1000));
		mapa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// Nos posicionamos sobre Argentina
		Coordinate coordenada = new Coordinate(-39.716, -63.616);
		mapa.setDisplayPosition(coordenada, 5);
		mapa.setBounds(0, 0, 500, 1000);
	}

	private void generarPanelDeControl() {
		panelDeControl = new JPanel();
		panelDeControl.setFont(new Font("Unispace", Font.BOLD, 11));
		panelDeControl.setBackground(new Color(128, 128, 128));
		panelDeControl.setPreferredSize(tamañoPaneles);
		panelDeControl.setMaximumSize(new Dimension(750, 750));
		panelDeControl.setLayout(null);
		panelPrincipal.add(panelDeControl);

		generarTitulo();

	}

	private void generarTitulo() {
		JTextField titulo = new JTextField();
		titulo.setBorder(new LineBorder(new Color(171, 173, 179)));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBackground(new Color(0, 128, 255));
		titulo.setFont(new Font("Unispace", Font.BOLD, 27));
		titulo.setText("Diseñando Regiones");
		titulo.setBounds(21, 0, 531, 44);
		titulo.setEditable(false);
		panelDeControl.add(titulo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == salir) {
			frame.dispose();
		}

		if (e.getSource() == reiniciar) {
			int respuesta = JOptionPane.showConfirmDialog(null,
					"Esta seguro que desea reiniciar? Perdera todo lo ingresado hasta ahora.", "Reiniciar", 0);
			if (respuesta == 0) {
				frame.dispose();
				@SuppressWarnings("unused")
				InterfaceMapa nuevo = new InterfaceMapa();
			}
		}

	}

}
