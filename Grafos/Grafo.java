public class Grafo{
    private int V; //Vertices
    private int mat[][];

    Grafo (int vert){
        this.V = vert;
        mat = new int[vert][vert];
        for (int i = 0; i < this.V; i++)
            for (int j = 0; j < this.V; j++)
                mat[i][j] = 0;
    }

    int getV(){
        return this.V;
    }

    boolean adjacente(int i, int j){
        return (mat[i][j] == 1) && (mat[j][i] == 1);
    }

    void imprime(){
        for (int i = 0; i < this.V; i++){
            for (int j = 0; j < this.V; j++){
                System.out.print(mat[i][j] + "|");
            }
            System.out.println();
        }
    }

    void insereAresta(int i, int j){
        mat[i][j] = 1;
        mat[j][i] = 1;
    }

    void removeAresta(int i, int j){
        mat[i][j] = 0;
        mat[j][i] = 0;
    }
}