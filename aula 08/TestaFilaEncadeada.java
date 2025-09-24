public class TestaFilaEncadeada {
    public static void main(String[] args) {
        FilaEncadeada fi = new FilaEncadeada();

        fi.insereFila(5);
        fi.insereFila(10);
        fi.insereFila(15);

        fi.imprimeFila();
        fi.removeFila();
        fi.removeFila();
        fi.imprimeFila();
    }
}
