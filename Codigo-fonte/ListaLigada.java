public class ListaLigada{
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
	public void adicionaInicio(int valor){
	    No novo = new No(valor);
            novo.prox = inicio;
	    inicio = novo;	    
	}
	/**
	Metodo que remove o primeiro elemento
	da lista
	@return retorna o elemento removido
	*/
  public int removeInicio(){
    int r=-1;
	 if (inicio==null){
	    System.out.println("ERRO! Lista Vazia!");
	 }
	 else{
	    r=inicio.dado;
            inicio = inicio.prox;
	 }
	 return r;
 }

   public String toString(){
	String r = "";
	No n=inicio;
        while(n != null){
	       r = r + n.dado + '\t';
	       n = n.prox;
        } 
	return r;
   }
}
 