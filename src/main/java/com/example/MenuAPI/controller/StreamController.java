package com.example.MenuAPI.controller;

import com.example.MenuAPI.controller.menu.CreateStream;
import com.example.MenuAPI.controller.menu.Stream;
import com.example.MenuAPI.controller.menu.StreamResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("streams")
public class StreamController {

    @Autowired
    private StreamRepository streamRepository;


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveStream(@RequestBody CreateStream createStream){
        streamRepository.save(new Stream(createStream));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<StreamResponseDTO> getAll(){

        List<StreamResponseDTO> streamList = streamRepository.findAll().stream().map(StreamResponseDTO::new).toList();
        return streamList;
    }

}
