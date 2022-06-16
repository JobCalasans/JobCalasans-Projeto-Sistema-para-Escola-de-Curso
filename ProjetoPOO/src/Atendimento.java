
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atendimento {
	
	//Listas para popular alunos e cursos cadastrados.
	private List<Aluno> alunosCadastrados = new ArrayList<Aluno>();
	private List<Curso> cursosCadastrados = new ArrayList<Curso>();
	
	//Construtor responsável por fazer carregamento de alunos e cursos.
	public Atendimento() {
		
		carregaAlunos();
		carregaCursos(this.alunosCadastrados);
		
	}
	
	//Traz alunos cadastrados.
	public List<Aluno> getAlunosCadastrados() {
		return alunosCadastrados;
	}

	//Traz cursos cadastrados.
	public List<Curso> getCursosCadastrados() {
		return cursosCadastrados;
	}

	public void carregaAlunos() {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		Aluno a7 = new Aluno();
		Aluno a8 = new Aluno();
		
		a1.setId(1);
		a1.setNome("Jobson");
		a1.setCpf("25610942177");
		a1.setEmail("jobson@gmail.com");
		a1.setNumero(985741237);
		
		this.alunosCadastrados.add(a1);
		
		a2.setId(2);
		a2.setNome("Flavio");
		a2.setCpf("58711154786");
		a2.setEmail("flavio@gmail.com");
		a2.setNumero(945871224);
		
		this.alunosCadastrados.add(a2);
		
		a3.setId(3);
		a3.setNome("Bruno");
		a3.setCpf("15874154784");
		a3.setEmail("brunorgmail.com");
		a3.setNumero(945871224);
		
		this.alunosCadastrados.add(a3);
		
		a4.setId(4);
		a4.setNome("Larissa");
		a4.setCpf("1482448621");
		a4.setEmail("larissa@gmail.com");
		a4.setNumero(945871224);
		
		this.alunosCadastrados.add(a4);
		
		a5.setId(5);
		a5.setNome("João");
		a5.setCpf("4642131321");
		a5.setEmail("joao@gmail.com");
		a5.setNumero(985741237);
		
		this.alunosCadastrados.add(a5);
		
		a6.setId(6);
		a6.setNome("Rafael");
		a6.setCpf("98789746464");
		a6.setEmail("rafael@gmail.com");
		a6.setNumero(945871224);
		
		this.alunosCadastrados.add(a6);
		
		a7.setId(7);
		a7.setNome("Susie");
		a7.setCpf("15874154784");
		a7.setEmail("susie@gmail.com");
		a7.setNumero(945871224);
		
		this.alunosCadastrados.add(a7);
		
		a8.setId(8);
		a8.setNome("Marcos");
		a8.setCpf("98264184514");
		a8.setEmail("marcos@gmail.com");
		a8.setNumero(945871224);
		
		this.alunosCadastrados.add(a8);
		
	}
	
	public void carregaCursos(List<Aluno> a) {
		
		Curso c1 = new Curso();
		
		c1.setId(1);
		c1.setNome("Matemática");
		
		Turma t1 = new Turma();
		Turma t2 = new Turma();
		
		t1.setId(1);
		t1.setTurno("noite");
		t1.setDataInicio("01/08/2022");
		t1.setHorarioInicio("19:00");
		t1.setHorarioFim("21:50");
		
		t2.setId(2);
		t2.setTurno("manhã");
		t2.setDataInicio("03/07/2022");
		t2.setHorarioInicio("7:00");
		t2.setHorarioFim("12:00");
		
		Matricula m1 = new Matricula();
		Matricula m2 = new Matricula();
		Matricula m3 = new Matricula();
		Matricula m4 = new Matricula();
		
		m1.setId(202201);
		m1.setIdAluno(a.get(0).getId());
		
		t1.getListaMatricula().add(m1);
		
		m2.setId(202202);
		m2.setIdAluno(a.get(1).getId());
		
		t1.getListaMatricula().add(m2);
		
		t1.setQtdAlunos(t1.getListaMatricula().size());
		
		c1.getListaTurma().add(t1);
		
		//------------------------------------------------
		
		m3.setId(202203);
		m3.setIdAluno(a.get(2).getId());
		
		t2.getListaMatricula().add(m3);
		
		m4.setId(202204);
		m4.setIdAluno(a.get(3).getId());
		
		t2.getListaMatricula().add(m4);
		
		t2.setQtdAlunos(t2.getListaMatricula().size());
		
		c1.getListaTurma().add(t2);
		
		this.cursosCadastrados.add(c1);
		
		//------------------------------------------------
		
		Curso c2 = new Curso();
		
		c2.setId(2);
		c2.setNome("Português");
		
		Turma t3 = new Turma();
		Turma t4 = new Turma();
		
		t3.setId(3);
		t3.setTurno("noite");
		t3.setDataInicio("01/08/2022");
		t3.setHorarioInicio("19:00");
		t3.setHorarioFim("21:50");
		
		t4.setId(4);
		t4.setTurno("manhã");
		t4.setDataInicio("03/07/2022");
		t4.setHorarioInicio("7:00");
		t4.setHorarioFim("12:00");
		
		Matricula m5 = new Matricula();
		Matricula m6 = new Matricula();
		Matricula m7 = new Matricula();
		Matricula m8 = new Matricula();
		
		m5.setId(202205);
		m5.setIdAluno(a.get(4).getId());
		
		t3.getListaMatricula().add(m5);
		
		m6.setId(202206);
		m6.setIdAluno(a.get(5).getId());
		
		t3.getListaMatricula().add(m6);
		
		t3.setQtdAlunos(t3.getListaMatricula().size());
		
		c2.getListaTurma().add(t3);
		
		//------------------------------------------------
		
		m7.setId(202207);
		m7.setIdAluno(a.get(6).getId());
		
		t4.getListaMatricula().add(m7);
		
		m8.setId(202208);
		m8.setIdAluno(a.get(7).getId());
		
		t4.getListaMatricula().add(m8);
		
		t4.setQtdAlunos(t4.getListaMatricula().size());
		
		c2.getListaTurma().add(t4);
		
		this.cursosCadastrados.add(c2);
		
	}
	
	//Método responsável por fazer o cadastro do aluno em uma turma.
	public void iniciaCadastro() {
		
		int escolhaInt = 0;
    	int cursoSelecionado = 0;
    	int turmaSelecionada = 0;
    	
    	String escolhaString = "";
    	
    	boolean escolhaTurma = false;
    	boolean estaCadastrado = false;

    	Aluno aluno = null;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu CPF:");
        
        escolhaString = scan.nextLine();
        
        estaCadastrado = verificaCadastro(escolhaString);
        
        /*Se o aluno não está cadastrado no sistema, deve ser cadastrado.
         * Caso já tenha sido cadastrado, guarda o objeto aluno para uso.*/
        if(!estaCadastrado) {
        	
        	System.out.println("Você ainda não está cadastrado! Realize o cadastro a seguir:");
        	aluno = realizaCadastro(escolhaString, scan);
        	
        } else {
        	aluno = pegaAlunoPorCpf(escolhaString);
        }
        
        System.out.println("Informe o numero do curso que se interessou, para saber mais informações:");
        
        mostrarCursos();
        
        escolhaInt = Integer.parseInt(scan.nextLine());
        cursoSelecionado = escolhaInt;

        System.out.println("Informe a turma desejada:");
        
        exibeTurmas(cursoSelecionado, false);
        
        //Caso a turma selecionada estiver lotada, a aplicação dá a opção de escolher outra turma.
        while(escolhaTurma == false) {
        	
        	escolhaInt = Integer.parseInt(scan.nextLine());
            turmaSelecionada = escolhaInt;
            
            escolhaTurma = realizaMatricula(cursoSelecionado, turmaSelecionada, aluno.getId());
        	
        }
        
        exibeAlunosTurma(cursoSelecionado, turmaSelecionada, getAlunosCadastrados());
        
	}
	
	//Verifica se o aluno está cadastrado no sistema.
	public boolean verificaCadastro(String cpf) {
		
		for(Aluno aluno : this.alunosCadastrados){
			if(aluno.getCpf().equals(cpf))
				return true;
		}
		
		return false;
	
	}
	
	//Traz um objeto do tipo aluno com base em seu CPF.
	public Aluno pegaAlunoPorCpf(String cpf) {
		
		for(Aluno aluno : this.alunosCadastrados)  {
			if(aluno.getCpf().equals(cpf))
				return aluno;
		}
		
		return null;
		
	}
	
	public void mostraAlunosCadastrados() {
		
		System.out.println("-------------- Alunos Cadastrados --------------");
		
		for(Aluno aluno : this.alunosCadastrados)  {
			
			System.out.println("ID: " + aluno.getId() + " - " +
							   "Nome: " + aluno.getNome() + " - " +
							   "CPF: " + aluno.getCpf() + " - " +
							   "Número: " + aluno.getNumero() + " - " +
							   "Email: " + aluno.getEmail());			
		
		}
		
	}
	
	//Faz o cadastro do aluno no sistema.
	public Aluno realizaCadastro(String cpf, Scanner scan) {
		
		int numeroAlunos = this.getAlunosCadastrados().size();
		int escolhaInt = 0;
		
		String escolhaString = "";
		
		Aluno aluno = new Aluno();
		
		aluno.setId(numeroAlunos + 1);
		aluno.setCpf(cpf);
		
		System.out.println("Digite seu nome: ");
		
		escolhaString = scan.nextLine();
		aluno.setNome(escolhaString);
		
		System.out.println("Digite seu email: ");
		
		escolhaString = scan.nextLine();
		aluno.setEmail(escolhaString);
		
		this.getAlunosCadastrados().add(aluno);
		
		System.out.println("Digite seu número: ");
		
		escolhaInt = Integer.parseInt(scan.nextLine());
		aluno.setNumero(escolhaInt);
		
		System.out.println("Cadastro efetuado!");
		
		return aluno;
		
	}

    //Exibe cursos cadastrados.
    public void mostrarCursos() {
    	
    	System.out.println("-------------- Cursos Diponíveis --------------");
    	
    	for(Curso curso : this.cursosCadastrados) {
    		System.out.println(curso.getId() + " " + curso.getNome());
		}
    	
    	System.out.println("---------------------------------------------");
       
    }
    
    //Exibe as turmas do curso em questão.
    public void exibeTurmas(int idCurso, boolean modoExibicao) {
    	
    	Curso cursoSelecionado = this.cursosCadastrados.get(idCurso - 1);
    	
    	if(!modoExibicao)
    		System.out.println("-------------- Turmas Diponíveis " + cursoSelecionado.getNome() + " --------------");
    			
		for(Turma turma : cursoSelecionado.getListaTurma()) {
			
			System.out.println("Turma: (" + turma.getId() + ") | " + 
							   " Turno: " + turma.getTurno() + " | " +
							   " Data de início: " + turma.getDataInicio() + " | " +
							   " Horário: " + turma.getHorarioInicio() + " até " + turma.getHorarioFim() + " | " +
							   " Matrículas: " + "(" + turma.getQtdAlunos() + "/" + turma.getQtdMaxima() + ")");
			
		}
    	
    }
    
    //Faz a listagem dos cursos e das turmas de forma mais completa.
	public void mostraCursosTurmas() {
			
		for(Curso curso : this.cursosCadastrados)  {
			
			System.out.println("(------------------ Curso " + curso.getNome() + " ------------------)");
			
			for(Turma turma : curso.getListaTurma()) {
	    		
				System.out.println("#------------------# Turma " + turma.getId() + " #------------------#");
				
				for(Matricula matricula : turma.getListaMatricula()) {
					
					System.out.println("Matrícula: " + matricula.getId() + " - " + 
							this.getAlunosCadastrados().get(matricula.getIdAluno() - 1).getNome() + " - " + 
							this.getAlunosCadastrados().get(matricula.getIdAluno() - 1).getCpf());
					
				}
	    		
	    	}
			
		}
			
	}
    
	//Faz a listagem dos cursos e das turmas.
    public void exibeAlunosTurma(int idCurso, int idTurma, List<Aluno> alunos) {
    	
    	Curso cursoSelecionado = this.cursosCadastrados.get(idCurso - 1);
    	Turma turmaSelecionada = null;  
    	
		for(Turma turma : cursoSelecionado.getListaTurma()) {
		    		
    		if(turma.getId() == idTurma) {
    			turmaSelecionada = turma;
    			break;
    		}
    		
    	}
    	
    	System.out.println("-------------- Turma " + turmaSelecionada.getId() + " - " + cursoSelecionado.getNome() + " --------------");
    	
    	for(Matricula matricula : turmaSelecionada.getListaMatricula()) {
    		
    		System.out.println("Matrícula: " + matricula.getId() + " - " + 
    							alunos.get(matricula.getIdAluno() - 1).getNome() + " - " + 
    							alunos.get(matricula.getIdAluno() - 1).getCpf());
    	
    	}
    	
    }
    
    //Realiza a matrícula do aluno em uma turma.
    public boolean realizaMatricula(int idCurso, int idTurma, int idAluno) {
    	
    	//O "-1" é utilizado por que o id do curso menos 1 é sua posição no array.
    	Curso cursoSelecionado = this.cursosCadastrados.get(idCurso - 1);
    	Turma turmaSelecionada = null;
    	
    	int indice = 0;
    	
    	/*Laço for utilizado para capturar qual o indice 
    	 * da posição da turma selecionada no array de turmas cadastradas 
    	 * para o curso selecionado.
    	 */
    	for(Turma turma : cursoSelecionado.getListaTurma()) {
    		
    		if(turma.getId() == idTurma) {
    			turmaSelecionada = turma;
    			break;
    		}
    		
    		indice++;
    	
    	}
    	
    	int qtdMatriculados = turmaSelecionada.getQtdAlunos();
    	
    	Matricula matricula = new Matricula();
    	
    	//Matrícula é o ano vigente + zero + id do aluno.
    	String idMatricula = "2022" + "0" + idAluno;
    	
    	matricula.setId(Integer.parseInt(idMatricula));
    	matricula.setIdAluno(idAluno);
    	
    	//Verifica se ao se matricular em uma turma, esta turma já está lotada.
    	//Caso não esteja lotada, realiza matrícula.
    	if(turmaSelecionada.getQtdAlunos() == turmaSelecionada.getQtdMaxima()) {
    		
    		System.out.println("A turma atingiu o número máximo de matrículas! digite outro número.");
    		return false;
    		
    	} else {
    		
    		//Adiciona matrícula na turma do curso selecionado.
    		this.cursosCadastrados.get(idCurso - 1).getListaTurma().get(indice).getListaMatricula().add(matricula);
    		
    		//Adiciona +1 no número de alunos matriculados na turma do curso selecionado.
    		this.cursosCadastrados.get(idCurso - 1).getListaTurma().get(indice).setQtdAlunos(qtdMatriculados + 1);
    		
    		System.out.println("Matrícula efetuada!");
    		
    		return true;
    		
    	}
    	
    }
    
}
