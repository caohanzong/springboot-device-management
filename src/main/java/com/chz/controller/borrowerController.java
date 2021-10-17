package com.chz.controller;

import com.chz.mapper.BorrowerMapper;
import com.chz.pojo.Borrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author snicker
 * @date 2021/10/17 17:04
 * @Describe
 */
@Controller
public class borrowerController {
    @Autowired
    BorrowerMapper borrowerMapper;

    @RequestMapping("/borrowers")
    public String list(Model model){
        List<Borrower> borrowers=borrowerMapper.queryBorrowerList();
        model.addAttribute("borrowers",borrowers);
        return "borrower/borrower";
    }
    @GetMapping("/toAddbwer")
    public String toAddbwerPage(Model model){
        return "borrower/addborrower";
    }
    @PostMapping("/bwer")
    public String addbwer(Borrower borrower){
        borrowerMapper.addBorrower(borrower);
        return "redirect:/borrowers";

    }
}
