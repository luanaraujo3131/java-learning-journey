package Enumeration.Composition.Composition1.entities;

import Enumeration.Composition.Composition1.entities_enum.WorkerLevel;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    //Associations
    //1 worker can work in 1 departament
    private Departament departament;

    //1 worker can have multiple contracts.
    private List<HourContract> contracts = new LinkedList<>();

    //constructors
    public Worker() {}
    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public Departament getDepartament() {
        return departament;
    }
    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
    public List<HourContract> getContracts() {
        return contracts;
    }
    /**public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    } we can add and remove contract, but never create or modify another list*/
    public void addContract(HourContract contract){
        contracts.add(contract);//adding contract for list
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);//removing contract of list
    }
    public double income(int year, int month){
        /**To know how much an employee earned in a given month
         * we need to have the baseSalary and how much he makes with contracts
         * in a given month*/
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract hc : contracts){
            cal.setTime(hc.getDate());//date of contract as date os calendar
            /**sum += hc.totalValue(); if we do this, we'll receive
             * value of all contracts, but we want contracts of a given
             * month and year*/
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);//MONTH in calendar starts with 0.
            if (c_year == year && c_month == month){
                sum += hc.totalValue();
            }
        }
        return sum;
    }
}


