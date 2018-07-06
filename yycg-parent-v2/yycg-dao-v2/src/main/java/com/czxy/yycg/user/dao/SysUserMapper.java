package com.czxy.yycg.user.dao;

import com.czxy.yycg.domain.po.SysUser;
import com.czxy.yycg.user.query.SysUserQuery;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface SysUserMapper extends Mapper<SysUser> {

    @Select("select * from sys_user where id = #{id}")
    public SysUser findById(SysUserQuery sysUserQuery);
}
