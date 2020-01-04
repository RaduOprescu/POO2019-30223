package lab10;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class ConvMVC {

	public static void main(String[] args) {
		ConvModel model= new ConvModel();
		ConvView view = new ConvView();
	    ConvController controller = new ConvController(model, view);
	    view.setVisible(true);
	}

}
