package com.example.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author liuqi
 * @Title: RoleBean
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/415:09
 */
public class RoleBean implements Serializable {

    private Integer id;

    private String name;

    private List<PermissionBean> permissionBeans;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionBean> getPermissionBeans() {
        return this.permissionBeans;
    }

    public void setPermissionBeans(List<PermissionBean> permissionBeans) {
        this.permissionBeans = permissionBeans;
    }
}
