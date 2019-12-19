package com.example.model;

/**
 * @author liuqi
 * @Title: PermissionBean
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/415:14
 */
public class PermissionBean {

    private Integer id;

    private String name;

    private String url;

    private RoleBean roleBean;

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

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RoleBean getRoleBean() {
        return this.roleBean;
    }

    public void setRoleBean(RoleBean roleBean) {
        this.roleBean = roleBean;
    }
}
