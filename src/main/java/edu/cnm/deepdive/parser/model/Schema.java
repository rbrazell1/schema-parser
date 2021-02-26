package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;
import java.util.List;

public class Schema {

  @Expose
  private int formatVersion;

  @Expose
  private Database database;

  public int getFormatVersion() {
    return formatVersion;
  }

  public void setFormatVersion(int formatVersion) {
    this.formatVersion = formatVersion;
  }

  public Database getDatabase() {
    return database;
  }

  public void setDatabase(Database database) {
    this.database = database;
  }

  public List<String> getDdlStatements() {
    return null;  // TODO Implement as appropriate
  }

}
