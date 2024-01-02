public class Fatura{
    String numero;
    String descricao;
    int quantidadeComprada;
    double preco;
    
    public Fatura(String numero, String descricao, int quantidadeComprada, double preco){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.preco = preco;
    }

    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getQuantidadeComprada(){
        return this.quantidadeComprada;
    }
    public void setQuantidadeComprada(int quantidadeComprada){
        this.quantidadeComprada = quantidadeComprada;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Numero da Fatura: "+ this.numero + "\nDescrição: "+this.descricao+"\nQuantidade comprada: "
        +this.quantidadeComprada+ "\nPreço: "+this.preco+"!";
    }

    public String getTotalFatura(){
        return ("Valor total da fatura: "+this.quantidadeComprada * this.preco);
    }
}