package Relacoes_entre_Classes.Composição;

public class MainLivro {

	public static void main(String[] args) {
	Livro livro = new Livro("A Hora da Estrela","Clarice Lispector");
		
		System.out.println(livro.getTitulo()+" de "+livro.getAutor()+" como o autor");


	}

}
