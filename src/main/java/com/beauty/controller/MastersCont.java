package com.beauty.controller;

import com.beauty.controller.main.Attributes;
import com.beauty.model.Masters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Objects;
import java.util.UUID;

@Controller
@RequestMapping("/masters")
public class MastersCont extends Attributes {
    @GetMapping
    public String Masters(Model model) {
        AddAttributesMasters(model);
        return "masters";
    }
}
