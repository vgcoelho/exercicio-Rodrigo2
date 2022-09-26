package Pessoa;

public class Conclusao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("Vanessa", "01020500000", 38);

		p1.nome = "Vanessa Guimaraes Coelho";
		p1.cpf = "03060000201";
		p1.idade = 38;

		// MOSTRANDO NA TELA OS DADOS DO CONTRUTOR PADRAO
		System.out.println("Nome " + p1.nome + "Cpf:" + p1.cpf + "Idade:" + p1.idade);

		// MOSTRANDO OS DADOS DO CONSTRUTOR COM PARAMENTRO
		System.out.println("Nome: " + p2.nome + "Cpf: " + p2.cpf + "Idade " + p2.idade);
		p1.Dados();

	}

}
