
public class Fatorial {
	public static void main(String[] args) {
//	Fatorial ex 4!=1x2x3x4=24     6!=1x2x3x4x5x6=720
		
//		A LÓGICA DO FATORIAL CONSISTE QUE 4!=4 X 3! -> 4x6=24 
		int fatorial=1;
		for(int numero=1; numero <= 10; numero++) {
			fatorial *= numero;
				
			System.out.println("Fatorial de " + numero + " = " + fatorial + " ");
		}
	}
} 
