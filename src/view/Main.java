package view;

import controller.SomaController;

public class Main {
	
	public static void main(String[] args) {
		SomaController somaController = new SomaController();
		
		int resultado = somaController.somaRecursiva(5);
		
		System.out.println(resultado);
	}

}
