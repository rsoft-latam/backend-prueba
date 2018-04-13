package com.example.demo.repository;

import com.example.demo.model.Notebook;
import org.springframework.data.repository.CrudRepository;

public interface NotebookRepository extends CrudRepository<Notebook, Long> {
}
