package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.enums;

public enum GeneroEnum {
    GENEROS("generos"),
    GENEROS_LIST("generosList"),
    GENEROS_TITLE("Géneros");

    public final String nameVar;

    private GeneroEnum(String nameVar){
        this.nameVar = nameVar;
    }
}
