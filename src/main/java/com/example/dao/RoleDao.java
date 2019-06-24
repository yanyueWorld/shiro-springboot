package com.example.dao;

import com.example.pojo.Role;

import java.util.List;

public interface RoleDao {

    /**
     * 新增角色信息.
     *
     * @param role 角色对象
     * @return int 操作行数
     * @throws
     */
    int insertSelective(Role role);

    /**
     * 更新角色信息.
     *
     * @param role 角色对象
     * @return int 操作行数
     */
    int updateByPrimaryKeySelective(Role role);

    /**
     * 根据用户id查询角色信息.
     *
     * @param userId 用户id
     * @return List<Role> 角色链表
     */
    List<Role> getRoleByUsername(Integer userId);
}