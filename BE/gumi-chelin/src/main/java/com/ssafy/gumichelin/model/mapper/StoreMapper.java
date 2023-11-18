package com.ssafy.gumichelin.model.mapper;


import com.ssafy.gumichelin.model.dto.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StoreMapper {


//    /**
//     * 스토어 정보 추가
//     * @param store
//     * @return
//     */
//    int insert(Store store);

    /**
     * 타입 별 (맛집 or 디저트/카페) 조회
     * @param storeType
     * @return
     */
    List<Store> selectStoreByType(String storeType);




}
