public class PilhaInteiros {
    private int qt;
    private Integer[] dados;

    PilhaInteiros(int tam) {
        dados = new Integer[tam];
        qt = 0;
    }

    void empilha(Integer n){
        if (qt < dados.length)
            dados[qt] = n;
            qt++;
    }

    Integer desempilha() {
        if (qt == 0) return null;
        Integer r = dados[qt-1];
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