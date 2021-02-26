package edu.cnm.deepdive.parser.controller;


import edu.cnm.deepdive.parser.service.SchemaRepository;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {

    SchemaRepository repository = new SchemaRepository(System.in);
    System.out.println("Read Schema from Standard in");
  }



}
