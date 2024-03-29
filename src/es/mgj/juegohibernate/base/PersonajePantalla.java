package es.mgj.juegohibernate.base;

// Generated 22-ene-2014 15:58:55 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PersonajePantalla generated by hbm2java
 */
@Entity
@Table(name = "personaje_pantalla", catalog = "juego")
public class PersonajePantalla implements java.io.Serializable {

	private PersonajePantallaId id;
	private Personajes personajes;
	private Pantallas pantallas;
	private Byte terminada;
	private Date fechaInicio;
	private Date fechaFin;

	public PersonajePantalla() {
	}

	public PersonajePantalla(PersonajePantallaId id, Personajes personajes,
			Pantallas pantallas, Date fechaInicio) {
		this.id = id;
		this.personajes = personajes;
		this.pantallas = pantallas;
		this.fechaInicio = fechaInicio;
	}

	public PersonajePantalla(PersonajePantallaId id, Personajes personajes,
			Pantallas pantallas, Byte terminada, Date fechaInicio, Date fechaFin) {
		this.id = id;
		this.personajes = personajes;
		this.pantallas = pantallas;
		this.terminada = terminada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idPersonaje", column = @Column(name = "id_personaje", nullable = false)),
			@AttributeOverride(name = "idPantalla", column = @Column(name = "id_pantalla", nullable = false)) })
	public PersonajePantallaId getId() {
		return this.id;
	}

	public void setId(PersonajePantallaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_personaje", nullable = false, insertable = false, updatable = false)
	public Personajes getPersonajes() {
		return this.personajes;
	}

	public void setPersonajes(Personajes personajes) {
		this.personajes = personajes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pantalla", nullable = false, insertable = false, updatable = false)
	public Pantallas getPantallas() {
		return this.pantallas;
	}

	public void setPantallas(Pantallas pantallas) {
		this.pantallas = pantallas;
	}

	@Column(name = "terminada")
	public Byte getTerminada() {
		return this.terminada;
	}

	public void setTerminada(Byte terminada) {
		this.terminada = terminada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_inicio", nullable = false, length = 19)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_fin", length = 19)
	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

}
