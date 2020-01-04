package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConvModel {

	private JComboBox<String> convertFrom, convertTo;
	private double result, value;
	private JTextField moneda2Tf;

	public void ConvertDollar() {
		if (convertTo.getSelectedItem() == "USD") {
			result = value;
			moneda2Tf.setText("" + result);
		} else if (convertTo.getSelectedItem() == "RON") {
			result = (value * 4.2922);
			moneda2Tf.setText("" + result);
		} else if (convertTo.getSelectedItem() == "EUR") {
			result = (value * 0.8982);
			moneda2Tf.setText("" + result);
		}
	}

	public void ConvertRON() {
		if (convertTo.getSelectedItem() == "USD") {
			result = (value * 0.233);
			moneda2Tf.setText("" + result);
		} else if (convertTo.getSelectedItem() == "RON") {
			result = (value);
			moneda2Tf.setText("" + result);
		} else if (convertTo.getSelectedItem() == "EUR") {
			result = (value * 0.2093);
			moneda2Tf.setText("" + result);
		}
	}

	public void ConvertEUR() {
		if (convertTo.getSelectedItem() == "USD") {
			result = (value * 1.1134);
			moneda2Tf.setText("" + result);
		} else if (convertTo.getSelectedItem() == "RON") {
			result = (value * 4.7789);
			moneda2Tf.setText("" + result);
		} else if (convertTo.getSelectedItem() == "EUR") {
			result = (value);
			moneda2Tf.setText("" + result);
		}
	}

}
