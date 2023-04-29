import java.util.Scanner;

//perguntar a primeira nota
//perguntar a segunda nota
//perguntar a terceira nota
//perguntar a quarta nota
//somar todas as notas
//divir o total pela quantidade de notas 
//printar para o usuario o resultado


class CalculoMedia {
  
     
	 
	
	public static void main(String args[]){  
	
   
    		Scanner teclado = new Scanner(System.in);
			
			Double nota1;
	        Double nota2;
	        Double nota3;
			Double nota4;
	        Double soma;
			Double media;
			
			
	    System.out.printf("Insira a nota do primeiro bimestre\n"); 
		nota1 = teclado.nextDouble();
             
			 
		System.out.printf("Insira a nota do segundo bimestre\n"); 
        nota2 = teclado.nextDouble(); 
		  
		  
		System.out.printf("Insira a nota do terceiro bimestre\n"); 
        nota3 = teclado.nextDouble();  


		System.out.printf("Insira a nota do quarto bimestre\n");
        nota4 = teclado.nextDouble();   


		
		soma = nota1 + nota2 + nota3 + nota4;
        
        media = soma / 4;

        System.out.printf("A media do aluno com as notas informadas é: %f\n", media);		
			
		
	
    		 

       System.exit(0);
		
	}

}
