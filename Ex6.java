import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		    
		         Scanner teclado = new Scanner(System.in);
		         
					int nota1, nota2, nota3;
					int media, i, Total = 0;
					
					for(i = 0; i < 3; i++){
					    
					    contAluno++;
					    
					    System.out.println("Aluno " + Total + ", digite sua 1� nota");
					    nota1 = teclado.nextInt();
					    
					    
					    System.out.println("Aluno " + Total + ", digite sua 2� nota");
					    nota2 = teclado.nextInt();
					    
					    
					    System.out.println("Aluno " + Total + ", digite sua 3� nota");
					    nota3 = teclado.nextInt();
					    
					    
					    media = (nota1 + nota2 + nota3) / 3;
					    System.out.println("A m�dia do aluno " + Total + " � " + media);
					    
					    
					    if( (media >= 0) && (media <4) ){
					        System.out.println("Nota E");
					    } else if(media < 5){
					        System.out.println("Nota D");
					    } else if(media < 7){
					        System.out.println("Nota C");
					    } else if(media < 8){
					        System.out.println("Nota B");
					    } else if(media <= 10){
					        System.out.println("Nota A");
					    }
					}
				} 
	}

