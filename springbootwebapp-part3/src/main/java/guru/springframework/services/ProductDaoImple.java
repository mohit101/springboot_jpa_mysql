/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.services;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mohitm@bdcvit.com
 */
public class ProductDaoImple implements ProductDao {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getList() {
        Iterable<Product> findAll = productRepository.findAll();
        List<Product> list = new ArrayList<>();
        for (Product l : findAll) {
            list.add(l);
        }
        return list;
    }
}
