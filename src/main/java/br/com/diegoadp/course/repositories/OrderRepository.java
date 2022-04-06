package br.com.diegoadp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diegoadp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
