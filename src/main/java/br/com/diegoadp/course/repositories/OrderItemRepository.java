package br.com.diegoadp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.diegoadp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
