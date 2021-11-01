package lv.aleksandra.gorbule.rocketshop.ecommerce.service;

import com.sun.istack.NotNull;
import lv.aleksandra.gorbule.rocketshop.ecommerce.repository.Product;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public interface ProductService {

    @NotNull
    Iterable<Product> getAllProducts();

    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id);

    Product save(Product product);
}
