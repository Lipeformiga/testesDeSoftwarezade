import java.time.Period;
import java.util.ArrayList;

public class Loja {

    private ArrayList<Produtos> produtos = new ArrayList<>();

    public Loja(ArrayList<Produtos> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produtos p){
        produtos.add(p);
    }
    public void removerProdutos(Produtos p){
        produtos.remove(p);
    }
    public void listarPRodutos(){
        for (Produtos p : produtos){
            System.out.println(p);
        }
    }

    public void aplicarDesconto(){
        for (Produtos p : produtos){
            if( p.getClass().equals(Eletronico.class)){
                p.calcularDesconto();
            } else if (p.getClass().equals(Alimentos.class)) {
                p.calcularDesconto();
            }
        }
    }
}