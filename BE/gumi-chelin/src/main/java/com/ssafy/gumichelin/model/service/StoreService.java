package com.ssafy.gumichelin.model.service;

import com.ssafy.gumichelin.model.dto.Store;

import java.util.List;

public interface StoreService {


    /**
     * storeType에 해당하는 StoreList 정보 반환
     *
     * @param storeType
     * @return
     */
    public List<Store> selectStoreByType(String storeType);
}
