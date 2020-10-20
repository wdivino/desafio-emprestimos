package br.com.wellington.desafiocreditas.modelo.enums;

public enum TipoEmprestimo {

    PESSOAL (4),
    COM_GARANTIA (3),
    CONSIGNADO (2);

    private int taxa;

    private TipoEmprestimo(int taxa) {
        this.taxa = taxa;
    }

    public int getTaxa() {
        return taxa;
    }
}
