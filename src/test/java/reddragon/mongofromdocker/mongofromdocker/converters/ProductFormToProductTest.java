package reddragon.mongofromdocker.mongofromdocker.converters;

import org.junit.Before;
import org.junit.Test;
import reddragon.mongofromdocker.mongofromdocker.commands.ProductForm;
import reddragon.mongofromdocker.mongofromdocker.domain.Product;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductFormToProductTest {

    ProductFormToProduct productFormToProduct;

    @Before
    public void setUp() throws Exception {

        productFormToProduct = new ProductFormToProduct();
    }

    @Test
    public void convert() {



        ProductForm productForm = new ProductForm();
        productForm.setId("1");
        productForm.setDescription("Produkt nr 1");
        productForm.setPrice(BigDecimal.valueOf(123L));
        productForm.setImageUrl("images");

        Product product = productFormToProduct.convert(productForm);

        Long l = 1L;

        assertEquals(l, product.get_id());
        assertEquals("Produkt nr 1", product.getDescription());
        assertEquals(BigDecimal.valueOf(123L), product.getPrice());
        assertEquals("images", product.getImageUrl());


    }
}