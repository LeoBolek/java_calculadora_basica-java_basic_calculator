package calculadora;
import java.util.Scanner;

public class CalculadoraBasica {
	
	public static void main(String[] args) {
		System.out.println("#########################################");
		System.out.println("#########################################");
		System.out.println("########## CALCULADORA B�SICA ###########");
		System.out.println("#########################################");
		System.out.println("#########################################");
		
		System.out.println("(1) Adi��o | (2) Subtra��o | (3) Multiplica��o | (4) Divis�o");
		System.out.print("Escolha uma opera��o aritm�tica: ");
		try (Scanner digiteOperacao = new Scanner(System.in)) {
			int operacao = digiteOperacao.nextInt();
			
			if(operacao == 1) {
				System.out.println("Voce escolheu adi��o.");
				System.out.println(" ");
				System.out.print("Digite um n�mero: ");
				int numero1 = digiteOperacao.nextInt();
				System.out.print("Digite outro numero: ");
				int numero2 = digiteOperacao.nextInt();
				int numero3 = numero1 + numero2;
				System.out.println(numero1 + " + " + numero2 + " = " + numero3);
				System.out.println("Isto fica feliz em ser �til! :)");
			}
				
			else if(operacao == 2) {
				System.out.println("Voce escolheu subtra��o.");
				System.out.println(" ");
				System.out.print("Digite um numero: ");
				int numero4 = digiteOperacao.nextInt();
				System.out.print("Digite outro numero: ");
				int numero5 = digiteOperacao.nextInt();
				int numero6 = numero4 - numero5;
				System.out.println(numero4 + " - " + numero5 + " = " + numero6);
				System.out.println("Isto fica feliz em ser �til! :)");
			}
					
			else if(operacao == 3) {
				System.out.println("Voce escolheu multiplica��o.");
				System.out.println(" ");
				System.out.print("Digite um numero: ");
				int numero7 = digiteOperacao.nextInt();
				System.out.print("Digite outro numero: ");
				int numero8 = digiteOperacao.nextInt();
				int numero9 = numero7 * numero8;
				System.out.println(numero7 + " x " + numero8 + " = " + numero9);
				System.out.println("Isto fica feliz em ser �til! :)");
			}
						
			else {
				System.out.println("Voce escolheu divis�o.");
				System.out.println(" ");
				System.out.print("Digite um numero: ");
				int numero10 = digiteOperacao.nextInt();
				System.out.print("Digite outro numero: ");
				int numero11 = digiteOperacao.nextInt();
				int numero12 = numero10 / numero11;
				System.out.println(numero10 + " / " + numero11 + " = " + numero12);
				System.out.println("Isto fica feliz em ser �til! :)");
			}
		}
		
	}
}
