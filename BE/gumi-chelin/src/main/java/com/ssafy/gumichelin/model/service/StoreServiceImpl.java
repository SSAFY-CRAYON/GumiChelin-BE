package com.ssafy.gumichelin.model.service;

import com.ssafy.gumichelin.model.dto.Store;
import com.ssafy.gumichelin.model.mapper.StoreMapper;
import com.ssafy.gumichelin.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    // Singleton으로 생성
    private static StoreServiceImpl instance =  new StoreServiceImpl();

    private StoreServiceImpl() {}

    public static StoreServiceImpl getInstance() {
        return instance;
    }


    @Autowired
    StoreMapper storeMapper;

    @Override
    public List<Store> selectStoreByType(String storeType) {
        return storeMapper.selectStoreByType(storeType);
    }
}
