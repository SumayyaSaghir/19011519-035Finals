package com.edu.pk.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.edu.pk.model.Product;
import com.edu.pk.repo.ProductRepo;
@RestController
public class ProductController {
	@Autowired
	ProductRepo repo;
	@RequestMapping("/")
	public String home() {
	return "home.jsp";
	}
	 @DeleteMapping("/product/{id}")
	 public String deleteProduct(@PathVariable int id) {
	 Product p=repo.getOne(id);

	 repo.delete(p);
	 return "Deleted";

	 }
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
	repo.save(product);
	return product;
	}
	 @GetMapping("/products")
	public List<Product> getProduct() {
	return repo.findAll();
	}

	 @PutMapping("/product")
	 public Product saveOrUpdateProduct(@RequestBody Product product)
	 {
	 repo.save(product);
	 return product;
	 }
	 @RequestMapping("/prodcut/{id}")

	 public Optional<Product> getProduct(@PathVariable("id") int id) {

	 return repo.findById(id);
	 }
	}






