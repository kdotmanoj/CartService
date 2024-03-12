package com.example.Product.DTO;
import java.sql.Date;
import java.util.List;

import dev.manoj.springbootproject.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreApi {
    String id;
    String UserId;
    Date date;
    List<Product> products;
    int __v;
}



