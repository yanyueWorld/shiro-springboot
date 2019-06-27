package com.example.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Permission 权限实体对象.
 *
 * @author yanyue, 2019/6/24
 * @version shiro v1.0
 */
@Data
public class Permission implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * Table:     permission
     * Column:    id
     * Nullable:  false
     */
    private Integer id;
    /**
     * 权限id
     * <p>
     * Table:     permission
     * Column:    permission_id
     * Nullable:  false
     */
    private String permissionId;
    /**
     * 权限名称
     * <p>
     * Table:     permission
     * Column:    name
     * Nullable:  false
     */
    private String name;
    /**
     * 权限描述
     * <p>
     * Table:     permission
     * Column:    description
     * Nullable:  true
     */
    private String description;
    /**
     * 权限访问路径
     * <p>
     * Table:     permission
     * Column:    url
     * Nullable:  true
     */
    private String url;
    /**
     * 权限标识
     * <p>
     * Table:     permission
     * Column:    perms
     * Nullable:  true
     */
    private String perms;
    /**
     * 父级权限id
     * <p>
     * Table:     permission
     * Column:    parent_id
     * Nullable:  true
     */
    private Integer parentId;
    /**
     * 类型   0：目录   1：菜单   2：按钮
     * <p>
     * Table:     permission
     * Column:    type
     * Nullable:  true
     */
    private Integer type;
    /**
     * 排序
     * <p>
     * Table:     permission
     * Column:    order_num
     * Nullable:  true
     */
    private Integer orderNum;
    /**
     * 图标
     * <p>
     * Table:     permission
     * Column:    icon
     * Nullable:  true
     */
    private String icon;
    /**
     * 状态：1有效；2删除
     * <p>
     * Table:     permission
     * Column:    status
     * Nullable:  false
     */
    private Integer status;
    /**
     * Table:     permission
     * Column:    create_time
     * Nullable:  true
     */
    private Date createTime;
    /**
     * Table:     permission
     * Column:    update_time
     * Nullable:  true
     */
    private Date updateTime;
}