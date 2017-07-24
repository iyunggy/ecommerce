/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirul.facade;

import com.khoirul.model.Salary;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MuhammadKhoirul
 */
@Stateless
public class SalaryFacade extends AbstractFacade<Salary> implements SalaryFacadeLocal {

    @PersistenceContext(unitName = "MuhammadKhoirulAnwar_41515010058_-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalaryFacade() {
        super(Salary.class);
    }
    
}
