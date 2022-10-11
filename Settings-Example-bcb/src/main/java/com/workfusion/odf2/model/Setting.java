package com.workfusion.odf2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "config")
public class Setting {
    @DatabaseField(columnName = "name")
    private String name;

    @DatabaseField(columnName = "value")
    private String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}