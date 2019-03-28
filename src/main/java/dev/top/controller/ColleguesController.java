package dev.top.controller;

import dev.top.entities.Collegues;
import dev.top.repos.ColleguesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/collegues")
public class ColleguesController {

    @Autowired
    private ColleguesRepo colleguesRepo;

    @GetMapping
    public List<Collegues> findAll() {
        return this.colleguesRepo.findAll();
    }
}
