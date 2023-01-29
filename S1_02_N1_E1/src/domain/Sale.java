package domain;


import exception.EmptySaleException;

import java.util.List;

public class Sale {
    public List<Product> products;
    public Double totalPriceSale;

    public Sale(List<Product> products, Double totalPriceSale) {
        this.products = products;
        this.totalPriceSale = totalPriceSale;
    }


    public Double calcTotalPrice() throws EmptySaleException {

        if (products == null || products.isEmpty()) {
            throw new EmptySaleException("Per fer una venda primer has d’afegir productes");
        } else {
            return products.stream().mapToDouble(e -> e.price).sum();
        }

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Double getTotalPriceSale() {
        return totalPriceSale;
    }

    public void setTotalPriceSale(Double totalPriceSale) {
        this.totalPriceSale = totalPriceSale;
    }
}