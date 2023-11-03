package com.travel.baenang.api.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.travel.baenang.api.entity.Place;
import com.travel.baenang.api.entity.QPlace;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PlaceRepositoryImpl implements PlaceRepositoryCustom {

    private final JPAQueryFactory factory;

    public List<Place> selectPlaceList() {
        QPlace place = QPlace.place;

        List<Place> list = factory.
                selectFrom(place).fetch();

        return list;
    }


}
