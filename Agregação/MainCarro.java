package Relacoes_entre_Classes.Agregação;

public class MainCarro {

	public static void main(String[] args) {
		
		
		Motor motor = new Motor ("VS");
		Carro carro = new Carro("Mustang", motor);
		
    System.out.println(" O carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo ());
	}

}
