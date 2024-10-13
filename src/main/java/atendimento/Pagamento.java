package atendimento;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Pagamento {
    private Usuario cliente;
    private ArrayList<Produto> carrinho;
    private double totalCompra;

    public Pagamento(Usuario cliente, ArrayList<Produto> carrinho){
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void setUsuario(Usuario user){
        this.cliente = user;
    }

    public void calcularPreco(){
        int n = this.carrinho.size();
        int i;
        for (i=0; i<n; i++){
            String valor = this.carrinho.get(i).getPreco();
            String valor2 = valor.replaceAll( "," , "." );
            
            Double soma = Double.parseDouble(valor2);
            Double resSoma = soma * this.carrinho.get(i).getQtd();
            this.totalCompra += resSoma;
        }
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("\nO valor total de sua compra é " + formatter.format(this.totalCompra));
        //System.out.println("\nO valor total de sua compra é R$" + str);
    }

    public String retornarChavePix(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "Por favor, realize o pagamento de " + formatter.format(this.totalCompra) + " para a chave pix " + "(71)9 0123-4567";
    }
}