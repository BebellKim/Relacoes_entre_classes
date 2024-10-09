package Relacoes_entre_Classes.Agregação;

public class MainDepartamento {

	public static void main(String[] args) {
		
				Departamento departamento = new Departamento ("RH");
				Empresa empresa = new Empresa("AA FAMILY",departamento);
				
				System.out.println("Empresa: "+empresa.getNome()+"\nDepartamento: "+departamento.getNome());
				

			}


	}

