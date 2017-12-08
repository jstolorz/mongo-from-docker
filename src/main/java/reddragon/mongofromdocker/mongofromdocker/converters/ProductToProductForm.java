package reddragon.mongofromdocker.mongofromdocker.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import reddragon.mongofromdocker.mongofromdocker.commands.ProductForm;
import reddragon.mongofromdocker.mongofromdocker.domain.Product;

@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {


    @Override
    public ProductForm convert(Product source) {

        ProductForm productForm = new ProductForm();

        productForm.setId(source.get_id().toString());
        productForm.setDescription(source.getDescription());
        productForm.setPrice(source.getPrice());


        return productForm;
    }
}
