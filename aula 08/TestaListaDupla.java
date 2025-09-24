public class TestaListaDupla{
    public static void main(String[] args){
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.insereInicio(8);
        lista.insereInicio(10);
        lista.insereInicio(15);

        lista.insereInicio(20);
        lista.insereInicio(25);
        lista.insereInicio(30);

        lista.imprimelista();

        lista.removeNodo(15);

        lista.imprimelista();

        lista.removeNodo(8);

        lista.imprimelista();

        lista.removeNodo(30);

        lista.imprimelista();


        
    }
}