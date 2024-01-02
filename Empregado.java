public class Empregado {
    String nome;
    String sobrenome;
    double salarioMensal;
    
    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal; 
    }
    public double getSalarioAnual(){
        return this.salarioMensal * 12;
    }

    public void aumento(Double aumento){
        aumento *= this.salarioMensal;
        setSalarioMensal(this.salarioMensal+aumento);
    }
    @Override
    public String toString(){
        return "Nome: "+this.nome + "\nSobrenome: "+this.sobrenome+"\nSalarioMensal: "+this.salarioMensal+
        "\nSalario anual de "+this.nome +": "+ this.getSalarioAnual();
    }
}
