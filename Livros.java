package projetolivrosdozero;

public class Livros implements Publicacao{
	private String titulo;
	private String autor;
	private int totPag;
	private int pagAtual;
	private Boolean aberto;
	private Pessoas leitor;

	public String detalhes() {//imprime os atributos relacionados abaixo
		return "Livros \ntitulo= " + titulo + ", autor= " + autor 
				+ ", totPag= " + totPag + ", pagAtual= " + pagAtual
				+ ", aberto= " + aberto + ",\nleitor= " + leitor.getNome() //.get para poder buscar o 
				+ ", idade= " + leitor.getIdade() + ", sexo= " + leitor.getSexo();//atributo da classe
	}

	public Livros(String titulo, String autor, int totPag, Pessoas leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPag = totPag;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPag() {
		return totPag;
	}

	public void setTotPag(int totPag) {
		this.totPag = totPag;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public Boolean getAberto() {
		return aberto;
	}

	public void setAberto(Boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoas getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoas leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear(int p) {
		if (p > this.totPag) {//condicional, caso a pagina digitada seja maior que o total, aparece a msg abaixo
		System.out.println("Página inválida. Tente novamente.");
		} 
		else {
		this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}

}
