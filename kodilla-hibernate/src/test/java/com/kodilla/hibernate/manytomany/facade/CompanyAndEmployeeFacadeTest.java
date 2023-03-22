package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CompanyAndEmployeeFacadeTest {

    @Autowired
    private CompanyAndEmployeeFacade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testFindEmployeesByLastName() throws ResultNotFoundException {

        //given
        Employee employee1 = new Employee("John", "Doa");
        Employee employee2 = new Employee("Mick", "Mack");
        Employee employee3 = new Employee("Lastt", "Brdoalski");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //when
        List<Employee> employees = facade.findEmployeeByLastName("doa");

        //then
        assertEquals(2,employees.size());

        //Cleanup
        employeeDao.deleteAll();
    }

    @Test
    void testFindCompaniesByName() throws ResultNotFoundException {

        //given
        Company company1 = new Company("Oreo");
        Company company2 = new Company("PrincePolo");
        Company company3 = new Company("Oreo Limited");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //when
        List<Company> companies = facade.findCompanyByName("reo");

        //then
        assertEquals(2, companies.size());

        //Cleanup
        companyDao.deleteAll();
    }
}