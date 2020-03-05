package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity

@Table(name = "Ispit", uniqueConstraints = {
		
		@UniqueConstraint(columnNames = {"PROFESORPRED_ID", "STUD_ID"})
})
public class Ispit {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private Date datum;
	private int ocena;
	
	@ManyToOne
	@JoinColumn(name = "PROFESORPRED_ID",referencedColumnName = "ID")
	
	private PredmetProfesor predmetProfesor;
	
	@ManyToOne
	@JoinColumn(name = "STUD_ID",referencedColumnName = "ID")
	
	private Student student;
	public Ispit() {
		super();
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public PredmetProfesor getProfesorPredmet() {
		return predmetProfesor;
	}
	public void setProfesorPredmet(PredmetProfesor profesorPredmet) {
		this.predmetProfesor = profesorPredmet;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Ispit(Long id, Date datum, int ocena, PredmetProfesor profesorPredmet, Student student) {
		super();
		this.id = id;
		this.datum = datum;
		this.ocena = ocena;
		this.predmetProfesor = profesorPredmet;
		this.student = student;
	}
	
	
}