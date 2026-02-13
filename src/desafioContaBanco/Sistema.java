package desafioContaBanco;

import java.util.Scanner;

public class Sistema {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Castelo", "0009", 9000.00, 12000.00);
		Conta conta2 = new Conta("Julia", "0033", 4000.00, 8000.00);
		Conta conta3 = new Conta("Bia", "0021", 1000.00, 15000.00);

		System.out.println(conta1.getDadosFormatado());
		System.out.println(conta2.getDadosFormatado());
		System.out.println(conta3.getDadosFormatado());

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite quantas contas cadastrar");
			int qtdContas = entrada.nextInt();
			entrada.nextLine();
			Conta[] arrayContas = new Conta[qtdContas];

			for (int i = 0; i < arrayContas.length; i++) {

				System.out.println("Digite o nome do dono da Conta: " + (i + 1));
				String nome = entrada.nextLine();

				System.out.println("Digite o numero da Conta: " + (i + 1));
				String conta = entrada.nextLine();

				System.out.println("Digite o saldo da Conta: " + (i + 1));
				double saldo = entrada.nextDouble();
				entrada.nextLine();

				System.out.println("Digite o limite da Conta: " + (i + 1));
				double limite = entrada.nextDouble();
				entrada.nextLine();

				arrayContas[i] = new Conta(nome, conta, saldo, limite);
				System.out.println("Conta cadastrada com sucesso!");
				System.out.println("A conta ordenada pelo número: " + (i + 1) + "-" + arrayContas[i].dono);
			}
			for (Conta c : arrayContas) {
				System.out.println(c.getDadosFormatado());
			}

			System.out.println("Qual conta deseja operar ? escolha pelo numero de ordenação ");
			int nmrOrdenacao = entrada.nextInt();
			entrada.nextLine();
			int escolha = nmrOrdenacao - 1;
			System.out.println(arrayContas[escolha].saldo);
			System.out.println("Qual conta deseja operar ? escolha pelo numero de ordenação ");
			nmrOrdenacao = entrada.nextInt();
			entrada.nextLine();
			escolha = nmrOrdenacao - 1;
			System.out.println(arrayContas[escolha].saldo);
			if (nmrOrdenacao > arrayContas.length) {
				System.out.println("Opção inválida");
			} else
				System.out.println("Diga qual operação deseja fazer: ");
			int opcao = entrada.nextInt();
			entrada.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Ver saldo");
				System.out.println(arrayContas[escolha].saldo);
			case 2:
				System.out.println("Depositar");
				System.out.println("\nDigite qual valor deseja depositar: ");
				double valorPdeposito = entrada.nextDouble();
				entrada.nextLine();
				System.out.println(arrayContas[escolha].depositar(valorPdeposito));
				System.out.println(arrayContas[escolha].getDadosFormatado());
				System.out.println("Qual conta deseja operar ? escolha pelo numero de ordenação ");
				nmrOrdenacao = entrada.nextInt();
				entrada.nextLine();
				escolha = nmrOrdenacao - 1;
				System.out.println(arrayContas[escolha].saldo);
			}

		}
	}
}