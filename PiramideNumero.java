
public class PiramideNumero {
   public static void main(String[] args) {
	  
//	  MONTANDO UMA PIR�MIDE
	   for(int linha = 0; linha < 5 ; linha++) {
		   for( int coluna = 0 ; coluna <5 ; coluna++) {
			   if( coluna > linha) {
				   break;
			   }
			   System.out.print(coluna+1);
		   }
		   System.out.println();
	   }
}
}
