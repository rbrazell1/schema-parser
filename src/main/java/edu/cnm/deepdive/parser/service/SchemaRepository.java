package edu.cnm.deepdive.parser.service;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.cnm.deepdive.parser.model.Schema;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SchemaRepository {

  private final Schema schema;

  public SchemaRepository(InputStream input) throws IOException {
    try (InputStreamReader reader = new InputStreamReader(input)) {
      Gson gson = new GsonBuilder()
          .excludeFieldsWithoutExposeAnnotation()
          .serializeNulls()
          .setPrettyPrinting()
          .create();
      schema = gson.fromJson(reader, Schema.class);

    }
  }

  public Schema getSchema() {
    return schema;
  }
}
