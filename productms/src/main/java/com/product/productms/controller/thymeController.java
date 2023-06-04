package com.product.productms.controller;

import com.product.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class thymeController {
    private final ProductService productService;

    @GetMapping("/")
    public String getHomepage(Model model){
        model.addAttribute("products", productService.getAllProduct());
        return "index";
    }
}
