package com.ssafy.gumichelin.model.mapper;

import com.ssafy.gumichelin.model.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 사용자 정보 추가
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 특정 사용자 정보 조회
     * @param studentId
     * @return
     */
    User select(String studentId);

    /**
     * 사용자 전체 조회
     * @return
     */
    List<User> selectAll();

}
