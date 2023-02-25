public class Main {

    public static void main (String[]args) {
        Arvore arvore1 = new Arvore();
        arvore1.adicionaElemento(100);
        arvore1.adicionaElemento(90);
        arvore1.adicionaElemento(41);
        arvore1.adicionaElemento(5);
        arvore1.adicionaElemento(57);
        arvore1.adicionaElemento(98);
        arvore1.adicionaElemento(123);
        arvore1.adicionaElemento(116);
        System.out.println("\nPercurso Pré Ordem ");
        arvore1.preOrdem(arvore1.getRaiz());
        System.out.println("\n"+"Somatória com Pré Ordem "+"\n");
        arvore1.somaPreOrdem(arvore1.getRaiz());

        System.out.println("Somatória " + arvore1.somaPreOrdem(arvore1.getRaiz())+"\n");
        
    
}
}
