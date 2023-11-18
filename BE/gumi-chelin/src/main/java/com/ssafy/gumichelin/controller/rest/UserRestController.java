package com.ssafy.gumichelin.controller.rest;


import com.ssafy.gumichelin.model.dto.User;
import com.ssafy.gumichelin.model.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/user")
@CrossOrigin("*")
public class UserRestController {

    @Autowired
    UserService userService;

    @PostMapping("/join")
    @Operation(summary = "회원가입", description ="사용자 정보를 추가한다. 성공하면 true를 리턴한다")
    public Boolean insert(@RequestBody User user) {
        userService.join(user);
        return true;
    }

    @PostMapping("/login")
    @Operation(summary = "로그인", description = "학번, 비밀번호를 입력 받은 후, 로그인 처리한다.")
    public User login(String studentId, String pass) {
        return userService.login(studentId, pass);
    }

    @GetMapping("/isUsed")
    @Operation(summary = "아이디 중복 체크", description = "request parameter로 전달된 id가 이미 사용중인지 반환한다.")
    public Boolean isUsedStudentId(String studentId) {
        return userService.isUsedId(studentId);
    }

//    @GetMapping("/isUsed")
//    @Operation(summary = "아이디 중복 체크", description = "request parameter로 전달된 id가 이미 사용중인지 반환한다.")
//    public Boolean isUsedStudentId(String studentId) {
//        return userService.isUsedId(studentId);
//    }



    @GetMapping("/{studentId}")
    @Operation(summary = "회원 조회", description = "학번으로 사용자 정보를 조회한다. ")
    public User getUserInfo(@PathVariable("studentId") String studentId) {
        return userService.selectUser(studentId);
    }



}
