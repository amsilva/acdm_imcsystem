class Teste {

  public void executar() {

      Aluno aluno1 = new Aluno("Dolores");
      Avaliacao av11 = new Avaliacao(90,2);
      
      aluno1.adicionaAvaliacao(av11);


    //Relatorio saida
    System.out.println("\nListagem de alunos:");
    System.out.println("-------------------");
    this.mostraAluno(aluno1);

  }

  private void mostraAluno(Aluno a) {

    System.out.println(a.getNome());
    //System.out.println("Indice = " + a.getAvaliacao().indice());
    //System.out.println("Situacao = " + a.getAvaliacao().classificacao());

  }



}