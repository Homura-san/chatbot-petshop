package pet;

public class Gato extends Animal {
  private String raca;

  public Gato(String nome, int idade, String raca){

    super(nome, idade);
    this.raca = raca;
  }
  public void setRaca(String raca){
    this.raca = raca;
  }
  public String getRaca(){
    return raca;
  }
    
  public void exibirDetalhes(){
    super.exibirDetalhes();
  }
}