package br.com.wellington.desafiocreditas.service;

import br.com.wellington.desafiocreditas.modelo.Cliente;
import br.com.wellington.desafiocreditas.modelo.Emprestimo;

import java.util.Set;

public interface GerenciadorRegrasEmprestimos {

    Set<Emprestimo> executarRegrasBaseadoNoDadosDo(Cliente cliente);
}
