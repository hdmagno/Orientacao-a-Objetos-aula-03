package entity;

public class Livro {
	
	private Long id;
	private String nome;
	private String autor;
	private String descricao;
	private Double preco;
	private Double desconto;
	private Double total = 0D;;
	
	public Livro() {
	}

	public Livro(Long id, String nome, String autor, String descricao, Double preco, Double desconto) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.descricao = descricao;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void gerarTotal() {
		total = preco - desconto;
	}
	
	public String toString() {
		return "Id: "
				+ id
				+ ", Nome: "
				+ nome
				+ ", Descricao: "
				+ descricao
				+ ", Preco: "
				+ String.format("R$%.2f", preco)
				+ ", Total: "
				+ String.format("R$%.2f", getTotal());
	}
}
