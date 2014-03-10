package es.mgj.juegohibernate.base;

// Generated 22-ene-2014 15:58:55 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pantallas generated by hbm2java
 */
@Entity
@Table(name = "pantallas", catalog = "juego")
public class Pantallas implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private String descripcion;
	private Integer dificultad;
	private String mundo;
	private Set<Enemigos> enemigoses = new HashSet<Enemigos>(0);
	private Set<Trofeos> trofeoses = new HashSet<Trofeos>(0);
	private Set<PersonajePantalla> personajePantallas = new HashSet<PersonajePantalla>(
			0);

	public Pantallas() {
	}

	public Pantallas(String nombre) {
		this.nombre = nombre;
	}

	public Pantallas(String nombre, String descripcion, Integer dificultad,
			String mundo, Set<Enemigos> enemigoses, Set<Trofeos> trofeoses,
			Set<PersonajePantalla> personajePantallas) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dificultad = dificultad;
		this.mundo = mundo;
		this.enemigoses = enemigoses;
		this.trofeoses = trofeoses;
		this.personajePantallas = personajePantallas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nombre", nullable = false, length = 500)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "dificultad")
	public Integer getDificultad() {
		return this.dificultad;
	}

	public void setDificultad(Integer dificultad) {
		this.dificultad = dificultad;
	}

	@Column(name = "mundo", length = 500)
	public String getMundo() {
		return this.mundo;
	}

	public void setMundo(String mundo) {
		this.mundo = mundo;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "enemigo_pantalla", catalog = "juego", joinColumns = { @JoinColumn(name = "id_pantalla", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "id_enemigo", nullable = false, updatable = false) })
	public Set<Enemigos> getEnemigoses() {
		return this.enemigoses;
	}

	public void setEnemigoses(Set<Enemigos> enemigoses) {
		this.enemigoses = enemigoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pantallas")
	public Set<Trofeos> getTrofeoses() {
		return this.trofeoses;
	}

	public void setTrofeoses(Set<Trofeos> trofeoses) {
		this.trofeoses = trofeoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pantallas")
	public Set<PersonajePantalla> getPersonajePantallas() {
		return this.personajePantallas;
	}

	public void setPersonajePantallas(Set<PersonajePantalla> personajePantallas) {
		this.personajePantallas = personajePantallas;
	}

}
