package atendimento;

import pet.*;

public class Usuario {

  private String nome;
  private String endereco;
  private String tel;
  private Gato gato;
  private Cachorro cachorro;

  public Usuario (String nome, String endereco, String tel){
    this.nome = nome;
    this.endereco = endereco;
    this.tel = tel;
  }

  public void setCachorro(Cachorro cachorro){
    this.cachorro = cachorro;
  }
  
  public void setGato(Gato gato){
    this.gato = gato;
  }

  public void setSexoPet(String pet , String sexo){
    if (pet == "gato"){
      this.gato.setSexo(sexo);
    } else if (pet == "cachorro"){
      this.cachorro.setSexo(sexo);
    }
  }

  public String getSexoPet(String pet){
    if (pet == "gato"){
      return this.gato.getSexo();
    } else if (pet == "cachorro"){
      return this.cachorro.getSexo();
    } else {
      return pet;
    }
  }  

  public void setNomePet(String pet , String nome){
    if (pet == "gato"){
      this.gato.setNome(nome);
    } else if (pet == "cachorro"){
      this.cachorro.setNome(nome);
    }
  }

  public String getNomePet(String pet){
    if (pet == "gato"){
      return this.gato.getNome();
    } else if (pet == "cachorro"){
      return this.cachorro.getNome();
    } else {
      return pet;
    }
  }

  public void setIdadePet(String pet, int idade){
    if (pet == "gato"){
      this.gato.setIdade(idade);
    } else if (pet == "cachorro"){
      this.cachorro.setIdade(idade);
    }
  }

  public void getIdadePet(String pet){
    if (pet == "gato"){
      this.gato.getIdade();
    } else if (pet == "cachorro"){
      this.cachorro.getIdade();
    }
  }

  public void setRacaPet(String pet, String raca){
    if (pet == "gato"){
      this.gato.setRaca(raca);
    } else if (pet == "cachorro"){
      this.cachorro.setRaca(raca);
    }
  }

  public void getRacaPet(String pet){
    if (pet == "gato"){
      this.gato.getRaca();
    } else if (pet == "cachorro"){
      this.cachorro.getRaca();
    }
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco( String endereco) {
    this.endereco = endereco;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public void dados() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Endereço: " + this.endereco);
    System.out.println("Telefone: " + this.tel);
  }
}


