package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyAndEmployeeFacade {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    List<Company> findCompanyByName(final String nameFragment) throws ResultNotFoundException {
        List<Company> result = companyDao.contains("%" + nameFragment + "%");
        if (result.isEmpty())
            throw new ResultNotFoundException("No Company of given name!");
        return result;

    }

    List<Employee> findEmployeeByLastName(final String nameFragment) throws ResultNotFoundException {
        List<Employee> result = employeeDao.lastNameContains("%" + nameFragment + "%");
        if (result.isEmpty())
            throw new ResultNotFoundException("No Employee was found");
        return result;
    }
}
