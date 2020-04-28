package view;

import java.util.List;

import javax.swing.JOptionPane;

import entity.Livro;

public class OutputLivro {
	
	public void imprimirLivro(Livro l) {
		JOptionPane.showMessageDialog(null, l.toString());
	}
	
	public void imprimirLivros(List<Livro> livros) {
		JOptionPane.showMessageDialog(null, livros);
	}

}
