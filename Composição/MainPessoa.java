package Relacoes_entre_Classes.Composição;

public class MainPessoa {
	
	public static void main(String[] args) {
	
	Pessoa pessoa = new Pessoa ("Isabella", 80);

		
	System.out.println(pessoa.getNome() + " tem a média de: " + pessoa.getCoracao () + " batimentos.");
	
	}

}
