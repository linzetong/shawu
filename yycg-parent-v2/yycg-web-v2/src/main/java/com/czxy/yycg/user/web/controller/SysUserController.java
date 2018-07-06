package com.czxy.yycg.user.web.controller;

import com.czxy.yycg.domain.po.SysUser;
import com.czxy.yycg.user.service.SysUserService;
import com.czxy.yycg.user.web.vo.SysUserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class SysUserController  {

    @Resource
    private SysUserService sysUserService;


    @RequestMapping("/findById")
    public String findById(SysUserVo sysUserVo, Model model){
        SysUser sysUser = sysUserService.findById(sysUserVo.getSysUserQueryCustom());
        model.addAttribute("sysUser",sysUser);
        return "/user/findSysUserById";
    }
}
