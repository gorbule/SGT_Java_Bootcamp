package lv.aleksandra.gorbule.rocketshop.ecommerce.service;

import lv.aleksandra.gorbule.rocketshop.ecommerce.repository.OrderProduct;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
public interface OrderProductService {

    OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}
