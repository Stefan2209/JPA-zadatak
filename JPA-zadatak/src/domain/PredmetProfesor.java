package domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ManufacturerLicence", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "PREDMET_ID", "PROF_ID" }) })
public class PredmetProfesor {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@ManyToOne

	@JoinColumn(name = "PREDMET_ID", referencedColumnName = "ID")

	private Predmet predmet;

	@ManyToOne
	@JoinColumn(name = "PROF_ID", referencedColumnName = "ID")

	private Profesor profesor;

	@OneToMany(mappedBy = "predmetProfesor", orphanRemoval = true, cascade = CascadeType.ALL)

	private Set<Ispit> ispiti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public PredmetProfesor() {
		super();
		ispiti = new HashSet<Ispit>();
	}

	public PredmetProfesor(Long id, Predmet predmet, Profesor profesor, Set<Ispit> ispiti) {
		super();
		this.id = id;
		this.predmet = predmet;
		this.profesor = profesor;
		this.ispiti = ispiti;
	}

}
