package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Entity {

  @Expose
  private String tableName;

  @Expose
  @SerializedName("createSql")
  private String sqlsStatements;

  @Expose
  private List<Field> field;

  @Expose
  private PrimaryKey primaryKey;

  @Expose
  private List<Indices> indices;

  @Expose
  private List<ForeignKey> foreignKeys;

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getSqlsStatements() {
    return sqlsStatements;
  }

  public void setSqlsStatements(String sqlsStatements) {
    this.sqlsStatements = sqlsStatements;
  }

  public List<Field> getField() {
    return field;
  }

  public void setField(List<Field> field) {
    this.field = field;
  }

  public PrimaryKey getPrimaryKey() {
    return primaryKey;
  }

  public void setPrimaryKey(PrimaryKey primaryKey) {
    this.primaryKey = primaryKey;
  }

  public List<Indices> getIndices() {
    return indices;
  }

  public void setIndices(List<Indices> indices) {
    this.indices = indices;
  }

  public List<ForeignKey> getForeignKeys() {
    return foreignKeys;
  }

  public void setForeignKeys(List<ForeignKey> foreignKeys) {
    this.foreignKeys = foreignKeys;
  }

  public List<String> getDdlStatements() {
    return null; //TODO Implement as appropriate
  }

}
