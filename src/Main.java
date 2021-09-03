import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Customer BobCustomer = new Customer(1,"Bob",1);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Minion","Toys",14));
        products.add(new Product(2,"Java for dummies","Books",175));
        products.add(new Product(3,"Lego","Toys",10));
        products.add(new Product(4,"Java for dummies4","Books",55));
        products.add(new Product(5,"Minion","Toys",12));
        products.add(new Product(6,"Java for dummies6","Books",250));
        products.add(new Product(7,"FuncoPop","Toys",13));
        products.add(new Product(8,"JS learn","Books",50));
        products.add(new Product(9,"Java for dummies9","Books",300));
        products.add(new Product(10,"Barbie","Toys",11));


        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1,"done", LocalDate.of(2021,4,24),LocalDate.of(2021,4,25),products, BobCustomer));
        orders.add(new Order(2,"pending", LocalDate.of(2021,5,30),LocalDate.of(2021,6,1),products, BobCustomer));
        orders.add(new Order(3,"on the way", LocalDate.of(2021,6,15),LocalDate.of(2021,6,16),products, BobCustomer));
        orders.add(new Order(4,"ready", LocalDate.of(2021,7,10),LocalDate.of(2021,7,11),products, BobCustomer));
        orders.add(new Order(5,"ready", LocalDate.of(2021,3,14),LocalDate.of(2021,7,11),products, BobCustomer));
        orders.add(new Order(6,"ready", LocalDate.of(2021,3,14),LocalDate.of(2021,7,11),products, BobCustomer));
        orders.add(new Order(7,"ready", LocalDate.of(2021,3,14),LocalDate.of(2021,7,11),products, BobCustomer));




//  1.Obtain a list of products belongs to category “Books” with price > 100
//                products.stream()
//                .filter(product -> product.getCategory().equals("Books"))
//                .filter(product -> product.getPrice() <= 100)
//                .forEach(System.out::println);

//  2.Obtain a list of product with category = “Toys” and then apply 10% discount

//        products.stream()
//                .filter(product -> product.getCategory().equals("Toys"))
//                .map(product -> product.getPrice() - (product.getPrice() * 0.1))
//                .forEach(product -> System.out.println(product));

//  3.Get the cheapest products of “Books” category

//        Optional<Product> prod = products.stream()
//                .filter(product -> product.getCategory().equals("Books"))
//                .sorted(Comparator.comparing(Product::getPrice))
//                .findFirst();
//        System.out.println(prod);


//4.Get the 3 most recent placed order
//      orders.stream()
//              .sorted((o1, o2) -> o2.getOrderDate().compareTo(o1.getOrderDate())).limit(3)
//              .forEach(order -> System.out.println(order));

//5.Calculate order average payment placed on 14-Mar-2021
//       Order payment = orders.stream()
//                .filter(order -> order.getOrderDate().equals(LocalDate.of(2021,3,14)))
////                .mapToDouble(order -> order)

//        System.out.println();







//       System.out.println();


// TODO:
//  5. Calculate order average payment placed on 14-Mar-2021 (використайте в процесі mapToDouble)
//  6. Get the most expensive product by category (використайте groupingBy)

























    }
}
