import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		do {

			System.out.println("Número: ");
			numero = sc.nextInt();
			
			soma = soma + numero;
			if(numero > maior) maior = numero;
			
			count++;
		}while( count < 5);
		
		System.out.println("Maior Número: " + maior );
		System.out.println("Média dos Números: " + (soma/5));
	}

}
