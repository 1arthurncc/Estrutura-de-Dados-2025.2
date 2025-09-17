public class ListaVetores {
    private Integer[] dados;
    private int qt;

    ListaVetores(int tam){
        dados = new Integer[tam];
        qt = 0;
    }

    void insere(int valor){
        if (qt == dados.length) 
            redimensionar(dados.length * 2);

        dados[qt] = valor;
        qt++;
    }

    Integer removeFinal(){
        if (qt == 0) return null;
        Integer temp = dados[qt - 1];
        qt--;

        if (qt > 0 && qt == dados.length/4)
            redimensionar(dados.length/2);

        return temp;

    }

    Integer removePosicao(int pos){
        if (pos < 0 || pos >= qt) return null;
        Integer temp = dados[pos];

        for (int i = pos + 1; i < qt; i++)
            dados[i-1] = dados[i];
        
        qt--;

        if (qt > 0 && qt == dados.length/4)
            redimensionar(dados.length/2);

        return temp;
    }

    void redimensionar(int max){
        Integer temp[] = new Integer[max];
        for (int i = 0; i < qt; i++)
            temp[i] = dados[i];

        dados = temp;
    }

    void imprime(){
        System.out.println("Tamanho: " + dados.length);
        for (int i = 0; i < qt; i++){
            System.out.print(dados[i] + "->");
        }
    }
}