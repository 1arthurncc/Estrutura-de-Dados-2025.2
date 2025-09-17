public class FilaInteiros{
    private Integer[] dados;
    private int qt, inicio;

    FilaInteiros(int tam){
        dados = new Integer[tam];
        qt = 0;
        inicio = 0;
    }

    void insereFinal(Integer valor){
        if (qt < dados.length){
            int ultimo = (qt + inicio) % dados.length;
            dados[ultimo] = valor;
            qt++;
            }
        }

    Integer removeInicio(){
        Integer valor = null;
        if (qt != 0){
            valor = dados[inicio];
            qt--;
            inicio = (inicio + 1) % dados.length;
        }
        return valor;
    }

    void imprimeFila(){
        int pos = inicio;
        int i = 0;
        while (i < qt){
            System.out.println(dados[pos] + "->");
            pos = (pos + 1) % dados.length;
            i++;
        }
        System.out.println();
    }
}