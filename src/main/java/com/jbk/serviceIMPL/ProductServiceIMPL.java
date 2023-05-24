package com.jbk.serviceIMPL;

import com.jbk.Service.ProductService;
import com.jbk.dao.ProductDao;
import com.jbk.daoIMPL.ProductDaoIMPL;
import com.jbk.model.Product;

public class ProductServiceIMPL implements ProductService {

	ProductDao dao = new ProductDaoIMPL();
	
	@Override
	public String saveProduct(Product product) {
		
		String msg = dao.saveProduct(product);
		return msg;
	}

	@Override
	public Product getProductById(String productId) {
		
		return null;
	}

}