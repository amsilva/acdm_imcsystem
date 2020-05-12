class Teste {

  public void executar() {

      Aluno a = Aluno("Dolores");
      Avaliacao m1 = Avaliacao(90,2);



    double indice = m1.indice();
    String situacao = m1.classificacao(indice);

    //Relatorio saida
    System.out.println("Listagem de alunos:");
    System.out.println(aluno.getNome());

    System.out.println("Indice = " + indice);
    System.out.println("Situacao = " + situacao);

  }

}