package org.side.service;

import java.util.List;

import org.side.entities.Produit;

public interface ICatalogueService {
	public void addProduit(Produit p);
	public void deleteProduit(String ref);
	public Produit getProduit(String ref);
	public List<Produit> listProduits();
	public void updateProduit(Produit p);
}
