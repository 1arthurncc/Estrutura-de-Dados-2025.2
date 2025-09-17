import java.util.*;

public class TestaPilha {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String str = entrada.nextLine();
        PilhaGenerica<Character> pi = new PilhaGenerica<Character>(str.length());


        for (int i = 0; i < str.length(); i++){
            pi.empilha(str.charAt(i));
        }

        while (!pi.vazia()){
            Character c = pi.desempilha();
            System.out.print(c);
        }
        System.out.println();
    }
}
