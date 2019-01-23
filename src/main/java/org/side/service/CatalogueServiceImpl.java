package org.side.service;

import java.util.List;

import org.side.dao.ICatalogueDAO;
import org.side.entities.Produit;

public class CatalogueServiceImpl implements ICatalogueService {
	private ICatalogueDAO dao;

	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addProduit(Produit p) {
		dao.addProduit(p);
		
	}

	@Override
	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
		
	}

	@Override
	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return dao.getProduit(ref);
	}

	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return dao.listProduits();
	}

	@Override
	public void updateProduit(Produit p) {
		dao.updateProduit(p);
		
	}

}
