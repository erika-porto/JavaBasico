
public class DeclaraVariavel {
    public static void main(String[] args) {
	    System.out.println("A variável se declarada dentro de um escopo , só existe ali.");
	    
	    int idade=16;
	    int quantidadePessoas=1;
	    
//	    É PRECISO INICIALIZAR A VARIÁVEL FORA DO ESCOPO QUE ELA SERÁ USADA , SE QUISERMOS USAR FORA 
	    boolean acompanhado;
	    
	    if(quantidadePessoas >=2) {
	    	acompanhado=true;
	    }else {
	        acompanhado=false;
	    }
	    
	    if(idade >=18 || acompanhado) {
	    	System.out.println("bem vindo!");
	    }else {
	    	System.out.println("não pode entrar!");
	    }
	}
}
