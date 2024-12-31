package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Product;

public class ProductDAOImpl implements ProductDAO {
    // ProductDAO productDAO;
    // public ProductDAOImpl(ProductDAO productDAO) {
    //     this.productDAO=productDAO;
    // }
    @Override
    public int addProduct(Product product){
        // productDAO.addProduct(product);
        // return product.getProduct_id();
        return -1;
    }
   @Override
    public Product getProductById(int productId){
        //return productDAO.getProductById(productId);
        return null;
    }
    @Override
    public void updateProduct(Product product){
        // int id=product.getProduct_id();
        // productDAO.deleteProduct(id);
        // productDAO.addProduct(product);
    }
    @Override
    public void deleteProduct(int productId){
        // productDAO.deleteProduct(productId);
    }
    @Override
    public List<Product> getAllProducts(){
        // List<Product> allProducts= new ArrayList<>();
        // Product p= new Product();

        return List.of();
        
    }
}
