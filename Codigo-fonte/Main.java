public class Main
{
	public static void main(String[] args){
		Grafo gr = new Grafo(4);
		gr.inserir(1,1);
		gr.inserir(1,2);
		gr.inserir(2,3);
		gr.inserir(3,4);
		System.out.println(gr.toString());
	}
}
