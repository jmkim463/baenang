package com.travel.baenang.api.controller;

import com.travel.baenang.api.entity.Place;
import com.travel.baenang.api.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/place")
public class PlaceController {

    private final PlaceRepository repository;

    @GetMapping
    public ResponseEntity<?> etestst() {
        List<Place> list = repository.selectPlaceList();

        System.out.println(list);

        return ResponseEntity.ok(list);
    }

}
