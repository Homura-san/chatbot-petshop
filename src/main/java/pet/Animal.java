package pet;

public class Animal{
  private String nome;
  private int idade;
  private String sexo;

  public Animal(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public void setSexo(String sexo){
    this.sexo = sexo;
  }

  public String getSexo(){
    return this.sexo;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public int getIdade(){
    return this.idade;
  }
  
  public void exibirDetalhes() {
    System.out.println("Nome: " + this.nome + " " + "Idade: "+ this.idade);
  }
}