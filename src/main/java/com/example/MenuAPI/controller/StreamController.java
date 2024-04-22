package com.example.MenuAPI.controller;

import com.example.MenuAPI.controller.menu.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("stream")
public class StreamController {

    @Autowired
    private StreamRepository streamRepository;

    @GetMapping
    public List<Stream> getAll(){

        List<Stream> streamList = streamRepository.findAll();
        return streamList;
    }

}
