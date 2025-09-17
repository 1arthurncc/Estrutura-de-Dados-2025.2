public class TestaListaDupla{
    public static void main(String[] args){
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.insereInicio(8);
        lista.insereInicio(10);
        lista.insereInicio(15);

        lista.imprimelista();

        lista.removeInicio();
        lista.imprimelista();
    }
}