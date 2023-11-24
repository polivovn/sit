import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    @Test
    public void shouldTestRemoveById() {
        ShopRepository repo = new ShopRepository();
        Product product = new Product(2, "Книга", 500);
        Product product1 = new Product(3, "Лист", 1500);
        repo.add(product);
        repo.add(product1);

        Assertions.assertDoesNotThrow(()->{
            repo.removeById(2);
        });

//        Assertions.assertThrows(NotFoundException.class, () -> {
//            repo.removeById(2);
//        });
    }
    @Test
    public void shouldTestRemoveByIdNegative() {
        ShopRepository repo = new ShopRepository();
        Product product = new Product(2, "Книга", 500);
        Product product1 = new Product(3, "Лист", 1500);
        repo.add(product);
        repo.add(product1);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(4);
        });
    }
}