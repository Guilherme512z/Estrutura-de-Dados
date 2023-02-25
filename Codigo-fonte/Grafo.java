public class Grafo{
    private ListaLigada tabela[];
    public Grafo(int q){
        tabela = new ListaLigada[q];
    }
    public void inserir(int vo, int vd){
         if (tabela[vo-1] == null)
            tabela[vo-1] = new ListaLigada();
         tabela[vo-1].adicionaInicio(vd);
         if (tabela[vd-1] == null)
            tabela[vd-1] = new ListaLigada();
         tabela[vd-1].adicionaInicio(vo);
    }
    public String toString(){
        String r = "";
        for (int i=0;i<tabela.length;i++){
            r = r + "Vertice " + (i+1) +
            " = " + tabela[i].toString() + '\n';
        }
        return r;
    }
}