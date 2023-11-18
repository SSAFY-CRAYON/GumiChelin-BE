package com.ssafy.gumichelin.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Store {

    private int storeId;
    private String storeType; // 맛집 or 디저트/카페
    private String name;
    private String address;
    private double latitude;
    private double longitude;
    private String businessHours;
    private String track;
    private int classNum;
    private String imgUrl;

}
