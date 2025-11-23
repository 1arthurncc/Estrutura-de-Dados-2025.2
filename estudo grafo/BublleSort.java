public class BublleSort{
    public static void bubble(int a[]){
        int tam = a.length;
        for (int i = tam - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (a[j] > a[j+1]){
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
    }

    public static void imprime(int a[]){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = {5, 4, 1, 3};
        imprime(vetor);
        bubble(vetor);
        System.out.println();
        imprime(vetor);
    }
}