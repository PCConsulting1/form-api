package com.procollegeconsulting.form.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.procollegeconsulting.form.model.Student;

@Repository
public class StudentRepository {
  /*family object will have student, parent, household info 
    any field could be empty if user saved incomplete form*/
  private final List<Student> studentList = new ArrayList<Student>();

  public StudentRepository() {}

  //returns all of the form submissions for that account id
  public List<Student> findAll(Integer accountId) {
    return studentList;
  }

  //store form progress 
  public void create(Student student) {

  }

  //update an incomplete form or reset form to blank
  public void update(Student student){

  }

}
