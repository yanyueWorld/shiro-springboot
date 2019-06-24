package com.example.dao;

import com.example.pojo.User;

public interface UserDao {

    /**
     * 新增用户信息.
     *
     * @param user 用户对象
     * @return int 操作行数
     */
    int insertSelective(User user);

    /**
     * 更新用户数据.
     *
     * @param user 用户对象
     * @return int 操作行数
     * @throws
     */
    int updateByPrimaryKeySelective(User user);

    /**
     * 根据用户名查询用户对象.
     *
     * @param username 用户名
     * @return User 用户对象
     */
    User getUserByUsername(String username);
}