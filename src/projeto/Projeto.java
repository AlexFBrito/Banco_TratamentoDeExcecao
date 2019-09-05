package projeto;

import java.util.Scanner;

import modelo.entidades.Conta;
import modelo.excecoes.Excecoes;

public class Projeto {

	public static void main(String[] args) {
		Scanner dig = new Scanner (System.in);		
		System.out.println("ENTRE COM OS DADOS DA CONTA");
		System.out.print("NÚMERO: ");
		int numero = dig.nextInt();
		System.out.print("TITULAR: ");
		dig.nextLine();
		String titular = dig.nextLine();
		System.out.print("SALDO INICIAL: ");
		Double saldo = dig.nextDouble();
		System.out.print("LIMITE DE SAQUE: ");
		Double limiteSaque = dig.nextDouble();		
		System.out.println();
		
		Conta conta = new Conta(numero, titular, saldo, limiteSaque);
		
		System.out.print("DIGITE O VALOR DO SAQUE: ");
		double valor = dig.nextDouble();
		
		try {
			conta.saque(valor);
			System.out.println("SALDO ATUALIZADO: " + String.format("%.2f", conta.getSaldo()));
		}
		catch (Excecoes e) {
			System.out.println("ERRO DE SAQUE: " + e.getMessage());
		}
	
		dig.close();
		
	}

}
