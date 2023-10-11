package com.ishika.remo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ishika.remo.Entity.Employee;
public interface RepositoryEmployee extends JpaRepository<Employee,Integer>{

}

