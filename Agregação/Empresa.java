package Relacoes_entre_Classes.Agregação;

public class Empresa {
	
	private String nome;
	private  Departamento departamento;
	
	public Empresa (String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setnome (String nome) {
		this.nome = nome;
		
	}
	

}

