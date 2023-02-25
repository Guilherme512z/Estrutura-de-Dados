import java.security.PublicKey;

public class Arvore {
    private No raiz;
    public Arvore (){
        raiz=null;
    }


public void preOrdem(No n){		
    if ( n != null){	
System.out.print(n.elemento + " ");	
preOrdem(n.esquerda);		
preOrdem(n.direita);		
    }
}

public No getRaiz(){
    return raiz;

}

public int somaPreOrdem(No n){
    if(n !=null){
return n.elemento + somaPreOrdem(n.esquerda) +somaPreOrdem(n.direita);							
    }
    return 0; }

    

public void adicionaElemento (int e){
    No novo = new No(e);
    if (raiz == null)
    raiz = novo;
    else{
        No aux1 = raiz, aux2 = raiz;
        while (aux1 != null){
            aux2 = aux1;
            if (e<aux1.elemento)
            aux1=aux1.esquerda;
            else if (e>aux1.elemento)
            aux1=aux1.direita;
        }
        if (e == aux2.elemento)
        System.out.println("Elemento já existe");
        else {
            if ( e < aux2.elemento)  aux2.esquerda = novo;
            if ( e > aux2.elemento)  aux2.direita = novo;
            System.out.println("Elemento Incluido");
        }
    }
}
    

        public void verifica (int e){
            No aux = raiz;
            while  (aux != null){
                if (e<aux.elemento)
                aux=aux.esquerda;
                else if (e>aux.elemento)
                aux=aux.direita;
                else
                System.out.println("Elemento Repetido");
            }
        }
    }

