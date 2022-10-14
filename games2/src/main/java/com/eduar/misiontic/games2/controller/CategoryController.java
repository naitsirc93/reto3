package com.eduar.misiontic.games2.controller;

import com.eduar.misiontic.games2.entities.Category;
import com.eduar.misiontic.games2.entities.Product;
import com.eduar.misiontic.games2.service.CategoryService;
import com.eduar.misiontic.games2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping("/save")
    public Category save(@RequestBody Category p){
        return categoryService.save(p);

    }
}


