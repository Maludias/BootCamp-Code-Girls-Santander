import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fatorial: ");
		int fatorial = sc.nextInt();
		
		int mult = 1;
		
		System.out.print(fatorial + "! = ");
		for(int i = fatorial; i >= 1 ; i--) {
			mult = mult * i;
		}
		System.out.println(mult);
	}

}
