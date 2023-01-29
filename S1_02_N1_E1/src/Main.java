import domain.Product;
import domain.Sale;
import exception.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

            Sale sale = initSale();
            sale.totalPriceSale = sale.calcTotalPrice();
            System.out.println("El preu final de la venda és: " + sale.totalPriceSale);

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Sale initSale() {
        List<Product> products = new ArrayList<>();

        // Per probar que funciona el codi. Si volem probar l'excepció commentar els add
        products.add(new Product("Pomes", 3.0));
        products.add(new Product("Taronges", 2.3));
        products.add(new Product("Pinya", 1.0));
        products.add(new Product("Mandarines", 1.5));


        return new Sale(products, 0.0);
    }
}