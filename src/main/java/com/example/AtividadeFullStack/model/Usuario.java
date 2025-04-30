package com.example.AtividadeFullStack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo NOME precisa ser preenchido")
    private String nome;

    @NotBlank(message = "O campo TELEFONE precisa ser preenchido")
    private String telefone;

    @NotBlank(message = "O campo E-MAIL precisa ser preenchido")
    @Email(message = "Informe um e-mail valido")
    private String email;

    @NotBlank(message = "O campo SENHA precisa ser preenchido")
    @Size(min = 3, message = "A senha p´reciso conter o minimo de 3 caracteres")
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String telefone, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O campo NOME precisa ser preenchido") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O campo NOME precisa ser preenchido") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O campo TELEFONE precisa ser preenchido") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "O campo TELEFONE precisa ser preenchido") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "O campo E-MAIL precisa ser preenchido") @Email(message = "Informe um e-mail valido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O campo E-MAIL precisa ser preenchido") @Email(message = "Informe um e-mail valido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "O campo SENHA precisa ser preenchido") @Size(min = 3, message = "A senha p´reciso conter o minimo de 3 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "O campo SENHA precisa ser preenchido") @Size(min = 3, message = "A senha p´reciso conter o minimo de 3 caracteres") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
