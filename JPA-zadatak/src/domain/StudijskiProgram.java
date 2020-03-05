package domain;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;




@Entity
public class StudijskiProgram {

	@Id
	
	private Long id;
	
	private String naziv;
	
	@ManyToMany
	
	@JoinTable(name = "STUDPROG_PREDMET", joinColumns = {
			
			@JoinColumn(name = "studprog_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "predmet_id", referencedColumnName = "id") })
	
	private List<Predmet> predmeti;
	
	public StudijskiProgram() {
	
		super();
		predmeti = new ArrayList<Predmet>();
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public List<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	public StudijskiProgram(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.predmeti = predmeti;
	}
	
	
}
