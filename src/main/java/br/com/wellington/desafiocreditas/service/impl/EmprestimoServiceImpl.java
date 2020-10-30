package br.com.wellington.desafiocreditas.service.impl;

import br.com.wellington.desafiocreditas.model.*;
import br.com.wellington.desafiocreditas.service.EmprestimoService;
import br.com.wellington.desafiocreditas.service.GerenciadorRegrasEmprestimos;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {

    private Set<GerenciadorRegrasEmprestimos> gerenciadorRegrasEmprestimos;

    public EmprestimoServiceImpl(Set<GerenciadorRegrasEmprestimos> gerenciadorRegrasEmprestimos) {
        this.gerenciadorRegrasEmprestimos = gerenciadorRegrasEmprestimos;
    }

    @Override
    public Set<Emprestimo> obterEmprestimosElegiveis(EmprestimoEntradaDTO emprestimoEntradaDTO) {
        Set<Emprestimo> emprestimosElegiveis = new HashSet<>();
        for (GerenciadorRegrasEmprestimos gerenciador : this.gerenciadorRegrasEmprestimos) {
            emprestimosElegiveis.addAll(gerenciador.executarRegrasBaseadoNosDadosDo(emprestimoEntradaDTO.getCliente()));
        }
        return emprestimosElegiveis;
    }

}
