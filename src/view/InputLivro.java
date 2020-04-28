package view;

import javax.swing.JOptionPane;

public class InputLivro {
	
	public Long lerCodigo() {
		String id = JOptionPane.showInputDialog("Digite o código:");
		return Long.parseLong(id);
	}
	
	public String lerNone() {
		String nome = JOptionPane.showInputDialog("Digite o nome do Livro:");
		return nome;
	}
	
	public String lerAutor() {
		String autor = JOptionPane.showInputDialog("Digite o nome do autor:");
		return autor;
	}
	
	public String lerDescricao() {
		String descricao = JOptionPane.showInputDialog("Digite a descrição do Livro:");
		return descricao;
	}
	
	public Double lerPreco() {
		String preco = JOptionPane.showInputDialog("Digite o preço do Livro:");
		return Double.parseDouble(preco);
	}
	
	public Double lerDesconto() {
		String desconto = JOptionPane.showInputDialog("Digite o valor de desconto:");
		return Double.parseDouble(desconto);
	}

}
