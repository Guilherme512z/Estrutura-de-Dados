public class ListaDeInteiros{
   private int dados[];
   private int tamanho;

   public ListaDeInteiros(int capacidade){
      dados = new int[capacidade];
      tamanho=0;
   }

   public void adicionaFinal(int e){
      if (tamanho == dados.length){
        System.out.println("ERRO! Lista Cheia");
      }else{
        dados[tamanho++]=e;
        //tamanho = tamanho + 1;
      }
   }
   public String toString(){
      String r = "";
      for (int i = 0; i < tamanho; i++){
          r = r + dados[i] + "\t";
      }
      r = r + "Quantidade de Elementos: "+tamanho;
      return r;
   }
}