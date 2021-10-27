package projetolivrosdozero;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoas[] p = new Pessoas[2];
		Livros[] l = new Livros[3];
		
		p[0] = new Pessoas("Adalberto", 22, "M");
		p[1] = new Pessoas("Joyce", 17, "F");
		
		l[0] = new Livros("titulo1", "autor1", 500, p[0]);
		l[1] = new Livros("titulo2", "autor2", 750, p[1]);
		l[2] = new Livros("titulo3", "autor3", 200, p[0]);

		l[0].abrir();//abre o livro
		l[0].folhear(250);//folheia para pagina digitada
		l[0].avancarPag();//avança 1 pagina
		
		System.out.println(l[0].detalhes());//mostra os detalhes dos livro selecionado
		
		l[1].abrir();
		l[1].folhear(800);
		p[1].fazerAniver();
		System.out.println(l[1].detalhes());
	}

}
