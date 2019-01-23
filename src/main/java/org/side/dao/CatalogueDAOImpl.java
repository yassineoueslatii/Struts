package org.side.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.side.entities.Produit;

public class CatalogueDAOImpl implements ICatalogueDAO {
	private Map<String, Produit> produits=new HashMap<String, Produit>();
	
	  
	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		produits.put(p.getReference(), p);
		
	}

	@Override
	public void deleteProduit(String ref) {
		produits.remove(ref);
		
	}

	@Override
	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return new ArrayList<Produit>(produits.values());
		
	}

	@Override
	public void updateProduit(Produit p) {
		// TODO Auto-generated method stub
		produits.put(p.getReference(), p);
		
		
	}
	public void initialisation () {
		addProduit(new Produit("ABC", "ABC", 50, 00, true));
		addProduit(new Produit("ABCD", "ABCD", 50, 00, true));
		addProduit(new Produit("ABCDE", "ABCDE", 50, 00, true));
	}

}
