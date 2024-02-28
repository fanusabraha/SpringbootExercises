package com.coderscampus.SpringbootExercise.WebApplicationService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
@Service
public class FileService {
    public List<String> filestoRead (String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }
}
