package com.procollegeconsulting.form.model;

import java.time.LocalDate;

public record Dependant(
  String firstName,
  String lastName,
  LocalDate birthDate,
  String relationShip,
  String schoolLevelNext,
  String schoolLevelPrior,
  String schoolNamePrior,
  Integer totalCostPrior,
  Integer scholarshipsPrior,
  Integer paidByParentsPrior,
  String schoolNameCurrent,
  Integer totalCostCurrent,
  Integer paidByParentsCurrent,
  Boolean isFullTime,
  String typeOfCollege
){}
