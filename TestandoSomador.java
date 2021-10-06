
public class TestandoSomador {
	public static void main(String[] args) {

		int contador = 0;
		int total = 0;
		
//		AQUI ELE MOSTRARÁ TODOS OS NÚMEROS ENVOLVIDOS ATÉ CONTADOR ATINGIR 10 :0,1,3,6,10...
//		while (contador <= 10) {
//			total = total + contador;
//			System.out.println(total);
//			contador++;
//		}
		
//		AQUI ELE MOSTRARÁ O ÚLTIMO NÚMERO
		while (contador <=10) {
			total+=contador;
			contador++;
		}
		System.out.println(total);
	}
}
