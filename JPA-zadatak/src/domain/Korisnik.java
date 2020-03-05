package domain;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public abstract class Korisnik {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String ime;

	private String prezime;

	@Enumerated(EnumType.STRING)

	private KorisnickaUloga uloga;

	@OneToOne

	@JoinColumn(name = "KORISNICKINALOG_ID")

	private KorisnickiNalog nalog;

	public Korisnik() {
		super();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KorisnickaUloga getUloga() {
		return uloga;
	}

	public void setUloga(KorisnickaUloga uloga) {
		this.uloga = uloga;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Korisnik(Long id, String ime, String prezime, KorisnickaUloga uloga, KorisnickiNalog nalog) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.uloga = uloga;
		this.nalog = nalog;
	}

}
