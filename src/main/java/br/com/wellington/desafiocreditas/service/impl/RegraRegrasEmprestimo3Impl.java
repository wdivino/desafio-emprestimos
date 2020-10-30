package br.com.wellington.desafiocreditas.service.impl;

import br.com.wellington.desafiocreditas.model.Cliente;
import br.com.wellington.desafiocreditas.model.Emprestimo;
import br.com.wellington.desafiocreditas.model.enums.TipoEmprestimo;
import br.com.wellington.desafiocreditas.service.GerenciadorRegrasEmprestimos;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RegraRegrasEmprestimo3Impl implements GerenciadorRegrasEmprestimos {

    @Override
    public Set<Emprestimo> executarRegrasBaseadoNosDadosDo(Cliente cliente) {
        Set<Emprestimo> emprestimos = Set.of();
        if (cliente.comRendaMaiorQue(5000) && cliente.comIdadeMenorQue(30)) {
            emprestimos = Set.of(new Emprestimo(TipoEmprestimo.PESSOAL),
                    new Emprestimo(TipoEmprestimo.COM_GARANTIA),
                    new Emprestimo(TipoEmprestimo.CONSIGNADO));
        }
        return emprestimos;
    }
}
