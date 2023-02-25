import javax.swing.JOptionPane;


/**
 * Menu para manipulação de lista de inteiros
 * @author Andréa Zotovici
 */
public class MenuParaInteiros {
    public static void main(String args[]){
        String op= "Menu: \n1- Incluir novo número no início"+
                "\n2- Incluir novo número no final"+
                "\n3- Incluir novo número em uma posição"
                + "\n4- Remover último elemento"
                + "\n5- Remover primeiro elemento"
                + "\n6- Remover de uma posição específica"
                + "\n7- Consulta o primeiro elemento"
                + "\n8- Consulta o último elemento"
                + "\n9- Mostra todos os elementos"
                + "\n10- Sair";
        int vlrOp=0;
        ListaDeInteiros idades = new ListaDeInteiros(30);
        int valor;
        while (vlrOp != 10){
            vlrOp = Integer.parseInt(
               JOptionPane.showInputDialog(op)
            );
            switch(vlrOp){
                case 1:
                    valor=Integer.parseInt(
                        JOptionPane.showInputDialog("idades?")
                    );
                    if (valor > 0)
                        idades.adicionaInicio(valor);
                    break;
                case 2:
                    valor=Integer.parseInt(
                        JOptionPane.showInputDialog("idades?")
                    );
                    if (valor > 0)
                        idades.adicionaFinal(valor);
                    break;               
                case 3:
                     valor=Integer.parseInt(
                        JOptionPane.showInputDialog("idades?")
                    );
                     int pos=Integer.parseInt(
                        JOptionPane.showInputDialog("posição?")
                    );
                    if (valor > 0 && pos > 0)
                        idades.adiciona(valor,pos);
                    
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Idade removida: "+
                            idades.removeFinal());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Idade removida: "+
                            idades.removeInicio());
                    break;               
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;               
                case 9:
                    String msg=idades.mostra();
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 10:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
        
    }
}
