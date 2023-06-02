package com.procollegeconsulting.form.model;

import java.time.LocalDate;

public record Parent(
  Integer id,
  String firstName,
  String lastName,
  String socialSecurity,
  String email,
  LocalDate birthDate,
  String highestEducation,
  Integer income,
  Integer expectedIncome,
  String employmentStatus,
  Boolean isVeteran,
  Boolean isDislocatedWorker,
  String occupation,
  String companyName,
  String companyLocation,
  Integer yearsAtCompany,
  Boolean hasTaxDeferredRetirement,
  Boolean hasSocialSecurityRetirement,
  Boolean hasEmployerSponsoredRetirement,
  Boolean hasCivilServiceRetirement,
  Boolean hasMilitarySponsoredRetirement,
  Boolean hasOtherRetirement,
  Integer retirementValue
){}
