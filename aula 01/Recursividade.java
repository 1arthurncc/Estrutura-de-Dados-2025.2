public class Recursividade {

    public static int MDC(int x, int y){
        if (y <= x && x % y == 0)
            return y;
        else    
            if (x < y) return MDC(y, x);
            else return MDC(y, x % y);
    }
    public static void Imprime10(int n){
        if (n == 1)
            System.out.println(1);
        else {
            System.out.println(n);
            Imprime10(n-1);
        }
    }

    public static int Potencia(int b, int e){
        if (e == 0) return 1;
        else return b * Potencia(b, e-1);
    }

    public static void main(String[] args) {
        System.out.println(MDC(100, 40));
        Imprime10(30);
        System.out.println(Potencia(2, 10));
    }
}
