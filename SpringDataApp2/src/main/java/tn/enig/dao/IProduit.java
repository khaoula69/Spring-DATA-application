package tn.enig.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import tn.enig.model.Produit;

@Repository
public interface IProduit extends JpaRepository<Produit, Integer> {
	
	@Query("from Produit p where p.magasin.id = ?1")
	public List<Produit> findByIdMagasin(int idm);


}
