package br.com.wellington.desafiocreditas.service;

import br.com.wellington.desafiocreditas.model.Emprestimo;
import br.com.wellington.desafiocreditas.model.EmprestimoEntradaDTO;

import java.util.Set;

public interface EmprestimoService {

    Set<Emprestimo> obterEmprestimosElegiveis(EmprestimoEntradaDTO emprestimoEntradaDTO);
}
