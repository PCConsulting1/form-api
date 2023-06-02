package com.procollegeconsulting.form.model;

public record Guardian (
  String firstName,
  String lastName,
  String guardianRelationship,
  Boolean isDeceased,
  Boolean infoProvided
){}
