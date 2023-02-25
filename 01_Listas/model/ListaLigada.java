package com.mycompany.listas.Listas.model;
        
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
	    novo.prox = inicio;
            inicio = novo;
	    
	}
        
        public String toString(){
            if (inicio == null){
                return "Lista Vazia!";
            }
            
           /* String r = "";
            No aux = inicio;
            while (aux != null){
            r = r + " " + aux.dado;
            aux = aux.prox;
            } */
           
            return percorreLista(inicio);
            
        }
        
        
        
         /**
         * Método recursivo que percorre uma lista ligada concatenando 
         * seus elementos
         * @param aux o primeiro nó que será visitado
         * @return String com os elementos concatenados
         */
        
        public String percorreLista (No aux){
            if (aux != null){
                return percorreLista(aux.prox) +" "+ aux.dado;
            }
            return "";
            
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

 