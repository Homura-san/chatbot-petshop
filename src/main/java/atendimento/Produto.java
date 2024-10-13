package atendimento;

public class Produto {
  private String nome;
  private double qtd;
  private String preco;

  public Produto(String nome, double qtd, String preco){
    this.nome = nome;
    this.qtd = qtd;
    this.preco = preco;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setQtd(double qtd){
    this.qtd = qtd;
  }

  public double getQtd(){
    return this.qtd;
  }

  public void setPreco(String preco){
    this.preco = preco;
  }

  public String getPreco(){
    return this.preco;
  }

  public void exibir(){
    System.out.println(this.nome + " - " + this.preco);
  }
}