package com.ssafy.gumichelin.model.service;

import com.ssafy.gumichelin.model.dto.Review;

import java.util.List;

public interface ReviewService {


    /**
     * 리뷰 추가
     * @param review
     * @return
     */
    public void registerReview(Review review);

    /**
     * 리뷰 업데이트
     * @param review
     * @return
     */
    public void updateReview(Review review);

    /**
     * 리뷰 삭제
     * @param reviewId
     * @return
     */
    public void deleteReview(int reviewId);

    /**
     * 유저 아이디에 따라 해당 유저가 작성한 리뷰 조회
     * @param userId
     * @return
     */
    public List<Review> selectByUserId(int userId);

    /**
     * 모든 리뷰 조회
     * @return
     */
    public List<Review> selectAll();
}
