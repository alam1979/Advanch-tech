package com.util.helper;

import javax.swing.JOptionPane;

public class MassageBox {

	
		    public static String getMsgBox(String infoMessage, String titleBar)
		    {
		        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
				return infoMessage;
		    }
		

	}


