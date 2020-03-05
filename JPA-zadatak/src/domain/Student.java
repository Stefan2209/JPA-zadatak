package domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Student extends Korisnik {

	private String indeks;
	private Date datum_rodjenja;

	@OneToOne
	@JoinColumn(name = "STUD_PROG_ID")

	private StudijskiProgram studijskiProgram;

	@OneToMany(mappedBy = "student", orphanRemoval = true, cascade = CascadeType.ALL)

	private Set<Ispit> ispiti;

	public Student() {
		super();
	}

	public String getIndeks() {
		return indeks;
	}

	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}

	public Date getDatum_rodjenja() {
		return datum_rodjenja;
	}

	public void setDatum_rodjenja(Date datum_rodjenja) {
		this.datum_rodjenja = datum_rodjenja;
	}

	public StudijskiProgram getStudijskiProgram() {
		return studijskiProgram;
	}

	public void setStudijskiProgram(StudijskiProgram studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}

	public Student(String indeks, Date datum_rodjenja, StudijskiProgram studijskiProgram) {
		super();
		this.indeks = indeks;
		this.datum_rodjenja = datum_rodjenja;
		this.studijskiProgram = studijskiProgram;
	}

}
