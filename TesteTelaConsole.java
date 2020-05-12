import java.util.ArrayList;

class TesteTelaConsole {

   public void executar () {

    ArrayList<Aluno> academia = new ArrayList<Aluno>();
    Scanner teclado = new Scanner(System.in);


     while(true) {

      System.out.println("** Menu de opçoes 1");
      System.out.println("[1] novo aluno ");
      System.out.println("[2] nova avalicao ");
      System.out.println("[11] lista todos alunos ");
      System.out.println("Digite a opção:_");



      if (op == 1) this.incluiAluno();

      if (op == 11) this.listaTodosAlunos();



     }













   }
   

   private void incluiAluno() {
      System.out.println("** Cadastrando novo aluno");
      System.out.println("Digite o nome do aluno_");
      String nome = teclado.nextLine();
      Aluno newAluno = new Aluno(nome);
      academia.add(newAluno);
   }

  private void listaTodosAlunos() {
    Systemout.println("Total de alunos: " + academia.lenght());
    Systemout.println("---------------------------");
    for (Aluno a : academia) {
      Systemout.println(a.getNome());
    }


  }






}