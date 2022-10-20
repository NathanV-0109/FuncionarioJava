/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package br.edu.fesa.funcionario.Conexao;

import java.sql.Connection;
import java.util.ResourceBundle;

/**
 *
 * @author 081200028
 */
public class Conexao {
    
    private ResourceBundle BUNDLE;
    private static Conexao conexao;
    
    private Conexao() {
    }
    
    public static Conexao getInstance() {
        if(conexao == null){
            conexao = new Conexao();
        }
        return conexao;
    }
    
    public Connection getConnection(){
        
        return null;
    }
    

}
