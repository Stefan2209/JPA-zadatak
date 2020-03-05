package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Profesor extends Korisnik {
	
	@Enumerated(EnumType.STRING)
	
	private String zvanje;
	private Date date;
	
	@OneToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	
	private Department department;
	
	@OneToMany(mappedBy = "profesor", orphanRemoval = true, cascade = CascadeType.ALL)
	
	private Set<PredmetProfesor> profesorPredmets;

	public Profesor() {
		super();
		profesorPredmets = new HashSet<PredmetProfesor>();

	}

	public String getZvanje() {
		return zvanje;
	}

	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<PredmetProfesor> getProfesorPredmets() {
		return profesorPredmets;
	}

	public void setProfesorPredmets(Set<PredmetProfesor> profesorPredmets) {
		this.profesorPredmets = profesorPredmets;
	}

}
