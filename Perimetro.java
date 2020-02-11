

		import java.util.*;

		class Main {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        
				System.out.println("Base: ");		
				int base = sc.nextInt();
				System.out.println("Altura: ");
				int altura = sc.nextInt();
				sc.close();
				 
				int area = (base*altura);
				int perimetro = (base*2+altura*2);
				
				
				System.out.println("Area: " + area);
				System.out.println("Perimetro: " + perimetro );
			}
			
		}
