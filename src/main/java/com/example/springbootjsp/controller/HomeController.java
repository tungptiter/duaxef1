package com.example.springbootjsp.controller;

import com.example.springbootjsp.dao.ChangDuaDAO584;
import com.example.springbootjsp.dao.DoiDuaDAO584;
import com.example.springbootjsp.dao.TayDuaChang584DAO;
import com.example.springbootjsp.dao.TayDuaDAO584;
import com.example.springbootjsp.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String index() {
        return "index";
    }

    @RequestMapping("btc")
    public String btc() {
        return "gdChinhBTC";
    }


    @RequestMapping("changdua")
    public String changDua() {
        return "gdChonChangDua";
    }

    @RequestMapping("doidua")
    public String doiDua(@ModelAttribute("changdua") ChangDua584 cd) {
        return "gdChonDoiDua";
    }

    @RequestMapping("taydua")
    public String tayDua(Model model) {
        return "gdChonTayDua";
    }

    @RequestMapping("doDangNhap")
    public String dangnhap() {
        return "gdChinhBTC";
    }

    @RequestMapping("dsthidau")
    public String dsthidau() {
        return "gdDsThiDau";
    }

    @RequestMapping("dangnhap")
    public String dangNhap(Model model) {
        Staff staff = new Staff();
        staff.setFullname("Thin");
        staff.setId("ABC");
        model.addAttribute("staff", staff);
        List<Staff> staffList = new ArrayList<>();
        staffList.add(staff);
        model.addAttribute("staffs", staffList);
        return "gdDangNhap";
    }

    @GetMapping("staff/index")
    public String index(Model model) {
        Staff staff = new Staff();
        staff.setFullname("Thin");
        staff.setId("ABC");
        model.addAttribute("staff", staff);
        List<Staff> staffList = new ArrayList<>();
        staffList.add(staff);
        model.addAttribute("staffs", staffList);
        return "form";
    }
    @GetMapping("staff/dkythidau")
    public String dky(Model model) {
        Staff staff = new Staff();
        staff.setFullname("Thin");
        staff.setId("ABC");
        model.addAttribute("staff", staff);

        List<Staff> staffList = new ArrayList<>();
        staffList.add(staff);

        model.addAttribute("staffs", staffList);

        return "form";
    }

    @RequestMapping("doLuu")
    public String doLuu(@ModelAttribute("taydua") TayDua584 td, @ModelAttribute("changdua") ChangDua584 cd) {
//        TayDuaChang584 tdc = new TayDuaChang584();
//
//        TayDuaChang584DAO dao = new TayDuaChang584DAO();

        return "doLuu";
    }

    @PostMapping("staff/save")
    public String save(@ModelAttribute("staff") Staff staff) {
        staff.setFullname(staff.getFullname().toUpperCase());
        return "form";
    }
}
