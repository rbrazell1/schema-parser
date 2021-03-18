package edu.cnm.deepdive.parser.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.stream.Stream;

public class Entity {

  private static final String PLACEHOLDER = "${TABLE_NAME}";

  @Expose
  private String tableName;

  @Expose
  @SerializedName("createSql")
  private String sqlStatement;

  @Expose
  private List<Field> field;

  @Expose
  private PrimaryKey primaryKey;

  @Expose
  private List<Index> indices;

  @Expose
  private List<ForeignKey> foreignKeys;

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public String getSqlStatement() {
    return sqlStatement;
  }

  public void setSqlStatement(String sqlStatement) {
    this.sqlStatement = sqlStatement;
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

  public List<Index> getIndices() {
    return indices;
  }

  public void setIndices(List<Index> indices) {
    this.indices = indices;
  }

  public List<ForeignKey> getForeignKeys() {
    return foreignKeys;
  }

  public void setForeignKeys(List<ForeignKey> foreignKeys) {
    this.foreignKeys = foreignKeys;
  }

  public Stream<String> ddlStream() {
    return Stream
        .concat(
            Stream.of(sqlStatement),
            indices
                .stream()
                .map(Index::getSqlStatement)
        )
        .map((statement) -> statement.replace(PLACEHOLDER, tableName));
  }

}
