package reddragon.mongofromdocker.mongofromdocker.converters;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import reddragon.mongofromdocker.mongofromdocker.commands.ProductForm;
import reddragon.mongofromdocker.mongofromdocker.domain.Product;

@Component
public class ProductFormToProduct implements Converter<ProductForm, Product> {
    @Override
    public Product convert(ProductForm source) {

        Product product = new Product();

        if(source.getId() != null && !StringUtils.isEmpty(source.getId())){
            product.set_id(Long.valueOf(source.getId()));
        }

        product.setDescription(source.getDescription());
        product.setPrice(source.getPrice());
        product.setImageUrl(source.getImageUrl());


        return product;
    }
}
