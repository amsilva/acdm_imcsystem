import java.util.ArrayList;
import java.util.Scanner;

class TesteTelaConsole {

  Scanner teclado = new Scanner(System.in);
  ArrayList<Aluno> grupo = new ArrayList<Aluno>();
  
  public void executar () {

    ArrayList<Aluno> grupo = new ArrayList<Aluno>();
    int op;
    boolean continua = true;

    while(continua) {

      System.out.println("** Menu de opçoes 1");
      System.out.println("-------------------");
      System.out.println("[1] novo aluno ");
      System.out.println("[2] nova avalicao ");
      System.out.println("[11] lista todos alunos ");
      System.out.println("[12] lista historico de alunos ");
      System.out.println("[0] sair ");
      System.out.println("-------------------");
      System.out.print("Digite a opção:_");

      op = teclado.nextInt();

      if (op == 0) continua = false;

      if (op == 1) this.incluiAluno();

      if (op == 11) this.listaTodosAlunos();



    }




   }
   

   private void incluiAluno() {
      System.out.println("\n** Cadastrando novo aluno");
      System.out.print("Digite o nome do aluno_");
      String nome = teclado.next();
      Aluno newAluno = new Aluno(nome);
      grupo.add(newAluno);
   }

  private void listaTodosAlunos() {
    System.out.println("Total de alunos: " + grupo.size());
    System.out.println("---------------------------");
    for (Aluno a : grupo) {
      System.out.println(a.getNome());
    }


  }






}