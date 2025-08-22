package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  private final List<Product> products = new ArrayList<>(List.of(
      new Product(1L, "Laptop", "SKU-001", 1299.99),
      new Product(2L, "Mouse", "SKU-002", 19.99),
      new Product(3L, "Keyboard", "SKU-003", 49.99)
  ));

  @GetMapping
  public List<Product> all(){
    return products;
  }

  @GetMapping("/{id}")
  public Product byId(@PathVariable Long id){
    return products.stream().filter(p -> p.id().equals(id)).findFirst()
        .orElseThrow(() -> new NoSuchElementException("Product not found"));
  }
}
