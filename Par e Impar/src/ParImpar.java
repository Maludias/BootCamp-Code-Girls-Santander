import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros;
		int numero;
		int qtdPar = 0, qtdImp = 0;
		System.out.println("Digite os números: ");
		qtdNumeros = sc.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número");
			numero = sc.nextInt();
			if(numero % 2 == 0) qtdPar++;
			else qtdImp++;
			count++;
	    }while(count < qtdNumeros);
		System.out.println("quantidade de pares é :" + qtdPar);
		System.out.println("quantidade de impares é :" + qtdImp);

}
}