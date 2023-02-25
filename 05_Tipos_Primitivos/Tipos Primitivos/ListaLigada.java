public class ListaLigada {
    private No inicio;

    /**
	Construtor
	*/

public ListaLigada(){
    inicio = null;
}


/**
	Metodo que adiciona um no com o novo elemento
	no inicio da lista
	@param valor e o novo elemento
	*/

public void adicionaInicio(Aluno e){
    No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    
}



/**
	Metodo que remove o primeiro elemento
	da lista
	@return retorna o elemento removido
	*/

public Aluno removeInicio(){
    Aluno resp = null;
	 if (inicio != null){
        resp = inicio.dado;
        inicio = inicio.prox;
      } else{
	    System.out.println("ERRO! Lista Vazia!");
	 }
	 return resp;
 }


 public String toString(){
    String resp = "";
    No aux = inicio;
    while (aux != null){
        resp = resp + aux.dado.toString();
        aux=aux.prox;
    }
    return resp;
 }

}