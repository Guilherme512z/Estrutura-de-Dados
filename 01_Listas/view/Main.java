/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas.Listas.view;
import com.mycompany.listas.Listas.model.*;


/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();
        lista.adicionaInicio(new Aluno("Guilherme","55"));
        lista.adicionaInicio(new Aluno("Guilherme","10"));
        lista.adicionaInicio(new Aluno("Guilherme","10"));
        System.out.println("Lista: "+ lista.toString());
        
    }
}
