package controll;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entity.Livro;
import view.InputLivro;

public class LoopLivro {
	
	public static List<Livro> loop() {
		List<Livro> lista = new ArrayList<>();
		String op = "";
		do {
			InputLivro ip = new InputLivro();
			Livro l = new Livro();
			l.setId(ip.lerCodigo());
			l.setNome(ip.lerNone());
			l.setAutor(ip.lerAutor());
			l.setDescricao(ip.lerDescricao());
			l.setPreco(ip.lerPreco());
			l.setDesconto(ip.lerDesconto());
			l.gerarTotal();
			lista.add(l);
			op = JOptionPane.showInputDialog("Digite S/s para finalizar");
		} while(!op.equalsIgnoreCase("s"));
		return lista;
	}

}
