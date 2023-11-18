package com.ssafy.gumichelin.controller.rest;


import com.ssafy.gumichelin.model.dto.Store;
import com.ssafy.gumichelin.model.dto.User;
import com.ssafy.gumichelin.model.service.StoreService;
import com.ssafy.gumichelin.model.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/store")
@CrossOrigin("*")
public class StoreRestController {


    @Autowired
    StoreService storeService;

    @GetMapping("/{storeType}")
    @Operation(summary = "스토어 타입에 따른 스토어 조회", description = "타입이 'rest'면 맛집 조회, 'dess'면 디저트/카페 조회 ")
    public List<Store> getUserInfo(@PathVariable("storeType") String storeType) {
        return storeService.selectStoreByType(storeType);
    }
}
