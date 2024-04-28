package interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;
import org.openstreetmap.gui.jmapviewer.interfaces.MapPolygon;



public class InterfaceMapa {

	private JFrame frame;
	private JMapViewer mapa;
	private JMenuBar barraMenu;
	private JMenu opciones;
	private JMenuItem reiniciar;
	private JMenuItem salir;
	

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("jMapViewer");
		
		mapa = new JMapViewer(); 
//		mapa.setZoomControlsVisible(false);
		frame.getContentPane().add(mapa);
		
		//LLEVAR UNA COORDENADA Y UN PUNTO ESPECIFICO
		Coordinate coordenadas = new Coordinate (-34.52255337521493, -58.700951901525855);
		Coordinate coordenadas2 = new Coordinate (-34.521186, -58.714310);
		Coordinate coordenadas3 = new Coordinate (-34.51531, -58.69825);
		mapa.setDisplayPosition(coordenadas,12);
		
		//MARCADOR
		MapMarkerDot punto1 = new MapMarkerDot("puntito1", coordenadas);
		punto1.getStyle().setBackColor(Color.blue);
		punto1.getStyle().setColor(Color.yellow);
		mapa.addMapMarker(punto1);
		
		//MARCADOR 2
		MapMarkerDot punto2 = new MapMarkerDot("puntito2", coordenadas2);
		punto1.getStyle().setBackColor(Color.blue);
		punto1.getStyle().setColor(Color.red);
		mapa.addMapMarker(punto2);
		
		//MARCADOR 3
		MapMarkerDot punto3 = new MapMarkerDot("puntito3", coordenadas3);
		punto1.getStyle().setBackColor(Color.blue);
		punto1.getStyle().setColor(Color.green);
		mapa.addMapMarker(punto3);
		

		ArrayList<Coordinate> coordenada = new ArrayList<Coordinate>();
		coordenada.add(coordenadas3);
		coordenada.add(coordenadas2);
		coordenada.add(coordenadas);
		
//POLIGONO 
		 MapPolygon poligono = new MapPolygonImpl(coordenada);
		 mapa.addMapPolygon(poligono);
		
		frame.getContentPane().add(mapa);
	}
	

}
