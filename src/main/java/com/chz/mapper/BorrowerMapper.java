package com.chz.mapper;

import com.chz.pojo.Borrower;
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
public interface BorrowerMapper {
    List<Borrower> queryBorrowerList();
    Borrower queryBorrowerById(int id);
    int addBorrower(Borrower borrower);
}
