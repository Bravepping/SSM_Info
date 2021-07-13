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
@RequestMapping("/infos")
public class InfosController {

    @Autowired
    private InfosService infosService;

    @RequestMapping("/insert")
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
    @RequestMapping("findall")
    public String findall(Model model){
        List <Infos> list = infosService.findall();
        model.addAttribute("msg","查询信息如下");
        model.addAttribute("infos",list);
        return "admin/infos";
    }

    //根据编号查询信息
    @RequestMapping("/findbyid")
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
}
