package com.example.model;

import java.util.List;

/**
 * @author liuqi
 * @Title: UserBean
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/415:08
 */
public class UserBean {

    private Integer id;

    private String name;

    private String Password;

    private List<RoleBean> role;

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Password='" + Password + '\'' +
                ", role=" + role +
                '}';
    }

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

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public List<RoleBean> getRole() {
        return this.role;
    }

    public void setRole(List<RoleBean> role) {
        this.role = role;
    }
}
