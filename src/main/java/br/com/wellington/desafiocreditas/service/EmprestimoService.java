package br.com.wellington.desafiocreditas.service;

import br.com.wellington.desafiocreditas.modelo.Emprestimo;
import br.com.wellington.desafiocreditas.modelo.EmprestimoEntradaDTO;

import java.util.Set;

public interface EmprestimoService {

    Set<Emprestimo> obterEmprestimosElegiveis(EmprestimoEntradaDTO emprestimoEntradaDTO);
}
