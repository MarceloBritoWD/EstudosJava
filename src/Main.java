import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Algarismo algarismo = new Algarismo(); //Cria o Objeto da CLasse Algarismo
		Scanner entrada = new Scanner(System.in); //Cria o objeto Scanner, de digitar e pá
		System.out.println("Digite um número: ");
		
		algarismo.setNumeroDigitado(entrada.nextInt()); //Altera o valor do atributo numeroDigitado
		entrada.close();
		
		System.out.println("Número Digitado: " + algarismo.getNumeroDigitado());	
		System.out.println("O Algarismo de Unidades deste número é: " + algarismo.getUnidades());		
		System.out.println("O Algarismo de Dezenas deste número é: " + algarismo.getDezenas());
		System.out.println("O Algarismo de Centenas deste número é: " + algarismo.getCentenas());


	}

}
