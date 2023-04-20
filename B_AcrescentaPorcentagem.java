package sintaxe_basica;
import java.util.Scanner;
public class B_AcrescentaPorcentagem {
	public static void main(String[]args) {
		Scanner scannerprecoproduto = new Scanner(System.in);
		double precoinicial, precofinaldoproduto;
		System.out.println("Digite o preco do produto que deseja acrescentar 10%: \n");
		precoinicial = scannerprecoproduto.nextDouble();
		precofinaldoproduto = (precoinicial * 0.1) + precoinicial;
		System.out.println("O preco do produto com acrescimo de 10% e: \n" + precofinaldoproduto);
		scannerprecoproduto.close();
	}

}
