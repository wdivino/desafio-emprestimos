package br.com.wellington.desafiocreditas.service.impl;

import br.com.wellington.desafiocreditas.modelo.Cliente;
import br.com.wellington.desafiocreditas.modelo.Emprestimo;
import br.com.wellington.desafiocreditas.modelo.enums.TipoEmprestimo;
import br.com.wellington.desafiocreditas.service.GerenciadorRegrasEmprestimos;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RegraRegrasEmprestimo3Impl implements GerenciadorRegrasEmprestimos {

    @Override
    public Set<Emprestimo> executarRegrasBaseadoNoDadosDo(Cliente cliente) {

        Set<Emprestimo> emprestimos = new HashSet<>();

        if (cliente.comRendaMaiorQue(5000) && cliente.comIdadeMenorQue(30)) {

            emprestimos.add(new Emprestimo(TipoEmprestimo.PESSOAL));
            emprestimos.add(new Emprestimo(TipoEmprestimo.COM_GARANTIA));
            emprestimos.add(new Emprestimo(TipoEmprestimo.CONSIGNADO));
        }

        return emprestimos;
    }
}
