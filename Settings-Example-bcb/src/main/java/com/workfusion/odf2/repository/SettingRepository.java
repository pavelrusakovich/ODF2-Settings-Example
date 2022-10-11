package com.workfusion.odf2.repository;

import com.j256.ormlite.support.ConnectionSource;
import com.workfusion.odf2.core.orm.OrmLiteRepository;
import com.workfusion.odf2.model.Setting;

import java.sql.SQLException;
import java.util.List;

public class SettingRepository extends OrmLiteRepository<Setting> {

    public SettingRepository(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, Setting.class);
    }

    @Override
    public List<Setting> findAll() {
        return super.findAll();
    }

}
