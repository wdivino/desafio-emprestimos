package br.com.wellington.desafiocreditas.model;

import java.util.Set;

public class EmprestimoSaidaDTO {

    private String nomeCliente;
    private Set<Emprestimo> emprestimos;

    public EmprestimoSaidaDTO(String nomeCliente, Set<Emprestimo> emprestimos) {
        this.nomeCliente = nomeCliente;
        this.emprestimos = emprestimos;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Set<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
