class Avaliacao {

  private float peso;
  private float altura;

  public Avaliacao(float p, float a) {
    this.peso = p;
    this.altura = a;
  }

  public float indice() {
    retunr this.peso / (this.altura * this.altura);
  }

  public String clasificacao(){
    if (this.indice() < 18) 
      return "MAGRO";
    else if (this.indice() > 30) 
      return "OBESO";
    else 
      return "REGULAR";
  }

}