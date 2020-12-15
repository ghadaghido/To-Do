package com.example.ToDo.Controller;

import com.example.ToDo.repo.TodoRepo;
import com.example.ToDo.model.ToDoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value="/todo")
public class TodoController {
    @Autowired
    private TodoRepo todoRepo;
    @GetMapping
    public List<ToDoItem> findAll(){
        return todoRepo.findAll();
    }
    @PostMapping
    public ToDoItem save (@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return todoRepo.save(toDoItem);

    }
    @PutMapping
    public ToDoItem update (@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return todoRepo.save(toDoItem);
    }
    @DeleteMapping (value = "/{id}")
    public void delete (@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
