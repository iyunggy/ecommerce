/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirul.bean;

import com.khoirul.facade.SalaryFacadeLocal;
import com.khoirul.model.Salary;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
/**
 *
 * @author MuhammadKhoirul
 */
@ManagedBean(name = "salaryBean")
@SessionScoped
public class SalaryBean implements Serializable {
    @EJB
    private SalaryFacadeLocal salaryDao;
    private List<Salary> salarys = new ArrayList<>();
    private Salary salary;
    
    public SalaryBean() {
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
    public List<Salary> getSalarys() {
        salarys = salaryDao.findAll();
        return salarys;
    }
    
    public void submitSalary(ActionEvent e) {
        try {
            if(this.getSalary().getIdSalary() == 0) { salaryDao.create(this.getSalary()); return;}
            salaryDao.edit(this.getSalary());
        }catch(Exception ex) {
            System.out.print(ex.toString());
        }
    }
    
    public void edit(Salary s){
      this.salary = s;
    }
    
    public void add(ActionEvent e) {
        this.salary= new Salary();
    }
    
    
}
