package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idp;
	private String description;
	private String dateAjout;
	private int quantite ;
	private float prixAchat;
	private float prixVente;
	@OneToOne
	@JoinColumn(name = "magasin", referencedColumnName = "id")
	private Magasin magasin;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(Integer idp, String description, String dateAjout, int quantite, float prixAchat, float prixVente,
			Magasin magasin) {
		super();
		this.idp = idp;
		this.description = description;
		this.dateAjout = dateAjout;
		this.quantite = quantite;
		this.prixAchat = prixAchat;
		this.prixVente = prixVente;
		this.magasin = magasin;
	}
	public Integer getIdp() {
		return idp;
	}
	public void setIdp(Integer idp) {
		this.idp = idp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
	}
	public float getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(float prixVente) {
		this.prixVente = prixVente;
	}
	public Magasin getMagasin() {
		return magasin;
	}
	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	
}