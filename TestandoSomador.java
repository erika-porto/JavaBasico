
public class TestandoSomador {
	public static void main(String[] args) {

		int contador = 0;
		int total = 0;
		
//		AQUI ELE MOSTRAR� TODOS OS N�MEROS ENVOLVIDOS AT� CONTADOR ATINGIR 10 :0,1,3,6,10...
//		while (contador <= 10) {
//			total = total + contador;
//			System.out.println(total);
//			contador++;
//		}
		
//		AQUI ELE MOSTRAR� O �LTIMO N�MERO
		while (contador <=10) {
			total+=contador;
			contador++;
		}
		System.out.println(total);
	}
}
