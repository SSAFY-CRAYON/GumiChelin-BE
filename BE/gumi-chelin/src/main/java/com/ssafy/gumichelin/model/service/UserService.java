package com.ssafy.gumichelin.model.service;

import com.ssafy.gumichelin.model.dto.User;

public interface UserService {


    /**
     * 사용자 정보를 DB에 저장
     *
     * @param user
     */
    public void join(User user);


    /**
     * studentId, pass에 해당하는 User 정보 반환
     *
     * @param studentId
     * @param pass
     * @return
     */
    public User login(String studentId, String pass);


    /**
     * 해당 아이디가 가입된 아이디인지 반환
     *
     * @param studentId
     * @return
     */
    public boolean isUsedId(String studentId);


    /**
     * id에 해당하는 User 정보 반환
     *
     * @param studentId
     * @return
     */
    public User selectUser(String studentId);

}
