package br.com.diegoadp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diegoadp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
