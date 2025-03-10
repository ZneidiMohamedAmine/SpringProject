package com.esprit.firstspringbootproject.controller;

import com.esprit.firstspringbootproject.entities.Bloc;
import com.esprit.firstspringbootproject.service.BlocService;
import com.esprit.firstspringbootproject.service.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {
    @Autowired
    IBlocService blocService;

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc bl)
    {
        return blocService.addBloc(bl);
    }

    @DeleteMapping("/delete-bloc")
    public  String deleteBloc(@RequestBody Bloc bl)
    {
        blocService.removeBloc(bl);
        return "Succes";
    }
}
