
public class TestaBoolean {
	public static void main(String[] args) {
		System.out.println("Testando condicionais com boolean");
		
//		DIMINUINDO A QUANT DE C�DIGO COM O USO DO "OU" ||
//		int idade=16;
//		int quantidadePessoas=3;
//		
//		if(idade >=18 || quantidadePessoas >=2) {
//			System.out.println("Seja bem vindo!");
//		}else {
//			System.out.println("Infelizmente voc� n�o pode entrar!");
//		}
		
//		USANDO O BOOLEAN
		
//		int idade=16;
//		boolean acompanhado=true;
//		
//		if(idade >= 18 || acompanhado) {
//			System.out.println("Seja bem vindo!");
//		}else {
//			System.out.println("Infelizemte vc n�o pode entrar");
//		}
	
//	
		int idade=18;
		int quantidadePessoas=1;
		boolean acompanhado=quantidadePessoas>=2; //se quantPessoas for maior igual 2 ser� true , sen�o false
		if(idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		}else {
			System.out.println("N�o pode entrar!");
		}
	}
}
