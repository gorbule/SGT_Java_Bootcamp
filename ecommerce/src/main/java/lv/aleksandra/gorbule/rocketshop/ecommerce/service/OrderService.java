package lv.aleksandra.gorbule.rocketshop.ecommerce.service;

import com.sun.istack.NotNull;
import lv.aleksandra.gorbule.rocketshop.ecommerce.repository.Order;
import lv.aleksandra.gorbule.rocketshop.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);

    void update(@NotNull(message = "The order cannot be null.") @Valid Order order);
}
