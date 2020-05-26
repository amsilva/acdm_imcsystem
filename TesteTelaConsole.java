import java.util.ArrayList;
import java.util.Scanner;

class TesteTelaConsole {

  Scanner teclado = new Scanner(System.in);
  ArrayList<Aluno> time = new ArrayList<Aluno>();
  
  public void executar () {

    int op;
    boolean continua = true;

    while(continua) {

      System.out.println("\n** Menu de opçoes 1");
      System.out.println("-------------------");
      System.out.println("[ 1] NOVO ALUNO");
      System.out.println("[ 2] NOVA AVALIACAO ");
      System.out.println("[11] TODOS ALUNOS ");
      System.out.println("[] HISTORICO ALUNO ");
      System.out.println("[ 0] sair ");
      System.out.println("-------------------");
      System.out.print("Digite a opção:_");

      op = teclado.nextInt();

      if (op == 0) continua = false;

      if (op == 1) this.incluiAluno();

      if (op == 2) this.incluiAvaliacao();

      if (op == 11) this.listaTodosAlunos();




    }




   }
   

   private void incluiAluno() {
      //System.out.println("\n** Cadastrando novo aluno");
      System.out.print("Digite o nome do aluno_");
      teclado.nextLine();
      String nome = teclado.nextLine();
      Aluno newAluno = new Aluno(nome);
      time.add(newAluno);
   }

   private void incluiAvaliacao() {
      //System.out.println("\n** Cadastrando nova avaliacao");
      this.listaTodosAlunos();
      System.out.print("indique o aluno_");
      int i = teclado.nextInt();

      System.out.print("peso_");
      float p = teclado.nextFloat();
      System.out.print("peso_");
      float a = teclado.nextFloat();

      Avaliacao newAvaliacao = new Avaliacao(p,a);

      //grupo.add(time.get(i-1).adicionaAvaliacao(newAvaliacao));
      time.get(i-1).adicionaAvaliacao(newAvaliacao);
   }

  private void listaTodosAlunos() {
    System.out.println("Total de alunos: " + time.size());
    System.out.println("---------------------------");
    int i = 1;
    for (Aluno a : time) {
      System.out.println(i++ + ") " + a.getNome());
    }


  }






}