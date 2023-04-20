package sintaxe_basica;
import java.util.Scanner;
public class H_ContaCarroseMotos{
	public static void main(String[]args){
		int contaveiculos, contarodas = 0, contacarro=0, contamoto=0, i, veiculos;
		Scanner scan = new Scanner(System.in);
		for(i=1; i >0; i++) {
			System.out.printf("Digite para moto 1 para carro 2 e para sair 3:\n");
			contaveiculos = scan.nextInt();
			switch(contaveiculos){
			case 1:
				 contarodas = contarodas + 2;
				 contacarro++;
				 break;
			case 2:
				contarodas = contarodas + 4;
				contamoto++;
				break;
			case 3:
				i = -1;
				break;
			default:
				System.out.printf("Numero escolhido inválido digite para carro 1 "
						+ "para moto 2 e para sair 3:\\n ");
			}
		}
		veiculos = contamoto + contacarro;
		System.out.printf("O numero de carros é:%d.\n"
				+ "O numero de motos é:%d.\nO numero de veiculos é:%d.\n"
				+ "O numero de rodas é:%d.\n", contacarro, contamoto,veiculos, contarodas);
		scan.close();
	}
}

