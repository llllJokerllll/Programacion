package prueba.examen.collections;

public class Juego {

	private int id_juego;
	private String titulo;
	private String genero;
	private String plataforma;
	private boolean multijugador;
	
	public Juego() {
		super();
	}

	public Juego(int id_juego) {
		super();
		this.id_juego = id_juego;
	}

	public Juego(String titulo, String genero, String plataforma, boolean multijugador) {
		super();
		this.id_juego = getId_juego();
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.multijugador = multijugador;
	}

	public int getId_juego() {
		return id_juego;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public boolean isMultijugador() {
		return multijugador;
	}

	public void setMultijugador(boolean multijugador) {
		this.multijugador = multijugador;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + id_juego;
		result = prime * result + (multijugador ? 1231 : 1237);
		result = prime * result + ((plataforma == null) ? 0 : plataforma.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id_juego != other.id_juego)
			return false;
		if (multijugador != other.multijugador)
			return false;
		if (plataforma == null) {
			if (other.plataforma != null)
				return false;
		} else if (!plataforma.equals(other.plataforma))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Juego [id_juego=%s, titulo=%s, genero=%s, plataforma=%s, multijugador=%s]", id_juego,
				titulo, genero, plataforma, multijugador);
	}
	
	
}
