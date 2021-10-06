
public class ImpostoRenda {
   public static void main(String[] args) {
//	 REGRAS DO IMPOSTO DE RENDA :
//	   *1900 ATÉ 2800 O IR 7.5% , DEDUÇÃO DE 142 REAIS 
//	   *2800 ATÉ 3751 O IR 15%, DEDUÇÃO DE 350 REIAS
//	   *3751 ATÉ 4664 O IR 22.5%,DEDUÇÃO DE 636 REAIS 
	   
	   double salario=1900.0;
	   if(salario >=3751.00 && salario <= 4664.00) {
		   System.out.println("O imposto é de 22.5% , dedução de 636 reais ");
	   }else if(salario >=2800 && salario < 3751.00) {
		   System.out.println("O imposto é de 15%, dedução de 350 reais");
	   }else if(salario >=1900.00 && salario < 2800.00){
		   System.out.println("O imposto é de 7.5%, dedução de 142 reais ");
	   }else {
		   System.out.println("Está acima ou abaixo do quadro");
	   }
}
}
