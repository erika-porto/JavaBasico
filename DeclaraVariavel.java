
public class DeclaraVariavel {
    public static void main(String[] args) {
	    System.out.println("A vari�vel se declarada dentro de um escopo , s� existe ali.");
	    
	    int idade=16;
	    int quantidadePessoas=1;
	    
//	    � PRECISO INICIALIZAR A VARI�VEL FORA DO ESCOPO QUE ELA SER� USADA , SE QUISERMOS USAR FORA 
	    boolean acompanhado;
	    
	    if(quantidadePessoas >=2) {
	    	acompanhado=true;
	    }else {
	        acompanhado=false;
	    }
	    
	    if(idade >=18 || acompanhado) {
	    	System.out.println("bem vindo!");
	    }else {
	    	System.out.println("n�o pode entrar!");
	    }
	}
}
