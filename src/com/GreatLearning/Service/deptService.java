package com.GreatLearning.Service;

import com.GreatLearning.Model.*;

public class deptService {
    adminDepartment admin = new adminDepartment();
    hrDepartment hr = new hrDepartment();
    techDepartment tech = new techDepartment();

    public void showAdminDeptDetails(adminDepartment admin) {
        System.out.println( "Welcome to "+admin.departmentName() );
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayAHoliday());
    }
    public void showHrDeptDetails(hrDepartment hr) {
        System.out.println( "Welcome to "+hr.departmentName() );
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayAHoliday());
    }
    public void showTechDeptDetails(techDepartment tech) {
        System.out.println( "Welcome to "+tech.departmentName() );
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayAHoliday());
    }
}
