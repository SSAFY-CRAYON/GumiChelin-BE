package com.ssafy.gumichelin.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    private int reviewId;
    private int userId;
    private int storeId;
    private Date date;
    private int rating;
    private String content;
    private String imgUrl;
    private int hearts;
}
