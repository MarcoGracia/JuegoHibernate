package es.mgj.juegohibernate.base;

// Generated 22-ene-2014 15:58:55 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PersonajePantallaId generated by hbm2java
 */
@Embeddable
public class PersonajePantallaId implements java.io.Serializable {

	private int idPersonaje;
	private int idPantalla;

	public PersonajePantallaId() {
	}

	public PersonajePantallaId(int idPersonaje, int idPantalla) {
		this.idPersonaje = idPersonaje;
		this.idPantalla = idPantalla;
	}

	@Column(name = "id_personaje", nullable = false)
	public int getIdPersonaje() {
		return this.idPersonaje;
	}

	public void setIdPersonaje(int idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	@Column(name = "id_pantalla", nullable = false)
	public int getIdPantalla() {
		return this.idPantalla;
	}

	public void setIdPantalla(int idPantalla) {
		this.idPantalla = idPantalla;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonajePantallaId))
			return false;
		PersonajePantallaId castOther = (PersonajePantallaId) other;

		return (this.getIdPersonaje() == castOther.getIdPersonaje())
				&& (this.getIdPantalla() == castOther.getIdPantalla());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPersonaje();
		result = 37 * result + this.getIdPantalla();
		return result;
	}

}
