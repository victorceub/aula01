package Aula01;
import java.util.Scanner;

public class Teclado {
	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Digite seu nome: ");
     String nome = scanner.nextLine();
     System.out.print("Digite sua idade: ");
     int idade = scanner.nextInt();
     System.out.print("Nome: " + nome);
     System.out.print("Idade: " + idade);
     scanner.close();
	}
}
