package com.chz.controller;


import com.chz.mapper.BorrowerMapper;
import com.chz.mapper.EquipMapper;
import com.chz.pojo.Borrower;
import com.chz.pojo.Equip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author snicker
 * @date 2021/10/17 15:57
 * @Describe
 */
@Controller
public class EquipController {
    @Autowired
    EquipMapper equipMapper;
    @Autowired
    BorrowerMapper borrowerMapper;

    @RequestMapping("/emps")
    public String list(Model model){
        List<Equip> equips=equipMapper.queryEquipList();
        model.addAttribute("emps",equips);
        return "emp/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        equipMapper.deleteEquip(id);
        return "redirect:/emps";
    }
    @GetMapping("/emp")
    public String toAddPage(Model model){
        List<Borrower> borrowers=borrowerMapper.queryBorrowerList();
        model.addAttribute("borrowers",borrowers);
        return "emp/add";
    }
    @PostMapping("/emp")
    public String addEmp(Equip equip){
        equipMapper.addEquip(equip);
        return "redirect:/emps";
    }
    @GetMapping("/update/{id}")
    public String toUpdatePage(Model model,@PathVariable("id") int id){
        Equip equip=equipMapper.queryEquipById(id);
        model.addAttribute("equip",equip);
        List<Borrower> borrowers=borrowerMapper.queryBorrowerList();
        model.addAttribute("borrowers",borrowers);
        return "emp/update";
    }
    @PostMapping("/update")
    public String update(Equip equip){
        equipMapper.updateEquip(equip);
        return "redirect:emps";
    }
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "index";
    }


}

































