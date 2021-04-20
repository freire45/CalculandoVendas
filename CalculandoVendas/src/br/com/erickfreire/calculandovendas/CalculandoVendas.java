package br.com.erickfreire.calculandovendas;

import java.util.Scanner;

/**
 * Programa em Java que calcula vendas
 * @author Erick Freire
 * @version 1 - Criado em 20-04-2021 as 16:54
 */

public class CalculandoVendas {
	public static void main(String[] args) {
		double produto1 = 2.98;
		double produto2 = 4.50;
		double produto3 = 9.98;
		double produto4 = 4.49;
		double produto5 = 6.87;
		int codProduto;
		int quantidade;
		double resultado = 0.00;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa calcula vendas: ");
		
		System.out.print("Informe o codigo do produto: ");
		codProduto = entrada.nextInt();
		
		System.out.print("Informe a quantidade do produto: ");
		quantidade = entrada.nextInt();
		
		switch (codProduto) {
		
		case 1:
		   resultado = quantidade * produto1;
		   break;
		   
		case 2:
			resultado = quantidade * produto2;
			break;
			
		case 3:
			resultado = quantidade * produto3;
			break;
			
		case 4:
			resultado = quantidade * produto4;
			break;
			
		case 5:
			resultado = quantidade * produto5;
			break;
			
	    default:
			System.out.println("\nOpção Inválida!");
		
		}
		
			System.out.printf("O valor da venda é de: %.2f ", resultado);
		
		
	}

}
