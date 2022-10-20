/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fesa.funcionario.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author 081200028
 */
public class Funcionario {

    private Long codigo;
    private String nome;
    private LocalDate nascimento;
    private LocalDateTime contratacao;
    private Cargo cargo = new Cargo();
    private Departamento departamento = new Departamento();

    
    
    public Funcionario(){
        
    }
    
    public Funcionario(Long codigo, String nome, LocalDate nascimento, LocalDateTime contratacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.nascimento = nascimento;
        this.contratacao = contratacao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDateTime getContratacao() {
        return contratacao;
    }

    public void setContratacao(LocalDateTime contratacao) {
        this.contratacao = contratacao;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    
}
