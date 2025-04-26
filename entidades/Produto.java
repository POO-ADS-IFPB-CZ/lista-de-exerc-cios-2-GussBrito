package entidades;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    //Construtores
    public Produto(int codigo,String nome,double preco,int estoque){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        }

    //Getters

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    //Setters

    public void setPreco(double preco) {
        if(preco>=0){
            this.preco = preco;
        }
        else{
            System.out.println("Valor inválido");
        }

    }
    public void exibirInfo(){
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }
}
