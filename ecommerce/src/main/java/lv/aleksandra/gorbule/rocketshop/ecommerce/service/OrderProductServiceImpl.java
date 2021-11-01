package lv.aleksandra.gorbule.rocketshop.ecommerce.service;

import lv.aleksandra.gorbule.rocketshop.ecommerce.repository.OrderProduct;
import lv.aleksandra.gorbule.rocketshop.ecommerce.repository.OrderProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }

    //Getters and Setters

    public OrderProductRepository getOrderProductRepository() {
        return orderProductRepository;
    }

    public void setOrderProductRepository(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }
}
