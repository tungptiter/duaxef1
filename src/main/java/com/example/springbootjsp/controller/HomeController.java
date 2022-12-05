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
    int idCd = 1;
    int idDd = 1;

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
        cd.setDiadiem(cd.getDiadiem());
        idCd = 2;
        System.out.println(idCd);
        System.out.println(cd.getDiadiem());
        return "gdChonDoiDua";
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

    @RequestMapping("taydua")
    public String tayDua(Model model) {
//        model.getAttribute("doidua");
//        System.out.println(model.getAttribute("doidua"));
//
//        DoiDuaDAO584 daodd = new DoiDuaDAO584();
//
//        DoiDua584 doiDua584 =  daodd.getIdDoiDuaTheoTen("vinfastf88");
//
//        TayDuaDAO584 dao = new TayDuaDAO584();
//        ArrayList<TayDua584> listTayDua= dao.getDSTayDuaTheoDoiDua(doiDua584.getId());
//        model.addAttribute("taydua", listTayDua);

        return "gdChonTayDua";
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
//    public String doLuu(Model model) {
        System.out.println("test");

//        System.out.println(td.getId());
        System.out.println(td.getTen());
//        System.out.println(cd.getId());
//        System.out.println(cd.getDiadiem());
        System.out.println("end tesst");
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
