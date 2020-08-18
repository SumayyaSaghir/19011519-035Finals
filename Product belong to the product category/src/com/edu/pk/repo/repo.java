
	 package com.edu.pk.repo;
	 import java.util.List;
	 import org.springframework.data.jpa.repository.JpaRepository;
	 import org.springframework.data.repository.CrudRepository;
	 import com.edu.pk.model.Product;
	 public interface ProductRepo extends JpaRepository<Product, Integer>{
	 List<Product> findByName(String name);
	 List<Product> findByIdGreaterThan(int id);
	 }
}
