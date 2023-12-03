package tr.com.huseyinaydin.repository;

import tr.com.huseyinaydin.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot, MySQL, k8s deployment.
 *
 */

public interface OrderRepository extends JpaRepository<Order, Integer> {
}