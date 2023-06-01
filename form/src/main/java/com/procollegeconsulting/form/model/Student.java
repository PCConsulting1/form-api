package com.procollegeconsulting.form.model;

import java.util.ArrayList;

public record Student(
  Integer id,
  String firstName,
  String middleName,
  String lastName,
  String phoneNumber,
  String email,
  String birthDate,
  String citizenship,
  String socialSecurity,
  String cbFinAidId,
  String streetAddress,
  String streetAddress2,
  String city,
  String state,
  String zip,
  String currentAcademicYear,
  String maritalStatus,
  Boolean hasLegalDependants,
  Boolean isVeteran,
  Boolean wasEmancipatedMinor,
  Boolean wasHomeless,
  Boolean wasWardOfTheCourt,
  Boolean wasFosterCare,
  ArrayList<Guardian> guardians,
  String guardianMaritalStatus,
  String singleParentReason,
  ArrayList<College> applyingTo,
  Boolean taxFiled,
  String returnType,
  String filingStatus,
  String adjustedGrossIncome,
  String federalTaxesPaid,
  String taxableInterest,
  String ordinaryDividends,
  String deductions,
  Boolean schedule3Filed,
  String educationCredits,
  String income,
  String taxableEarnings,
  String untaxedSocialSecurity,
  String otherUntaxedIncome,
  String parentHelp,
  String scholarshipHelp,
  String employerHelp,
  String relativesHelp,
  String investmentsValue,
  String trustValue,
  String cashValue,
  String retirementValue,
  String summerEarning,
  String summerTaxed,
  String summerOtherUntaxed,
  String academicYearEarning,
  String academicYearTaxed,
  String academicYearUntaxed
){}
