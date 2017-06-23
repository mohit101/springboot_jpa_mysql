/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.services;

import guru.springframework.domain.Order;
import guru.springframework.domain.Product;
import java.util.List;

/**
 *
 * @author mohitm@bdcvit.com
 */
public interface ProductDao {

    public void save(Product product);

    public List<Product> getList();

//    public void registerUser(Product product);
//
//    public void validateUser(String username, String password);
//
//    public void checkUserExistence(String username);
//
//    public Product getUserById(String id);
//
//    public String sendOtp(String mobileNo);
//
//    public void forgatePassword(String email);
//
//    public void updateUser(Product product);
//
//    public List<Product> getAllUser();
//
//    public String placeOrder(Order order, String username);
//
//    public Order getOrder(String orderId);
//
//    public List<Order> getAllOrder(String username);
//
//    public List<Item> getRelatedItem(String itemKeyword);
//
//    public String payAmmount(Payment payment);
//
//    public Payment getpaymentDetail(String paymentId);

}
