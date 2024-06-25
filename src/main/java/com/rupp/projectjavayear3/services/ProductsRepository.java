package com.rupp.projectjavayear3.services;

import com.rupp.projectjavayear3.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Integer> {

}
