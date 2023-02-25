public class Main {
    public static void main(String [] args){
        Aluno A1 = new Aluno( "Guizinho","40650001111");
        Aluno A2 = new Aluno( "Luiza","5598877777");
        ListaLigada L1 = new ListaLigada();
        L1.adicionaInicio(A1);
        L1.adicionaInicio(A2);
        System.out.println(L1.toString());

    }
}
