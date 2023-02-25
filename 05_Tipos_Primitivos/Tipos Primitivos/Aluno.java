public class Aluno {
    private String nome;
    private String ra;
    
    public Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;

    }
    public String getNome(){
    return nome;
}
    public String getRA(){
    return ra;
}
    public void setNome(String nome){
    this.nome = nome;
 }
  public void setRA(String ra){
    this.ra = ra;
 }
 public String toString(){
    return "Nome: " + nome  + "\tRA: "+ ra + "\t";
 }

}
