package com.example.MenuAPI.controller.menu;

public record StreamResponseDTO(Long id, String title, String image, Integer price) {

    public StreamResponseDTO(Stream stream){
        this(stream.getId(), stream.getTitle(), stream.getImage(), stream.getPrice());
    }
}
