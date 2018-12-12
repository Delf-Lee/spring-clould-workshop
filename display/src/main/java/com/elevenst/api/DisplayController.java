package com.elevenst.api;

<<<<<<< HEAD
=======
import com.elevenst.service.FeignProductRemoteService;
>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
import com.elevenst.service.ProductRemoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/displays")
public class DisplayController {

    private final ProductRemoteService productRemoteService;
<<<<<<< HEAD

    public DisplayController(ProductRemoteService productRemoteService) {
        this.productRemoteService = productRemoteService;
=======
    private final FeignProductRemoteService feignProductRemoteService;

    public DisplayController(ProductRemoteService productRemoteService,
                             FeignProductRemoteService feignProductRemoteService) {
        this.productRemoteService = productRemoteService;
        this.feignProductRemoteService = feignProductRemoteService;
>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
    }

    @GetMapping(path = "/{displayId}")
    public String getDisplayDetail(@PathVariable String displayId) {
        String productInfo = getProductInfo();
        return String.format("[display id = %s at %s %s ]", displayId, System.currentTimeMillis(), productInfo);
    }

    private String getProductInfo() {
<<<<<<< HEAD
        return productRemoteService.getProductInfo("12345");
=======
        return feignProductRemoteService.getProductInfo("12345");
>>>>>>> 4bd300eb2533fd1e0afcec025ab80e46621c1f3e
    }
}