package com.example.MenuAPI.controller.menu;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "stream")
@Entity(name = "Streams")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stream {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;


}
