/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.AppBiblioteca;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Controller {
       private static Controller instancia;
    
    public static ArrayList<Cliente> listaCliente;
    
    public static ArrayList<Livro> listaLivro;
    
    public static ArrayList<Emprestimo> listaEmprestimo;
    

      
    public static Controller getInstance(){
        if(instancia == null) {
            return instancia = new Controller();
        }else {
            return instancia;
        }
    }
    private Controller() {
    listaCliente = new ArrayList<>();
    listaLivro = new ArrayList<>();
    listaEmprestimo = new ArrayList<>();
}
    public ArrayList<String> retornarNomesClientes() {
    ArrayList<Cliente> listaClientes = retornarCliente();
    ArrayList<String> nomesClientes = new ArrayList<>();
    for (Cliente cliente : listaClientes) {
        nomesClientes.add(cliente.getNome());
    }
    return nomesClientes;
}
    public ArrayList<String> retornarTitulosLivros() {
    ArrayList<Livro> listaLivros = retornarLivro(); // Supondo que você tenha um método retornarLivro() para obter os livros cadastrados
    ArrayList<String> titulosLivros = new ArrayList<>();
    for (Livro livro : listaLivros) {
        titulosLivros.add(livro.getTitulo());
    }
    return titulosLivros;
}

    public void salvarCliente(Cliente clientes){
        listaCliente.add(clientes);
    }
    
        public static ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }
        public ArrayList<Cliente> retornarCliente() {
        return listaCliente;
    }
        
    public void salvarLivro(Livro livros){
        listaLivro.add(livros);
    }
    public static ArrayList<Livro> getListaLivro() {
        return listaLivro;
    }

    public void salvarEmprestimo(Emprestimo emprestimo){
        listaEmprestimo.add(emprestimo);
    }
   
    
    public static ArrayList<Emprestimo> getEmprestimo() {
        return listaEmprestimo;
    }

    private ArrayList<Livro> retornarLivro() {
        return listaLivro;
    }

}
