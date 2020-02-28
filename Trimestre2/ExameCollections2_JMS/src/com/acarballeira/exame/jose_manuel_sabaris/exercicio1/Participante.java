/*
 * @Author Jose Manuel Sabarís García
 */
package com.acarballeira.exame.jose_manuel_sabaris.exercicio1;

// TODO: Auto-generated Javadoc
/**
 * The Class Participante.
 */
public class Participante {

    /** The nome. */
    protected String nome;
    
    /** The apelidos. */
    protected String apelidos;
    
    /** The nick. */
    protected String nick;
    
    /** The idade. */
    protected int idade;
    
    /** The sexo. */
    protected char sexo = 'H';
    
    /** The categoria. */
    protected char categoria;
    
    /** The dorsal. */
    protected int dorsal;
    
    /** The num dorsal. */
    private static int num_dorsal = 0;
    
    /**
     * Instantiates a new participante.
     *
     * @param nome the nome
     * @param apelidos the apelidos
     * @param nick the nick
     */
    public Participante(String nome, String apelidos, String nick) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.nick = nick;
        num_dorsal++;
    }

    /**
     * Instantiates a new participante.
     *
     * @param nome the nome
     * @param apelidos the apelidos
     * @param nick the nick
     * @param categoria the categoria
     */
    public Participante(String nome, String apelidos, String nick, char categoria) {
        this(nome, apelidos, nick);
        this.categoria = categoria;
        this.dorsal = num_dorsal;
    }

    /**
     * Instantiates a new participante.
     *
     * @param nome the nome
     * @param apelidos the apelidos
     * @param nick the nick
     * @param idade the idade
     */
    public Participante(String nome, String apelidos, String nick, int idade) {
        this(nome, apelidos, nick);
        this.idade = idade;
        this.categoria = calcularCategoria(this.idade);
        this.dorsal = num_dorsal;
    }
    
    /**
     * Gets the nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets the apelidos.
     *
     * @return the apelidos
     */
    public String getApelidos() {
        return apelidos;
    }

    /**
     * Sets the apelidos.
     *
     * @param apelidos the new apelidos
     */
    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    /**
     * Gets the nick.
     *
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * Sets the nick.
     *
     * @param nick the new nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * Gets the idade.
     *
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Sets the idade.
     *
     * @param idade the new idade
     */
    public void setIdade(int idade) {
        if (idade > 150 || idade < 0) {
            this.idade = 18;
        } else {
            this.idade = idade;
        }
        
    }

    /**
     * Gets the sexo.
     *
     * @return the sexo
     */
    public String getSexo() {
        if (this.sexo == 'H') {
            return "Home";
        } else if (this.sexo == 'M') {
            return "Muller";
        } else {
            return "Sen sexo asigando";
        }
        
    }

    /**
     * Sets the sexo.
     *
     * @param sexo the new sexo
     */
    public void setSexo(char sexo) {
        if (sexo == 'm' || sexo == 'M') {
            this.sexo = 'M';
        } else {
            this.sexo = 'H';
        }
    }
    
    /**
     * Sets the sexo.
     *
     * @param sexo the new sexo
     */
    public void setSexo(String sexo) {
        if (sexo.equalsIgnoreCase("mujer") || sexo.equalsIgnoreCase("muller") || sexo.equalsIgnoreCase("woman")) {
            this.sexo = 'M';
        } else {
            this.sexo = 'H';
        }
    }

    /**
     * Gets the categoria.
     *
     * @return the categoria
     */
    public String getCategoria() {
        switch(this.categoria) {
            case 'A':
                return "BENXAMIN";
            case 'B':
                return "ALEVIN";
            case 'C':
                return "INFANTIL";
            case 'D':
                return "CADETE";
            case 'E':
                return "XUVENIL";
            case 'F':
                return "SENIOR";
            case 'G':
                return "VETERANO";
            default:
                return "Sen asiganar";
        }
        
    }

    /**
     * Sets the categoria.
     *
     * @param categoria the new categoria
     */
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    /**
     * Gets the dorsal.
     *
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Calcular categoria.
     *
     * @param idade the idade
     * @return the char
     */
    private static char calcularCategoria(int idade) {
        if (idade < 8) {
            return 'A';
        } else if (idade >= 8 && idade <= 10) {
            return 'B';
        }else if (idade >= 11 && idade <= 12) {
            return 'C';
        }else if (idade >= 13 && idade <= 14) {
            return 'D';
        }else if (idade >= 15 && idade <= 18) {
            return 'E';
        }else if (idade >= 19 && idade <= 30) {
            return 'F';
        }else if (idade > 30) {
            return 'G';
        } else {
            return 0; 
        }
        
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apelidos == null) ? 0 : apelidos.hashCode());
        result = prime * result + ((nick == null) ? 0 : nick.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Participante other = (Participante) obj;
        if (apelidos == null) {
            if (other.apelidos != null)
                return false;
        } else if (!apelidos.equals(other.apelidos))
            return false;
        if (nick == null) {
            if (other.nick != null)
                return false;
        } else if (!nick.equals(other.nick))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    
    
}
