package pet;

public class Cachorro extends Animal {
  private String raca;

  public Cachorro(String nome, int idade, String raca){
    
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
