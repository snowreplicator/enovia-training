package ru.enovia.training.Service.Interface;

import ru.enovia.training.ViewModel.SettingsViewModel;

public interface CommonSettingService {

    SettingsViewModel getSettings();

    String getSetting(String option, boolean useDefaultSetting);

}
