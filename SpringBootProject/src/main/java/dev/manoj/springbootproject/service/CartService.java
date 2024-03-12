package dev.manoj.springbootproject.service;

import dev.manoj.springbootproject.models.Cart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class CartService {

    private final RestTemplate restTemplate;

    @Value("${fakestore.api.url}")
    private String fakeStoreApiUrl;

    public CartService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Cart> getAllCarts() {
        ResponseEntity<Cart[]> responseEntity = restTemplate.getForEntity(fakeStoreApiUrl + "/carts", Cart[].class);
        Cart[] carts = responseEntity.getBody();

        return Arrays.asList(carts);
    }

    public Cart getCartById(Long id) {

        return null;
    }
}
