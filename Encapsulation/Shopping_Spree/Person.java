package Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
        private String name;
        private double money;
        private List<Product> products;

        public Person(String name, double money) {
                this.setName(name);
                this.setMoney(money);
                this.products = new ArrayList<>();
        }

        public void setName(String name) {
                if (name.trim().isEmpty()){
                        throw new IllegalArgumentException("Name cannot be empty");
                }
                this.name = name;
        }

        public void setMoney(double money) {
                if (money < 0){
                        throw new IllegalArgumentException("Money cannot be negative");
                }
                this.money = money;
        }


        public void buyProduct(Product product){
                if (this.money < product.getCost()){
                        String message = String.format("%s can't afford %s",this.name, product.getName());
                      throw new IllegalArgumentException(message);
                }
                products.add(product);
                this.money -= product.getCost();

                System.out.printf("%s bought %s%n",this.name,product.getName());
        }

        public String getName() {
                return name;
        }

        public List<Product> getProducts() {
                return products;
        }
}
