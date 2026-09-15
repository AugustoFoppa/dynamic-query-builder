package org.acme.estado;

public enum RegiaoEnum {

    NONE(0, "Nao Definido"),
    SUL(1, "Sul"),
    SUDESTE(2, "Sudeste"),
    CENTRO_OESTE(3, "Centro Oeste"),
    NORTE(4, "NORTE"),
    NORDESTE(5, "Nordeste");

    private RegiaoEnum(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode(){ return code; }

    public String getName(){ return name; }

    public String getCodigo(){ return "R" + code; }

    public boolean isNone(){ return code == 0; }

    @Override
    public String toString(){ return name; }

    private final int code;
    private final String name;
}
