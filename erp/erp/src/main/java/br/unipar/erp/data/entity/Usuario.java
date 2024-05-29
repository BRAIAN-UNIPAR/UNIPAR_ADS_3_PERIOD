package br.unipar.erp.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


import java.time.LocalDate;

@Entity
@Getter
@Setter
@Data
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private Integer codigo;

    @Column(name = "username")
    private String usuario;

    @Column(name = "password")
    private String senha;

    private String nome;

    @Column(name = "nascimento")
    private LocalDate dataNascimento;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
