package com.procollegeconsulting.form.model;

public record College (
  String name,
  String incomingGrade,
  String housingStatus,
  Boolean hasAppliedBefore,
  Boolean isTransfer
){}
