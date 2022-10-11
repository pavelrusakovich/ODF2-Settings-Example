package com.workfusion.odf2.module;

import com.j256.ormlite.support.ConnectionSource;
import com.workfusion.odf2.core.cdi.OdfModule;
import com.workfusion.odf2.repository.SettingRepository;
import org.codejargon.feather.Provides;

import javax.inject.Singleton;
import java.sql.SQLException;

public class RepositoryModule implements OdfModule {

    @Provides
    @Singleton
    public SettingRepository settingsRepository(ConnectionSource connectionSource) throws SQLException{
        return new SettingRepository(connectionSource);
    }
}
