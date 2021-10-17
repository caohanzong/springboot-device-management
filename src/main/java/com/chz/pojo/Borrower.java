package com.chz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author snicker
 * @date 2021/10/16 16:57
 * @Describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    private Integer id;
    private String borrowerName;
}
