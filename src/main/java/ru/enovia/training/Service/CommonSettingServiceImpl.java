package ru.enovia.training.Service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import ru.enovia.training.Entity.CommonSetting;
import ru.enovia.training.Repository.CommonSettingRepository;
import ru.enovia.training.Service.Common.CommonSettingConst;
import ru.enovia.training.Service.Interface.CommonSettingService;
import ru.enovia.training.ViewModel.SettingsViewModel;
import ru.enovia.training.ViewModel.SettingsViewModel.LocaleSettingsViewModel;

@Service
@RequiredArgsConstructor
public class CommonSettingServiceImpl implements CommonSettingService {

    private final CommonSettingRepository commonSettingRepository;

    @Override
    public SettingsViewModel getSettings() {
        LocaleSettingsViewModel locales = new LocaleSettingsViewModel(
            getSetting(CommonSettingConst.defaultLocale, true),
            getSetting(CommonSettingConst.availableLocales, true));
        return new SettingsViewModel(locales);
    }

    @Override
    public String getSetting(String option, boolean useDefaultSetting) {
        CommonSetting commonSetting = commonSettingRepository.findById(option).orElse(null);
        if (useDefaultSetting && commonSetting == null) {
            commonSetting = CommonSetting.fillDefaultValue(option);
        }

        return commonSetting == null ? "" : commonSetting.getValue();
    }

}
