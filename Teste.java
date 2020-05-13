class Teste {

  public void executar() {

      Aluno aluno1 = new Aluno("Dolores");
      Avaliacao av11 = new Avaliacao(90,2);



    double indice = av11.indice();
    String situacao = av11.classificacao();

    //Relatorio saida
    System.out.println("Listagem de alunos:");
    System.out.println(aluno1.getNome());

    System.out.println("Indice = " + indice);
    System.out.println("Situacao = " + situacao);

  }

}