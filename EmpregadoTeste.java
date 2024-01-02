public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Nivaldo", "Almeida", 2000.0);  
        System.out.println(empregado);
        empregado.aumento(0.1);
        System.out.println(empregado);

        Empregado empregado2 = new Empregado("Joao", "Ferreira", 5000.0);
        System.out.println(empregado2);
        empregado2.aumento(0.1);
        System.out.println(empregado2);

    }
}
