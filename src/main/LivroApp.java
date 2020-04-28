package main;

import controll.LoopLivro;
import view.OutputLivro;

public class LivroApp {

	public static void main(String[] args) {

		try {
			OutputLivro ou = new OutputLivro();
			ou.imprimirLivros(LoopLivro.loop());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error..." + e.getMessage());
		}
		
	}

}
