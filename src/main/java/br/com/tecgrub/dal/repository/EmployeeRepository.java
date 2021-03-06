package br.com.tecgrub.dal.repository;

import br.com.tecgrub.dal.model.Employee;
import br.com.tecgrub.dal.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

    Employee findByPerson(Person person);
}