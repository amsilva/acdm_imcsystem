import java.util.ArrayList;
import java.util.Scanner;

class TesteMenuConsole {

  Scanner teclado = new Scanner(System.in);
  ArrayList<Aluno> academia = new ArrayList<Aluno>();

  public void executar() {

    int op;
    boolean continua = true;

    while (continua) {

      System.out.println("\n** MENU");
      System.out.println("-------------------");
      System.out.println(" 1 [+] ALUNO");
      System.out.println(" 2 [+] AVALIACAO ");
      System.out.println("11 [>] LISTAGEM ");
      System.out.println("12 [>] HISTORICO ");
      System.out.println(" 0 [X] SAIR ");
      System.out.println("-------------------");
      System.out.print("opção:_ ");

      op = teclado.nextInt();

      if (op == 0)
        continua = false;

      if (op == 1)
        this.incluiAluno();

      if (op == 2)
        this.incluiAvaliacao();

      if (op == 11)
        this.listaTodosAlunos();

      if (op == 12)
        this.historicoAluno();

    }

  }

  private void incluiAluno() {
    System.out.print("nome_ ");
    teclado.nextLine();
    String nome = teclado.nextLine();
    Aluno newAluno = new Aluno(nome);
    academia.add(newAluno);
  }

  private void incluiAvaliacao() {
    this.listaTodosAlunos();
    System.out.print("selecione aluno_ ");
    int pos = teclado.nextInt();

    System.out.print("peso_ ");
    float p = teclado.nextFloat();
    System.out.print("altura_ ");
    float a = teclado.nextFloat();

    Avaliacao newAvaliacao = new Avaliacao(p, a);
    academia.get(pos - 1).adicionaAvaliacao(newAvaliacao);
  }

  private void listaTodosAlunos() {
    System.out.println("Total de alunos: " + academia.size());
    System.out.println("---------------------------");
    int i = 1;
    for (Aluno a : academia) {
      System.out.println(i++ + ") " + a.getNome());
    }
  }

  private void historicoAluno() {
    this.listaTodosAlunos();
    System.out.print("indique o aluno_ ");
    int pos = teclado.nextInt();
        
    Aluno alunoTemp = academia.get(pos - 1);
    ArrayList<Avaliacao> avalsTemp = alunoTemp.getAvaliacoes();

    System.out.println("Historico de avaliacoes: " + academia.size());
    System.out.println("------------------------");
    System.out.println("Aluno: " + alunoTemp.getNome());
    System.out.println("Avaliacoes: ");
    if (avalsTemp != null) {
      int i = 1;
      for (Avaliacao umaAval : avalsTemp) 
        System.out.println(i + ") " + umaAval.indice() + " [" + umaAval.classificacao() +"]"); 
    }
    
  }

}