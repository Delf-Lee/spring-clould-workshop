package com.elevenst.service;

<<<<<<< HEAD
=======
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductRemoteServiceImpl implements ProductRemoteService {

<<<<<<< HEAD
    private static final String url = "http://localhost:8082/products/";
=======
    private static final String url = "http://product/products/";
>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
    private final RestTemplate restTemplate;

    public ProductRemoteServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
<<<<<<< HEAD
    public String getProductInfo(String productId) {
        return this.restTemplate.getForObject(url + productId, String.class);
    }
}
=======
    @HystrixCommand(commandKey = "productInfo", fallbackMethod = "getProductInfoFallback")
    public String getProductInfo(String productId) {
        return this.restTemplate.getForObject(url + productId, String.class);
    }

    public String getProductInfoFallback(String productId, Throwable t) {
        System.out.println("t = " + t);
        return "[ this product is sold out ]";
    }
}
>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
