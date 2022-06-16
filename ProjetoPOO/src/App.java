
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) throws Exception {
    	
    	//Variável utilizada para fazer o input da opção escolhida.
    	int escolhaInt = 1;
        
    	//Instância do objeto principal utilizado para fazer as ações e scanner para permitir input.
    	Atendimento atendimento = new Atendimento();
        Scanner scan = new Scanner(System.in);
        
        //Laço de repetição que contém os menus.
        while(escolhaInt > 0) {
        	
        	System.out.println("1 - Iniciar cadastramento");
            System.out.println("2 - Exibir alunos cadastrados");
            System.out.println("3 - Exibir cursos e turmas");
            System.out.println("0 - Encerra aplicação");
        	
	    	 escolhaInt = Integer.parseInt(scan.nextLine());
	         
	         switch(escolhaInt) {
	         
	 		    case 1:
	 		    	atendimento.iniciaCadastro();
	 		    	break;
	 		    case 2:
	 		    	atendimento.mostraAlunosCadastrados();
	 		    	break;
	 		    case 3:
	 		    	atendimento.mostraCursosTurmas();
	 		    	break;
	 		    case 0:
	 		    	System.out.println("Fim da execução!");
	 		    	break;
	         		
	         }
        	
        }
        
        scan.close();
        
    }

}
