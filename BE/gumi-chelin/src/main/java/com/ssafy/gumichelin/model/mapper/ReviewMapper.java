package com.ssafy.gumichelin.model.mapper;


import com.ssafy.gumichelin.model.dto.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {


    /**
     * 리뷰 추가
     * @param review
     * @return
     */
    int insert(Review review);

    /**
     * 리뷰 업데이트
     * @param review
     * @return
     */
    int update(Review review);

    /**
     * 리뷰 삭제
     * @param reviewId
     * @return
     */
    int delete(int reviewId);

    /**
     * 유저 아이디에 따른 리뷰 조회
     * @param userId
     * @return
     */
    List<Review> selectByUserId(int userId);

    /**
     * 리뷰 전체 조회
     * @return
     */
    List<Review> selectAll();
}
