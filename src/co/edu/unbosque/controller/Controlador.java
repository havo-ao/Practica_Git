package co.edu.unbosque.controller;

import co.edu.unbosque.vista.VistaFher;

public class Controlador {
	VistaFher ventanaFher;
	
	public void iniciar() {
		System.out.println("Estoy en el controlador");
		ventanaFher = new VistaFher();
		ventanaFher.setVisible(true);
	}
}
