public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("1", "fatura da claro", 2, 50.0);
        System.out.println(fatura);
        System.out.println(fatura.getTotalFatura());
    }
    
}
