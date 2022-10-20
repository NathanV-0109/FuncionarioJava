/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.fesa.funcionario.Interfaces;

import br.edu.fesa.funcionario.Exception.PersistenciaException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author 081200028
 */
public interface GenericoDAO<E> extends Serializable {
    
    List<E> listar() throws PersistenciaException;
    void inserir(E e)throws PersistenciaException;
    void alterar(E e)throws PersistenciaException;
    void remover(E e)throws PersistenciaException;
    E listarPorId(E e)throws PersistenciaException;
    
}
