package ContaBancaria;
import java.util.Scanner;

public class ContaTerminal {
//Programa que simula a abertura de uma conta bancária via terminal.
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
	 System.out.println("informe seu nome: ");
	  String nome= sc.nextLine();
	  System.out.println("informe sua agencia: ");
	  String agencia= sc.nextLine();
	  System.out.println("informe o numero da sua conta: ");
	  int numero = sc.nextInt();
	  System.out.println("informe seu saldo bancario: ");
	  float saldo = sc.nextFloat();
	  System.out.println(" __________________________________________");
	  System.out.printf("| %-40s |\n", "nome: " + nome);
	  System.out.printf("| %-40s |\n", "agencia: " + agencia);
	  System.out.printf("| %-40s |\n", "numero da sua conta: " + numero);
	  System.out.printf("| %-40s |\n", "saldo disponivel para saque: " + saldo);
	  System.out.println("|__________________________________________|");
	  sc.close();
	}
}
