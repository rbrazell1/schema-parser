package edu.cnm.deepdive.parser;

import edu.cnm.deepdive.parser.service.SchemaRepository;
import java.io.IOException;
import java.io.InputStream;

public class Test {

  private static final String STATEMENT_DELIMITER = ";\n\n";


  public static void main(String[] args) throws IOException {

    try (InputStream input = Test.class.getClassLoader().getResourceAsStream("roulette.json")) {
      SchemaRepository repository = new SchemaRepository(input);
      repository
          .getSchema()
          .ddlStream()
          .map((statement) -> statement.concat(STATEMENT_DELIMITER))
          .forEach(System.out::print);
    }

  }

}
