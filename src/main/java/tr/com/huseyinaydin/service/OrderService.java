package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.entity.Order;
import tr.com.huseyinaydin.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot, MySQL, k8s deployment.
 *
 */

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order addOrder(Order order){
       return repository.save(order);
    }

    public List<Order> getOrders(){
        return repository.findAll();
    }

    public Order getOrderById(int id){
        return repository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Geçersiz ID : "+id));
    }
}