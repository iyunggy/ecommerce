/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoirul.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MuhammadKhoirul
 */
@Entity
@Table(name = "salary")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salary.findAll", query = "SELECT s FROM Salary s")
    , @NamedQuery(name = "Salary.findByIdSalary", query = "SELECT s FROM Salary s WHERE s.idSalary = :idSalary")
    , @NamedQuery(name = "Salary.findByEmployeeld", query = "SELECT s FROM Salary s WHERE s.employeeld = :employeeld")
    , @NamedQuery(name = "Salary.findByGajiPokok", query = "SELECT s FROM Salary s WHERE s.gajiPokok = :gajiPokok")
    , @NamedQuery(name = "Salary.findByTransport", query = "SELECT s FROM Salary s WHERE s.transport = :transport")})
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_salary")
    private Long idSalary = 0L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "employeeld")
    private long employeeld;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gaji_pokok")
    private double gajiPokok;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transport")
    private double transport;

    public Salary() {
    }

    public Salary(Long idSalary) {
        this.idSalary = idSalary;
    }

    public Salary(Long idSalary, long employeeld, double gajiPokok, double transport) {
        this.idSalary = idSalary;
        this.employeeld = employeeld;
        this.gajiPokok = gajiPokok;
        this.transport = transport;
    }

    public Long getIdSalary() {
        return idSalary;
    }

    public void setIdSalary(Long idSalary) {
        this.idSalary = idSalary;
    }

    public long getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(long employeeld) {
        this.employeeld = employeeld;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTransport() {
        return transport;
    }

    public void setTransport(double transport) {
        this.transport = transport;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSalary != null ? idSalary.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salary)) {
            return false;
        }
        Salary other = (Salary) object;
        if ((this.idSalary == null && other.idSalary != null) || (this.idSalary != null && !this.idSalary.equals(other.idSalary))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.khoirul.model.Salary[ idSalary=" + idSalary + " ]";
    }
    
}
