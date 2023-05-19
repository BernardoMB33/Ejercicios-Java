//BERNARDO MARCO BORGARO
//ITAM
package problema3;

import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.GridLayout;

import javax.swing.*;

public class GeografiaVista extends JFrame {
	
	//MUST
	JPanel miPanel;
	Border miBorde;
	JFrame miFrame;
	
	// LABELS, BUTTONS Y TEXTFIELDS
	JLabel labNomArch, labCityName;
	JButton consultar;
	JTextField txtArchivo, txtCityName, txtResult;
	
	public GeografiaVista() {
		//Instanciar
		labNomArch= new JLabel("NOMBRE DEL ARCHIVO: ");
		txtArchivo = new JTextField("Ciudades.txt");
		labCityName= new  JLabel("NOMBRE DE LA CIUDAD: ");
		txtCityName = new JTextField("Oslo");
		consultar = new JButton("Consultar");
		txtResult = new JTextField(" ");
		miBorde = BorderFactory.createEmptyBorder();
		//Set Panel
		miPanel = new JPanel();
		
		miPanel.add(labNomArch);
		miPanel.add(txtArchivo);
		miPanel.add(labCityName);
		miPanel.add(txtCityName);
		miPanel.add(consultar);
		miPanel.add(txtResult);
		miPanel.setBounds(400, 400, 400, 400);
		miPanel.setVisible(true);
		miPanel.setLayout(new GridLayout(5, 2));
		//Add super
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setBounds(400, 400, 400, 400);
		super.add(miPanel);
		
	}
	
	
}
