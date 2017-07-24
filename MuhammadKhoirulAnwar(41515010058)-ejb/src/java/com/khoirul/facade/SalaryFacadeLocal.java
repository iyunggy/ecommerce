/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirul.facade;

import com.khoirul.model.Salary;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MuhammadKhoirul
 */
@Local
public interface SalaryFacadeLocal {

    void create(Salary salary);

    void edit(Salary salary);

    void remove(Salary salary);

    Salary find(Object id);

    List<Salary> findAll();

    List<Salary> findRange(int[] range);

    int count();
    
}
