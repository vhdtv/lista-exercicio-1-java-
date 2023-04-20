package sintaxe_basica;
import java.util.Scanner;
public class J_CalculoMedias{
	public static void main(String[]args){
		double A, B, C, mediaAritmetica, mediaHarmonica, mediaGeometrica;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de A, B e C:");
		A = scan.nextDouble();	
		B = scan.nextDouble();
		C = scan.nextDouble();
		mediaAritmetica = (A+B+C)/3;
		mediaHarmonica = 3 / ((1/A) + (1/B) + (1/C));
		mediaGeometrica = Math.cbrt(A*B*C);
		System.out.printf("O valor da Media Aritmetica é:%.2f.\nO valor da Media Harmonica"
				+ " é:%.2f.\nO valor da Media Geometrica"
				+ " é:%.2f.\n",mediaAritmetica, mediaHarmonica,mediaGeometrica);
		scan.close();
	}
}
