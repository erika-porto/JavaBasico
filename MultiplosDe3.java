
public class MultiplosDe3 {
	public static void main(String[] args) {
//	 NUMEROS MULTIPLOS DE 3 DE 1 A 100 IMPRIMIR

//	  utilizando o módulo
		
		for (int multiplos = 1; multiplos <= 100; multiplos++) {
			if (multiplos % 3 == 0) {
				System.out.print(multiplos + " ");
			}
		}
	}
}
