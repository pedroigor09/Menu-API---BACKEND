package com.example.MenuAPI.controller.menu;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "streams")
@Entity(name = "Streams")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Stream {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;


    public Stream(CreateStream createStream) {
        this.title = createStream.title();
        this.image = createStream.image();
        this.price = createStream.price();
    }
}
