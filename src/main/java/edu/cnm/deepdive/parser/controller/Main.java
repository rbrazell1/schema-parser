package edu.cnm.deepdive.parser.controller;


import edu.cnm.deepdive.parser.service.SchemaRepository;
import java.io.IOException;

public class Main {

  private static final String STATEMENT_DELIMITER = ";\n";

  public static void main(String[] args) throws IOException {

    SchemaRepository repository = new SchemaRepository(System.in);
    repository
        .getSchema()
        .ddlStream()
        .map((statement) -> statement.concat(STATEMENT_DELIMITER))
        .forEach(System.out::println);
  }
}
