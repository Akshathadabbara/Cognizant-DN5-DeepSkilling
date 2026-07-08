package Week1.DesignAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        System.out.println("===== Linear Search =====");

        Product linearResult =
                linearSearch(products, 104);

        if (linearResult != null) {

            System.out.println(
                    "Product Found : "
                            + linearResult
            );
        } else {

            System.out.println(
                    "Product Not Found"
            );
        }

        Arrays.sort(
                products,
                Comparator.comparingInt(
                        Product::getProductId
                )
        );

        System.out.println();
        System.out.println(
                "===== Binary Search ====="
        );

        Product binaryResult =
                binarySearch(products, 104);

        if (binaryResult != null) {

            System.out.println(
                    "Product Found : "
                            + binaryResult
            );
        } else {

            System.out.println(
                    "Product Not Found"
            );
        }
    }

    // Linear Search
    public static Product linearSearch(
            Product[] products,
            int productId) {

        for (Product product : products) {

            if (product.getProductId()
                    == productId) {

                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(
            Product[] products,
            int productId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid =
                    (left + right) / 2;

            if (products[mid]
                    .getProductId()
                    == productId) {

                return products[mid];
            }

            if (products[mid]
                    .getProductId()
                    < productId) {

                left = mid + 1;
            } else {

                right = mid - 1;
            }
        }

        return null;
    }
}

class Product {

    private int productId;
    private String productName;
    private String category;

    public Product(
            int productId,
            String productName,
            String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {

        return productId;
    }

    public String getProductName() {

        return productName;
    }

    public String getCategory() {

        return category;
    }

    @Override
    public String toString() {

        return "ID=" + productId +
                ", Name=" + productName +
                ", Category=" + category;
    }
}