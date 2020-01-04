package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConvController implements ItemListener, ActionListener {

	private double value;
	private JTextField moneda1Tf, moneda2Tf;
	private JButton conversion;
	
	private ConvModel m_model;
	private ConvView m_view;
	
	ConvController(ConvModel model, ConvView view) {
		 m_model = model;
		 m_view = view; 

	}
	
	 
	public void actionPerformed(ActionEvent e) {

		value = Double.parseDouble(moneda1Tf.getText());

		if (e.getSource() == conversion) {
			if (moneda1Tf.getSelectedText() == "USD") {
				m_model.ConvertDollar();
			} else if (moneda1Tf.getSelectedText() == "RON") {
				m_model.ConvertRON();
			} else if (moneda1Tf.getSelectedText() == "EUR") {
				m_model.ConvertEUR();
			}
		}
	}

	public void itemStateChanged(ItemEvent e) {

	}

}
