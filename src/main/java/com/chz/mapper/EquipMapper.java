package com.chz.mapper;

import com.chz.pojo.Equip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author snicker
 * @date 2021/10/16 17:02
 * @Describe
 */
@Mapper
@Repository
public interface EquipMapper {

    List<Equip> queryEquipList();
    Equip queryEquipById(int id);
    int addEquip(Equip equip);
    int updateEquip(Equip equip);
    int deleteEquip(int id);

}



























