package org.example;

public enum TipoReunion {

    TECH(1), MARK(2), OTRO(3);

    private int tiporeu;
    TipoReunion(int tiporeu) {
    }
    public int getTiporeu(){
        return this.tiporeu;
    }

}
