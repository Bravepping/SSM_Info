package com.controller;

import com.pojo.Infos;
import com.service.InfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//信息登记

public class InfosController {

    @Autowired
    private InfosService infosService;

    //登记信息
    @RequestMapping("/infos/insert")
    public ModelAndView insert(Infos infos) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("../../index");
        if (infos.getCard() == null || infos.getName() == null || infos.getAge() == null || infos.getTress() == null) {
            modelAndView.addObject("msg", "登记信息不能为空！！！");
            return modelAndView;
        } else {
            try {
                infosService.insert(infos);
                modelAndView.addObject("msg", infos.getCard()+":"+infos.getName() + "登记成功");
                return modelAndView;
            } catch (Exception e) {
                modelAndView.addObject("msg", infos.getCard()+"："+infos.getName() + "已登记，请勿重复操作！");
            }
        }
        return modelAndView;
    }


    //查询所有信息
    @RequestMapping("/admin/findall")
    public ModelAndView findall(){
        ModelAndView modelAndView=new ModelAndView();
        List <Infos> list = infosService.findall();
        modelAndView.addObject("msg","查询信息如下");
        modelAndView.addObject("infos",list);
        modelAndView.setViewName("admin/infos");
        return modelAndView;
    }

    //根据编号查询信息
    @RequestMapping("/admin/findbyid")
    public String findbyid(Integer card,Model model){
        Infos infos=infosService.findbyid(card);
        if (infos!=null){
            System.out.println("********************1");
            model.addAttribute("msg","查询信息如下");
            model.addAttribute("infos",infos);
            return "admin/infosbyid";
        }
        else
            System.out.println("********************2");
            model.addAttribute("msg","未查询到信息");
            return "admin/infosbyid";
    }

    //根据编号修改信息
    @RequestMapping("/admin/updatebyid")
    public String updatebyid(Infos infos,Model model){
        if (infosService.updatebyid(infos)){
//            infosService.updatebyid(infos);
            model.addAttribute("msg","修改后信息如下");
            model.addAttribute("infos",infos);
            return "admin/updateinfos";
        }
        else
            model.addAttribute("msg","修改失败编号"+infos.getCard()+"不存在");
            return "admin/updateinfos";
    }

    //根据编号删除信息
    @RequestMapping("/admin/deletebyid")
    public String deletebyid(Infos infos,Model model){
        if (infosService.deletebyid(infos)){
            model.addAttribute("msg","删除成功");
            model.addAttribute("infos",infos);
            return "admin/deletebyid";
        }
        else
            model.addAttribute("msg","删除失败");
            return "admin/deletebyid";
    }
}
