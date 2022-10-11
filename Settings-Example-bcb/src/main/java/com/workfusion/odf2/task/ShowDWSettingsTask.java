package com.workfusion.odf2.task;

import com.workfusion.odf2.compiler.BotTask;
import com.workfusion.odf2.core.cdi.Requires;
import com.workfusion.odf2.core.task.AdHocTask;
import com.workfusion.odf2.core.task.TaskInput;
import com.workfusion.odf2.core.task.output.MultipleResults;
import com.workfusion.odf2.core.task.output.SingleResult;
import com.workfusion.odf2.core.task.output.TaskRunnerOutput;
import com.workfusion.odf2.model.Setting;
import com.workfusion.odf2.module.RepositoryModule;
import com.workfusion.odf2.repository.SettingRepository;

import javax.inject.Inject;

@BotTask
@Requires(RepositoryModule.class)
public class ShowDWSettingsTask implements AdHocTask {

    private final SettingRepository settingsRepository;

    @Inject
    public ShowDWSettingsTask(SettingRepository settingsRepository){
        this.settingsRepository = settingsRepository;
    }

    @Override
    public TaskRunnerOutput run(TaskInput taskInput) {

        MultipleResults output = new MultipleResults();
        SingleResult outputRow = new SingleResult();
        for (Setting row:
             settingsRepository.findAll()) {
            outputRow.setColumn("setting-name", row.getName());
            outputRow.setColumn("settings-value",row.getValue());
            output = output.addRow(outputRow);
        }

        return output;
    }

}
