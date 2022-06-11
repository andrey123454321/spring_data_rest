package com.zaurtregulov.spring.springboot.spring_data_rest.deo;

import com.zaurtregulov.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//прописываем в дженерик с какими ентити работает данный репозиторий. Во второй- какой тип у праймари кей
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
