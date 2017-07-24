/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirul.bean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
/**
 *
 * @author MuhammadKhoirul
 */
@ManagedBean(name = "navigationBean")
@RequestScoped
public class NavigationBean {
    public NavigationBean() {
    }
    
    public String goToEmployeeInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/employee/form.xhtml?faces-redirect=true";
    }
    
    public String goToEmployeeListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/employee/index.xhtml?faces-redirect=true";
    }
    
    public String goToSalaryInfoForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        return path + "/salary/form.xhtml?faces-redirect=true";
    }
    
    public String goToSalaryListForm() {
        FacesContext ctx = FacesContext.getCurrentInstance();
        String path = ctx.getExternalContext().getRequestContextPath();
        System.out.print(path);
        return path + "/salary/index.xhtml?faces-redirect=true";
    }
}
