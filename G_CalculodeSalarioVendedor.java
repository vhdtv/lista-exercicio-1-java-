package sintaxe_basica;
import java.util.Scanner;
public class G_CalculodeSalarioVendedor {
	public static void main(String[]args) {
		Scanner scannervalores = new Scanner(System.in);
		double salariofixo, percentualporvenda, salariototal, vendasmes, percent;
		System.out.println("Digite o seu salario fixo mensal, o valor total de vendas realizadas no mes e  percentual que ele ganha sobre o total das\n"
				+ "vendas mensais:");
		salariofixo = scannervalores.nextDouble();	
		vendasmes = scannervalores.nextDouble();	
		percent = scannervalores.nextDouble();	
		percentualporvenda = percent/100;
		salariototal = salariofixo + vendasmes + (vendasmes * percentualporvenda);
		scannervalores.close();
		System.out.println("O vendedor ira receber: " + salariototal);
	}
	
	
}
