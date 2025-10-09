public class expressoesLogicas {
    public static void main(String[] args) {
        int x = 1, a = 3, b = 5, c = 8, d = 7;

        boolean logA = !(x>3);
        boolean logB = ((x<1) && (!(b > d)));
        boolean logC = (!(d<0) && (c>5));
        boolean logD = (!((x > 3) || (c < 7)));
        boolean logE = ((a > b) || (c > b));
        boolean logF = (x >= 2);
        boolean logG = ((x < 1) && (b >= d));
        boolean logH = ((d < 0) || (c > 5));
        boolean logI = (!(d > 3) || (!(b < 7))); 
        boolean logJ = (a > b || (!(c > b)));

        System.out.println("a - " + logA);
        System.out.println("b - " + logB);
        System.out.println("c - " + logC);
        System.out.println("d - " + logD);
        System.out.println("e - " + logE);
        System.out.println("f - " + logF);
        System.out.println("g - " + logG);
        System.out.println("h - " + logH);
        System.out.println("i - " + logI);
        System.out.println("j - " + logJ); 
    }
}
