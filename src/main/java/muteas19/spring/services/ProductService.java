package muteas19.spring.services;

import muteas19.spring.commands.ProductForm;
import muteas19.spring.domain.Product;

import java.util.List;


public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
