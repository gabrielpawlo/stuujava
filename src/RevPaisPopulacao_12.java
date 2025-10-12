public class RevPaisPopulacao_12 {
    public static void main(String[] args) {
        double paisA = 5000000, paisB = 7000000;
        double cont = 0;

        while (paisB > paisA) {
            paisA = paisA + (paisA * 0.3);
            paisB = paisB + (paisB * 0.2);
            //System.out.println("Pais A: " + paisA + "    Pais B: " + paisB);
            cont++;
        }
        System.out.println(cont + " anos");
    }
}