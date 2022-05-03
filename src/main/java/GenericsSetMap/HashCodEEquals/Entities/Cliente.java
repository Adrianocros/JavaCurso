package GenericsSetMap.HashCodEEquals.Entities;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return getNome().equals(cliente.getNome()) && getEmail().equals(cliente.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail());
    }
}
