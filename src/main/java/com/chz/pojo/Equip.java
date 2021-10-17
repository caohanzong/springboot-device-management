package com.chz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author snicker
 * @date 2021/10/16 16:58
 * @Describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equip {
    private Integer id;
    private String name;
    private Integer serial;
    private Integer state;  //1 正常  2 故障 3 维修中
    private String borrower;
    private Date date;
}
