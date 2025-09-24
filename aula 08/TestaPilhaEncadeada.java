public class TestaPilhaEncadeada {
    public static void main(String[] args){
        PilhaEncadeada pi = new PilhaEncadeada();

        pi.empilhar(5);
        pi.empilhar(10);
        pi.empilhar(15);

        pi.imprimePilha();

        pi.desempilhar();
        pi.desempilhar();
        pi.imprimePilha();
    }
}
