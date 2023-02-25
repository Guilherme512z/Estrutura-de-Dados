import javax.lang.model.util.ElementScanner14;

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
	public void adicionaInicio(Aluno valor){
	    No novo = new No(valor);
	    inicio = novo;
            novo.prox = inicio;
	    
	}
	/**
	Metodo que remove o primeiro elemento
	da lista
	@return retorna o elemento removido
	*/






  public Aluno removeInicio(){
    Aluno r=null;
	 if (inicio==null){
	    System.out.println("ERRO! Lista Vazia!");
	 }
	 else{
	    r=inicio.dado;
            inicio = inicio.prox;
	 }
	 return r;
 }
}

 