package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConvView extends JFrame implements ActionListener, ItemListener {

	
	// private static final long serialVersionUID = 1L;

	private JTextField moneda1Tf = new JTextField(15);
	private JTextField moneda2Tf = new JTextField(15);
	private JLabel from, to;
	private JButton conversion = new JButton(">>");
	private JComboBox<String> convertFrom, convertTo;

	public ConvView() {
		JPanel content = new JPanel();
		content.setLayout(null);

		convertFrom = new JComboBox<String>();
		convertFrom.setBounds(50, 70, 200, 50);
		convertFrom.addItem("RON");
		convertFrom.addItem("EUR");
		convertFrom.addItem("USD");
		content.add(convertFrom);

		conversion.setBounds(300, 70, 60, 50);
		conversion.setBackground(Color.green);
		conversion.setForeground(Color.white);
		content.add(conversion);

		convertTo = new JComboBox<String>();
		convertTo.setBounds(400, 70, 200, 50);
		convertTo.addItem("RON");
		convertTo.addItem("EUR");
		convertTo.addItem("USD");
		content.add(convertTo);

		from = new JLabel("Suma conversie: ");
		from.setBounds(50, 150, 300, 30);
		content.add(from);

		moneda1Tf.setBounds(150, 150, 150, 30);
		content.add(moneda1Tf);

		to = new JLabel("Rezultat conversie: ");
		to.setBounds(350, 150, 150, 30);
		content.add(to);

		moneda2Tf.setBounds(500, 150, 100, 30);
		moneda2Tf.setBackground(Color.white);
		moneda2Tf.setEditable(false);
		content.add(moneda2Tf);

		convertFrom.addItemListener(this);
		convertTo.addItemListener(this);
		conversion.addActionListener(this);
		moneda1Tf.addActionListener(this);

		this.setContentPane(content);
		this.pack();

		this.setTitle("Convertor Valutar - MVC");
		this.setSize(640, 320);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void exit() {
		System.exit(0);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * void addConversionListener(ConvertorListener convertorListener) {
	 * conversion.addActionListener(convertorListener); }
	 * 
	 * 
	 * @Override public void itemStateChanged(ItemEvent arg0) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */
}
