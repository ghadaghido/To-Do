package com.example.ToDo.repo;

import com.example.ToDo.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<ToDoItem ,Long > {


}
