
public class ImpostoRenda {
   public static void main(String[] args) {
//	 REGRAS DO IMPOSTO DE RENDA :
//	   *1900 AT� 2800 O IR 7.5% , DEDU��O DE 142 REAIS 
//	   *2800 AT� 3751 O IR 15%, DEDU��O DE 350 REIAS
//	   *3751 AT� 4664 O IR 22.5%,DEDU��O DE 636 REAIS 
	   
	   double salario=1900.0;
	   if(salario >=3751.00 && salario <= 4664.00) {
		   System.out.println("O imposto � de 22.5% , dedu��o de 636 reais ");
	   }else if(salario >=2800 && salario < 3751.00) {
		   System.out.println("O imposto � de 15%, dedu��o de 350 reais");
	   }else if(salario >=1900.00 && salario < 2800.00){
		   System.out.println("O imposto � de 7.5%, dedu��o de 142 reais ");
	   }else {
		   System.out.println("Est� acima ou abaixo do quadro");
	   }
}
}
