package com.product.productms.controller;


import com.product.productms.dto.request.ProductRequestDto;
import com.product.productms.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin")
public class adminController {

    private  final ProductService productService;

    @GetMapping("/home")
    public String getAdminHomePage(Model model){
        model.addAttribute("items", productService.getAllProduct());
        return "adminSite";
    }


    //Save new product
    @GetMapping("/new-item")
    public String getAddItemForm(Model model){
        model.addAttribute("product", new ProductRequestDto());
        return "newData";
    }

    @PostMapping("/saveNewProduct")
    public String saveAndGetItem(@ModelAttribute ProductRequestDto dto){
        productService.saveTheProduct(dto);
        return "redirect:/admin/home";
    }


    //Delete
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/admin/home";
    }


//    Update Data
    @GetMapping("/edit/{id}")
    public String getEditForm(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "editData";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable Integer id, @ModelAttribute ProductRequestDto dto){
        productService.updateProduct(id, dto);
        return "redirect:/admin/home";
    }

}
