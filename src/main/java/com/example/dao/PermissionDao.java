package com.example.dao;

import com.example.pojo.Permission;

import java.util.List;

public interface PermissionDao {

    /**
     * 新增权限信息.
     * @param permission 权限信息
     * @return int 操作行数
     */
    int insertSelective(Permission permission);

    /**
     * 更新权限信息.
     * @param permission 权限信息
     * @return int 操作行数
     */
    int updateByPrimaryKeySelective(Permission permission);

    /**
     * 根据角色id查询权限信息.
     * @param roleId 角色id
     * @return List<Permission> 权限链表
     */
    List<Permission> getPermissionsByRoleId(Integer roleId);
}