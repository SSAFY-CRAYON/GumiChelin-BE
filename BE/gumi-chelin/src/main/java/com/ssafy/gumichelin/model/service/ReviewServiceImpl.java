package com.ssafy.gumichelin.model.service;


import com.ssafy.gumichelin.model.dto.Review;
import com.ssafy.gumichelin.model.mapper.ReviewMapper;
import com.ssafy.gumichelin.model.mapper.StoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{


    // Singleton으로 생성
    private static ReviewServiceImpl instance =  new ReviewServiceImpl();

    private ReviewServiceImpl() {}

    public static ReviewServiceImpl getInstance() {
        return instance;
    }

    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public void registerReview(Review review) {
        reviewMapper.insert(review);
    }

    @Override
    public void updateReview(Review review) {
        reviewMapper.update(review);
    }

    @Override
    public void deleteReview(int reviewId) {
        reviewMapper.delete(reviewId);
    }

    @Override
    public List<Review> selectByUserId(int userId) {

        return reviewMapper.selectByUserId(userId);
    }

    @Override
    public List<Review> selectAll() {
        return reviewMapper.selectAll();
    }
}
