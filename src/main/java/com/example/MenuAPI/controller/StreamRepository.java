package com.example.MenuAPI.controller;

import com.example.MenuAPI.controller.menu.Stream;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreamRepository extends JpaRepository<Stream, Long> {
}
