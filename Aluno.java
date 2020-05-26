import java.util.ArrayList;

class Aluno {

  private String nome;
  //private Avaliacao avaliacao;
  private ArrayList<Avaliacao> avaliacoes;

  //construtor
  public Aluno(String n) {
      nome = n;
  }
  
  public String getNome() {
    return this.nome;
  }

  public ArrayList<Avaliacao> getAvaliacoes() {
    return this.avaliacoes;
  }

  public void adicionaAvaliacao(Avaliacao av) {
    this.avaliacoes.add(av);
  }




}