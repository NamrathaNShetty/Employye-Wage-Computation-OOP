package com.company;

public interface IComputeWage {
    public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth);
    public void computeEmpWage();
}