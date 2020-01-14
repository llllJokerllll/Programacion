package com.acarballeira;

public class Guardia extends Persona {

    private String nip;
    
    public Guardia( String nome, String nip ) {
        super( nome );
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip( String nip ) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return String.format("Guardia: %s%nNIP: %s%n", getNome() ,getNip() );
    }
    
    
}
