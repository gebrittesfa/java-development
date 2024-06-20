package com.pluralsight;


import com.pluralsight.dao.ProductDao;
import com.pluralsight.dao.SimpleProductDao;
import com.pluralsight.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws{
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ProductDao productDao = context.getBean(ProductDao.class);

            SimpleProductDao simpleProductDao = ctx.getBean(SimpleProductDao.class);
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. List Products");
            System.out.println("2. Add Product");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
// Consume newline
            switch (choice) {
                case 1:
                    //List<Product> products = productDao.getAll();
                    //for (Product product : products) {
                        System.out.println(simpleProductDao.getAll());
                    }
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
// Consume newline
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(productId, name, category, price);
                    simpleProductDao.add(product);
                    System.out.println(simpleProductDao.getAll());
                    break;
            }
                    System.out.println("Do you want to do it agian? " +
                            "Select the choice");
                    choice = scanner.nextInt();
            }
        }
    }
}
