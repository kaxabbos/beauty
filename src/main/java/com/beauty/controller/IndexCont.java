package com.beauty.controller;

import com.beauty.controller.main.Attributes;
import com.beauty.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexCont extends Attributes {

    @GetMapping
    public String index1(Model model) {
        AddAttributesIndex(model);
        return "notes";
    }

    @GetMapping("/index")
    public String index2(Model model) {
        AddAttributesIndex(model);
        return "notes";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam String name, @RequestParam Long categoryId) {
        AddAttributesSearch(model, name, categoryId);
        return "notes";
    }
}
