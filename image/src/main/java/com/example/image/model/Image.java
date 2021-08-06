package com.example.image.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private int productId;
    private String path;
}