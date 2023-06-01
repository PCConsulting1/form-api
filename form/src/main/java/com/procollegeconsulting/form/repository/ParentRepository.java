package com.procollegeconsulting.form.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.procollegeconsulting.form.model.Parent;

@Repository
public class ParentRepository {
  private final List<Parent> parentList = new ArrayList<Parent>();

  public ParentRepository(){}

  // get all the parents of a student using student id
  public List<Parent> findAll(Integer id){
    return parentList;
  }

  public void create(Parent parent){
    
  }

  public void update(Parent parent){

  }
}
