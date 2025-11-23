public class TestaLista {
    public static void main(String[] args){
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.insereInicio(7);
        
        System.out.println("Removeu -> " + lista.removeFinal());
        System.out.println("Removeu -> " + lista.removeFinal());
        lista.imprime();
    }
}
