package com.example.image.controller;

import com.example.image.model.ImageResponse;
import com.example.image.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @GetMapping("/images")
    public ImageResponse getAllImages(){
        return new ImageResponse(imageRepository.findAll());
    }
}