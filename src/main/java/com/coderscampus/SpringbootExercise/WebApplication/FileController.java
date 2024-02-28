package com.coderscampus.SpringbootExercise.WebApplication;

import com.coderscampus.SpringbootExercise.WebApplicationService.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

// controller allows the independency injection
@RestController
public class FileController {
    // Instantiating we dont need dat, Spring manages that through AutoWire
    @Autowired
    public FileService fileService;
    @GetMapping("/read-lines")
    public List<String> readLines () throws IOException {
        return fileService.filestoRead("mein-info.txt");
    }
    @GetMapping ("/hello-world")
    public String hello (){ return "hello";}
    // retrieves the data when a pull request is made
    @PostMapping("/hello-world")
    public String hellopost (){ return "hello";}

}
