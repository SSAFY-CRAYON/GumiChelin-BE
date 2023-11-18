package com.ssafy.gumichelin.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * userId: 유저 아이디
 * studentId: 학번
 * oddNum: 기수
 * track: 트랙
 * classNum: 반
 * pass: 비밀번호
 * nickname: 닉네임
 */

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {


    private int userId;
    private String studentId;
    private int oddNum;
    private String track;
    private int classNum;
    private String pass;
    private String nickname;

}
