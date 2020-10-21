package br.com.wellington.desafiocreditas.model;

import br.com.wellington.desafiocreditas.model.enums.TipoEmprestimo;

import java.util.Objects;

public class Emprestimo {

    private int taxa;
    private TipoEmprestimo tipoEmprestimo;

    public Emprestimo(TipoEmprestimo tipoEmprestimo) {
        this.taxa = tipoEmprestimo.getTaxa();
        this.tipoEmprestimo = tipoEmprestimo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emprestimo)) return false;
        Emprestimo other = (Emprestimo) o;
        return taxa == other.taxa && tipoEmprestimo == other.tipoEmprestimo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxa, tipoEmprestimo);
    }

    public int getTaxa() {
        return taxa;
    }

    public TipoEmprestimo getTipoEmprestimo() {
        return tipoEmprestimo;
    }
}
