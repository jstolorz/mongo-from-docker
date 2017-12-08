package reddragon.mongofromdocker.mongofromdocker.converters;

import org.junit.Before;
import org.junit.Test;
import reddragon.mongofromdocker.mongofromdocker.commands.ProductForm;
import reddragon.mongofromdocker.mongofromdocker.domain.Product;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductToProductFormTest {

    ProductToProductForm productToProductForm;

    @Before
    public void setUp() throws Exception {
        productToProductForm = new ProductToProductForm();
    }

    @Test
    public void convert() {

        Product product = new Product();
        product.set_id(1L);
        product.setDescription("Product");
        product.setPrice(new BigDecimal(345));
        product.setImageUrl("images");

        ProductForm productForm = productToProductForm.convert(product);

        BigDecimal big = new BigDecimal(345);

        assertEquals("1", productForm.getId());
        assertEquals("Product", productForm.getDescription());
        assertEquals(big, productForm.getPrice());

    }
}