package com.example.chatapp.loader;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.chatapp.entity.Product;
import com.example.chatapp.repository.ProductRepository;
import com.opencsv.CSVReader;

@Component
public class ProductCSVLoader {

    @Autowired
    private ProductRepository productRepository;

    public void load() {
        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/data/products.csv"))) {
            String[] line;
            boolean isFirstLine = true;

            while ((line = reader.readNext()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                Product product = new Product(
                    Long.parseLong(line[0]),           // id
                    Double.parseDouble(line[1]),       // cost
                    line[2],                           // category
                    line[3],                           // name
                    line[4],                           // brand
                    Double.parseDouble(line[5]),       // retail_price
                    line[6],                           // department
                    line[7],                           // sku
                    Long.parseLong(line[8])            // distribution_center_id
                );

                productRepository.save(product);
            }

            System.out.println("✅ products.csv loaded.");
        } catch (Exception e) {
            System.err.println("❌ Error loading products.csv: " + e.getMessage());
        }
    }
}
