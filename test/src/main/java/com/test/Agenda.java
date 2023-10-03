package com.test;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
    }

    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                break;
            }
        }
    }

    public List<Contato> listarContatos() {
        return contatos;
    }

    public class Contato {
        private String nome;
        private String telefone;

        public Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

        public String getNome() {
            return nome;
        }

        public String getTelefone() {
            return telefone;
        }
    }
}
