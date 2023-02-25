package com.mycompany.listas.Listas.model;

public class Aluno {
    private String nome;
    private String ra;

public Aluno(String nome, String ra){
    this.nome = nome;
    this.ra = ra;
}
public void setNome (String novoNome){
    this.nome = novoNome;
}
public void setRA (String novoRA){
    this.ra = novoRA;
}
public String getNome(){
return nome;
}
public String getRA(){
return ra;
}
public String toString(){
 return nome + "\t" + ra + "\n";
}


}


