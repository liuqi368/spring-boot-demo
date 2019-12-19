package com.example.controller;

import com.example.service.ImageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liuqi
 * @Title: ImageController
 * @ProjectName spring-boot-demo
 * @Description: TODO
 * @date 2018/12/316:58
 */
@RestController
@SpringBootApplication
//@ComponentScan(basePackages={"com.example.service"})
public class ImageController {
/*
    @Resource
    private ImageService imageService;
    @Value("${image.server.location}")
    private String location;
    @Value("${image.server.ip}")
    private String ip;
    @Value("${image.server.port}")
    private String port;

    @GetMapping("images")
    public List<String> getAllDetailImages() throws IOException {
        Path root = Paths.get(location);
        return Files.walk(root)
                .filter(path->!path.equals(root)&&!path.getFileName().toString().startsWith("."))
                .map(path->root.relativize(path))
                .map(path-> MvcUriComponentsBuilder.fromMethodName(ImageController.class,"getFile",path.toString()).build().toString())
                .collect(Collectors.toList());
    }

    @GetMapping("/files/{fileName:.+}")
    public ResponseEntity<?> getFile(@PathVariable("fileName") String fileName){
        Path path = Paths.get(location).resolve(fileName);
        try {
            org.springframework.core.io.Resource resource = new UrlResource(path.toUri());
            if(resource.exists()&&resource.isReadable())
                return ResponseEntity.ok(resource);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
