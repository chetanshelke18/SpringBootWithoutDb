package com.jbk.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Service.ProductService;
import com.jbk.model.Product;
import com.jbk.serviceIMPL.ProductServiceIMPL;
import com.jbk.serviceIMPL.ProductServiceIMPL;

@RestController
public class ProductController {

	ProductService service = new ProductServiceIMPL();
	
	@PostMapping("/save-product")
	public String saveProduct(@RequestBody Product product) {
		
		String msg =service.saveProduct(product);
		
		return msg;
		
	}
	
	
	
}
