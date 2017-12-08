package reddragon.mongofromdocker.mongofromdocker.repositories;

import org.springframework.data.repository.CrudRepository;
import reddragon.mongofromdocker.mongofromdocker.domain.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
}
