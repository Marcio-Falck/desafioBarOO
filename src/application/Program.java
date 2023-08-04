package application;

import java.util.Locale;
import java.util.Scanner;

import useful.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill cliente = new Bill();
		
		System.out.print("Sexo: ");
		cliente.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		cliente.beer = sc.nextInt();
		 
		System.out.print("Quantidade de refrigerantes: ");
		cliente.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		cliente.barbecue = sc.nextInt();
		System.out.println();
		
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = $ %.2f%n",cliente.feeding());
		if (cliente.cover()>0.00) {
			System.out.printf("Couvert = $ %.2f%n",cliente.cover());
		}else {
			System.out.println("Insento de Couvert");
		}
		System.out.printf("Ingresso = $ %.2f%n",cliente.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = $ %.2f%n",cliente.total());
		
	
		
		
		
		sc.close();

	}

}
