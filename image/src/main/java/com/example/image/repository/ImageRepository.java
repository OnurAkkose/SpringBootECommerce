package com.example.image.repository;

import com.example.image.model.Image;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ImageRepository extends CrudRepository<Image,Long> {

    List<Image> findAll();
}