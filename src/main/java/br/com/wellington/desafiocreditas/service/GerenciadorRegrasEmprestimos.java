package br.com.wellington.desafiocreditas.service;

import br.com.wellington.desafiocreditas.model.Cliente;
import br.com.wellington.desafiocreditas.model.Emprestimo;

import java.util.Set;

public interface GerenciadorRegrasEmprestimos {
    Set<Emprestimo> executarRegrasBaseadoNosDadosDo(Cliente cliente);
}
