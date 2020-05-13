class Aluno {

  private String nome;
  private Avaliacao avaliacao;


  //construtor
  public Aluno(String n) {
      nome = n;
  }
  
  public String getNome() {
    return this.nome;
  }

  public Avaliacao getAvaliacao() {
    return this.avaliacao;
  }

  public void adicionaAvaliacao(Avaliacao av) {
    this.avaliacao = av;
  }




}