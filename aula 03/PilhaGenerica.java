public class PilhaGenerica<Item>{
    private int qt;
    private Item[] dados;

    PilhaGenerica(int tam) {
        dados = (Item[]) new Object[tam];
        qt = 0;
    }

    boolean vazia(){
        return qt == 0;
    }

    void empilha(Item n){
        if (qt < dados.length)
            dados[qt] = n;
            qt++;
    }

    Item desempilha() {
        if (qt == 0) return null;
        Item r = dados[qt-1];
        qt--;
        return r;
    }

    void imprime(){
        for (int i = 0; i < qt; i++){
            System.out.print(dados[i] + " -> ");
        System.out.println();
        }
    }
}