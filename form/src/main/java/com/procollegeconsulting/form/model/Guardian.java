package com.procollegeconsulting.form.model;

public record Guardian (
  String firstName,
  String lastName,
  String relationship,
  Boolean isDeceased,
  Boolean infoProvided
){}
