package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magasin {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idm;
	private String titre;
	private String lieu;
	public Magasin() {
		// TODO Auto-generated constructor stub
	}
	public Magasin(Integer idm, String titre, String lieu) {
		super();
		this.idm = idm;
		this.titre = titre;
		this.lieu = lieu;
	}
	public Integer getIdm() {
		return idm;
	}
	public void setIdm(Integer idm) {
		this.idm = idm;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	
	
	

}
