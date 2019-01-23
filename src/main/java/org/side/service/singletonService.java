package org.side.service;

import org.side.dao.CatalogueDAOImpl;

public class singletonService {
	private static CatalogueServiceImpl service;
	static {
		CatalogueDAOImpl dao =new CatalogueDAOImpl();
		dao.initialisation();
		service= new CatalogueServiceImpl();
		service.setDao(dao);
	}
	public static CatalogueServiceImpl getService() {
		return service;
	}

}
