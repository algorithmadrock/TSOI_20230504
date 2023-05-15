package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ao confirmar essa mensagem o programa será executado");
		
		try {
			Controller.fruta();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
