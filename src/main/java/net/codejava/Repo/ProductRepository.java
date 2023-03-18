package net.codejava.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
