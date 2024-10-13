import pet.*;
import atendimento.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Usuario user = new Usuario("", "", "");
    Scanner sc = new Scanner(System.in);
    Bot bot = new Bot();
    ArrayList<Produto> carrinho = new ArrayList<Produto>();

    // Inciando o bot e registrando dados

    bot.start();

    // Menu principal
    bot.menu();
    int op1 = sc.nextInt();
    
    boolean verify = false;

    Produto p1;

    while (verify != true){
      switch(op1){
        case 1:
          // produtos para pets
          p1 = bot.delivery1();
          
          if (p1 != null){
            // Produto escolhido
            bot.perguntaQtd(p1.getNome());
            Double k = sc.nextDouble();
            p1.setQtd(k);
            carrinho.add(p1);
          } else {
            // Caso o cliente queira falar com atendente
            verify = true;
            break;
          }
          bot.separa();
          System.out.println(" Você está comprando: "+ carrinho.get(0).getNome()+ " Quantidade: " + carrinho.get(0).getQtd());
          System.out.println("Deseja continuar comprando? Digite 1 caso sim, e digite 2 caso queira encerrar a compra.\n");
          
          int op11 = sc.nextInt();
          if (op11 == 1){
            verify = false;
          } else {
            user = bot.cadastrarUser(user);    
            
            Pagamento pag = new Pagamento(user, carrinho);
            bot.separa();
            pag.calcularPreco();
            System.out.println(pag.retornarChavePix());
            System.out.println("Agradecemos pela preferência, volte sempre!");
            verify = true;
          }
          break;
        case 2:
          // Banho e tosa
          Servico tosa = new Servico("Banho e Tosa");
          String d = bot.escolherDataServico(tosa.getTipo());
          Data diaAgendado = new Data(d);
          String h = bot.escolherHoraServico(diaAgendado);
          
          diaAgendado.setHorario(h);

          System.out.println(d);
          tosa.setDataAgendada(diaAgendado);
          
          // Cadastro de usuario

          // Cadastro de pet
          System.out.println("Queremos conhecer melhor seu pet! Digite 1 para cachorro, e 2 para gato.");
          int pet = sc.nextInt();
          String pet1;
          if (pet == 1){
            user.setCachorro(new Cachorro("", 0, ""));
            pet1 = "cachorro";
          } else {
            user.setGato(new Gato("", 0, ""));
            pet1 = "gato";
          }
          //Cadastro de usuário
          System.out.println("Caro cliente, gostaríamos de te conhecer melhor!");
          user = bot.cadastrarUser(user);
          //Cadastro de pet
          user = bot.cadastrarPet(user, pet1);

          tosa.setUsuario(user);
          
          tosa.exibirConsulta(pet1);
          System.out.println("O serviço foi agendado. Obrigado pela preferência!");

          verify = true;
          break;
        case 3:
          // Serviços especiais
          System.out.println("Serviços especiais");
          verify = true;
          break;
      }
    }
    

    sc.close();
  }
}