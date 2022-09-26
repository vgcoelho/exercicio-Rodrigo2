 
package Pessoa;

public class Pessoa {

	
// ATRIBUTOS
		String nome;
		String cpf;
		int idade;

// CONSTRUTOR PADRAO

		public Pessoa() {
			nome = "";
			cpf = "";
			idade = 0;
		}

// CONSTRUTOR COM PARAMETRO
		public Pessoa(String nome, String cpf, int idade) {
			this.nome = nome;
			this.cpf = cpf;
			this.idade = idade;

		}

		// METODOS PARA ALTERAÇAO
		public void Dados() {
			System.out.println("Seu nome : " + nome + "Seu cpf " + cpf + "Sua Idade " + idade);
		}

	


	}


