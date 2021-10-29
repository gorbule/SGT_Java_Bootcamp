package lv.aleksandra.gorbule.rocketshop.ecommerce.repository;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String name;

    private Double price;

    private String pictureUrl;

    // all arguments constructor
    // standard getters and setters
}
