import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para saber a tabuada: ");
		int tabuada = sc.nextInt();
		int mult = 1;
		
		System.out.println("Tabuada do número: " + tabuada);
		
		for( int i = mult; i <= 10  ; i++) {
			
			System.out.println(tabuada + "x" + i + "=" + (tabuada*i) );
			 sc.close();
		}
	}

}
