
import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private int id;
	private String nome;
	
	private	List<Turma> listaTurma = new ArrayList<Turma>();
	
	public List<Turma> getListaTurma() {
		return listaTurma;
	}

	public void setListaTurma(List<Turma> listaTurma) {
		this.listaTurma = listaTurma;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso (){
		
	}
	
    //Criar as listas para armazenar os dado do curso.
    List<String> turmas = new ArrayList<>();
    List<String> horario = new ArrayList<>();
    List<String> dataInicio = new ArrayList<>();
    List<String> turmasRelativas = new ArrayList<>();

    //Preenche as listas com dados dos cursos (Precisa ser melhorado).
    public void registroCursos(){

        turmas.add("turma1");
        turmas.add("turma2");
        turmas.add("turma3");

        horario.add("Manha");
        horario.add("Tarde");
        horario.add("Noite");

        dataInicio.add("01/01/23");
        dataInicio.add("01/01/23");
        dataInicio.add("01/01/23");

    }

    //Apresenta os dados dos cursos para usuario.
    public void mostraInforme(int i){
        System.out.println("------------------Informações do curso------------------------");
        System.out.println("Turma: " + turmas.get(i));
        System.out.println("Horario: " + horario.get(i));
        System.out.println("Data de inicio: " + dataInicio.get(i));
        System.out.println("--------------------------------------------------------------"); 
    }

}
