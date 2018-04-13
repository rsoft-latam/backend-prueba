package com.example.demo.repository;
import com.example.demo.model.Matter;
import org.springframework.data.repository.CrudRepository;

public interface MatterRepository extends CrudRepository<Matter, Long> {
}
