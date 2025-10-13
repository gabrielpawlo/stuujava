public class RevSomatorio_27 {
    public static void main(String[] args) {
        System.out.println("Nao recursivo: " + Somatorio(5));
        System.out.println("Recursivo: " + SomatorioRecursivo(5));
    }

    public static int Somatorio(int n){
        int somatorio = 0;
        for(int i = 1 ; i <= n; i++){
            somatorio += i; 
        }
        return somatorio;
    }

    public static int SomatorioRecursivo(int n){
        if(n == 1){
            return n;
        } else {
            return n + SomatorioRecursivo(n - 1);
        }
    }
}
