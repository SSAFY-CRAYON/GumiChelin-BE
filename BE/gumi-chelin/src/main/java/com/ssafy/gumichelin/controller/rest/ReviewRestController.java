package com.ssafy.gumichelin.controller.rest;


import com.ssafy.gumichelin.model.dto.Review;
import com.ssafy.gumichelin.model.service.ReviewService;
import com.ssafy.gumichelin.model.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/review")
@CrossOrigin("*")
public class ReviewRestController {

    @Autowired
    ReviewService reviewService;


    @PostMapping
    @Transactional
    @Operation(summary = "리뷰 등록", description = "리뷰를 등록한다. 성공하면 true를 리턴한다")
    public Boolean registerReview(@RequestBody Review review) {
        reviewService.registerReview(review);
        return true;
    }

    @PutMapping
    @Transactional
    @Operation(summary = "리뷰 수정", description = "리뷰를 수정한다. 성공하면 true를 리턴한다")
    public Boolean updateReview(@RequestBody Review review) {
        reviewService.updateReview(review);
        return true;
    }

    @DeleteMapping("/{reviewId}")
    @Transactional
    @Operation(summary = "리뷰 삭제", description = "리뷰를 삭제한다. 성공하면 true를 리턴한다")
    public Boolean deleteReview(@PathVariable int reviewId) {
        reviewService.deleteReview(reviewId);
        return true;
    }

    @GetMapping("/{userId}")
    @Operation(summary = "특정 사용자 리뷰 조회", description = "특정 사용자의 리뷰를 조회하여 반환한다.")
    public List<Review> selectReviewByUserId(@PathVariable int userId) {
        return reviewService.selectByUserId(userId);
    }

    @GetMapping
    @Operation(summary = "전체 리뷰 조회", description = "모든 리뷰를 조회하여 리턴한다.")
    public List<Review> selectAllReview() {
        return reviewService.selectAll();
    }


}
