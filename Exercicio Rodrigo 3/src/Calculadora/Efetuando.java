package Calculadora;

	import java.util.Scanner;

	public class Efetuando  {

		public static void main(String[] args) {

			
			double valor1, valor2, resultado;
			
			
			

			Calculadora c1 = new Calculadora();
			Scanner valores = new Scanner(System.in);
			System.out.println("Digite o primeiro valor double");
			valor1 = valores.nextDouble();
			System.out.println("Digite o segundo valor double");
			valor2 = valores.nextDouble();

			
			c1.somar(valor1, valor2);
			System.out.println("O valor da soma é: " + c1.resultado);

			c1.subtrair(valor1, valor2);
			System.out.println("O valor da subtracao: " + c1.resultado);

			
			c1.multiplicar(valor1, valor2);
			System.out.println("O valor da multiplicacao: " + c1.resultado);

			

			c1.dividir(valor1, valor2);
			System.out.println("O valor da divisao: " + c1.resultado);

		}

	

		

	}

}
