package com.procollegeconsulting.form.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.procollegeconsulting.form.model.Household;

@Repository
public class HouseholdRepository {
  private final List<Household> householdList = new ArrayList<Household>();

  public HouseholdRepository(){

  }

  //id comes from parent only one household is returned
  public Optional<Household> findById(Integer id){
    return householdList.stream().filter(item -> item.id().equals(id)).findFirst();
  }

  public void create(Household household){}

  public void update(Household household){}


}
