package atendimento;

import java.util.ArrayList;
import java.util.Scanner;

public class Bot {
  private ArrayList<Produto> destaques;

  public Bot(){
    this.destaques = new ArrayList<Produto>();
    this.destaques.add(new Produto("Ração Pedigree", 1.0, "16,00"));
    this.destaques.add(new Produto("Ração Whiskas", 1.0, "18,50"));
    this.destaques.add(new Produto("Coleira para cães", 1.0, "8,90"));
    this.destaques.add(new Produto("Coleira para gatos", 1.0, "8,90"));
    // this.destaques.add("5 - Não encontrei meu produto, falar com atendente. \n");
  }
  
  public void start(){
    System.out.println("Bem-vindo ao Pet & Cia!\n");
    System.out.println("Cuidamos do seu pet com todo amor e carinho. ");
}

  public void separa(){
    System.out.println("----------------------------------------");
  }

  public void menu(){
    this.separa();
    System.out.println("Como podemos ajudar você hoje? Escolha uma das opções abaixo:\n");
    System.out.println("1- Produtos para Pets - Se você procura ração, brinquedos, ou outros produtos, digite 1.");
    System.out.println("2 - Banho e Tosa - Para agendar um banho ou tosa, digite 2.");
    //System.out.println("3 - Serviços Especiais - Quer saber mais sobre nossos serviços adicionais? Digite 3.\n");
  }

  public Produto delivery1(){
    this.separa();
    ArrayList<Produto> destaque = this.destaques;
    int i;
    int n = destaque.size();

    System.out.println("\n Escolha o produto desejado: \n");
    for (i=0; i<n; i++){
      System.out.println((i+1) + "- " + destaque.get(i).getNome() + " " + "R$" + destaque.get(i).getPreco());
    }
    System.out.println("5 - Não encontrei o produto que queria, desejo falar com o atendente.");

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    if (a <= n){
      return destaques.get(a-1);
    } else {
      // Se a opção de falar com atendente for escolhida
      this.delivery11();
      return null;
    }
    
  }
  public void perguntaQtd(String produto){
    this.separa();
    System.out.println("Quantas unidades de " + produto + " você deseja?\n");
    System.out.println("(Caso seu produto seja ração, digite 1 para 1kg ou 0,5 para 500 gramas, por exemplo.)");
  }

  public void delivery11(){
    System.out.println("Agradecemos pelo contato, um atendente entrará em contato em breve. Tenha um bom dia! \n");
  }

  public String escolherDataServico(String servico){
    ArrayList<String> datas = new ArrayList<String>();
    datas.add("20/08/2024");
    datas.add("24/08/2024");
    datas.add("28/08/2024");
    datas.add("30/08/2024");
    datas.add("01/09/2024");

    this.separa();
    System.out.println("O serviço de banho e tosa é uma ótima opção para o cuidar bem de seu pet.");
    System.out.println("Está disponível por apenas R$49,90. Aproveite!");
    System.out.println("Escolha uma das datas disponíveis para agendar o serviço " + servico + "\n");
    int i;
    int n = datas.size();

    for (i=0; i<n; i++){
      System.out.println("Opção " + (i+1) + "- " + datas.get(i));
    }

    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();

    return datas.get(option  - 1);
  }

  public String escolherHoraServico(Data dia){
    this.separa();
    ArrayList<String> horarios = dia.getHorarios();
    System.out.println("Escolha o melhor horário para trazer seu pet até nós! Digite o número da opção desejada.\n");

    int i;
    int n = horarios.size();
    for (i=0; i<n; i++){
      System.out.println("Opção" + (i+1) + "- " + horarios.get(i) + "\n");
    }

    Scanner sc = new Scanner(System.in);
    int option = sc.nextInt();

    System.out.println(option - 1);

    return horarios.get(option - 1);
  }

  public Usuario cadastrarPet(Usuario user, String pet1){
    Scanner sc = new Scanner(System.in);
    this.separa();
    System.out.println("Qual é o nome de seu pet?");
    String nome = sc.next();
    user.setNomePet(pet1, nome);

    System.out.println("Qual é a idade dele/dela? (Caso tenha menos de um ano, digite 0");
    int idade = sc.nextInt();
    user.setIdadePet(pet1, idade);

    System.out.println("Qual é a raça de seu pet? (Se não houver, escreva vira-lata ou indefinido)");
    String raca = sc.next();
    user.setRacaPet(pet1, raca);

    System.out.println("Qual o sexo de seu pet?");
    String sexo = sc.next();
    user.setSexoPet(pet1, sexo);

    return user;

  }

  public Usuario cadastrarUser(Usuario user){
    Scanner sc = new Scanner(System.in);
    this.separa();

    System.out.println("Qual é o seu nome?");
    String nome = sc.next();
    user.setNome(nome);

    System.out.println("Por favor, informe-nos seu endereço");
    String endereco = sc.next();
    user.setEndereco(endereco);

    System.out.println("Qual é seu número de telefone?");
    //String tel = sc.next();
    //user.setTel(tel);

    return user;
  }

}