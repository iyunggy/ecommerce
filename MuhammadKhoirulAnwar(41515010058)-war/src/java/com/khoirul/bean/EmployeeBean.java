/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirul.bean;

import com.khoirul.facade.EmployeeFacadeLocal;
import com.khoirul.model.Employee;
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
@ManagedBean(name = "employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {
    @EJB
    private EmployeeFacadeLocal employeeDao;
    private List<Employee> employees = new ArrayList<>();
    private Employee employee;
    
    public EmployeeBean() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public List<Employee> getEmployees() {
        employees = employeeDao.findAll();
        return employees;
    }
    
    public void submitEmployee(ActionEvent e) {
        try {
            if(this.getEmployee().getIdEmployee() == 0) { employeeDao.create(this.getEmployee()); return;}
            employeeDao.edit(this.getEmployee());
        }catch(Exception ex) {
            System.out.print(ex.toString());
        }
    }
    
    public void edit(Employee em){
      this.employee = em;
    }
    
    public void add(ActionEvent e) {
        this.employee = new Employee();
    }
    
    
}
