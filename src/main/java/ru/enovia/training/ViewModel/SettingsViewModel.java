package ru.enovia.training.ViewModel;

public record SettingsViewModel(LocaleSettingsViewModel locales) {

    public record LocaleSettingsViewModel(String defaultLocale, String availableLocales) {
    }

}
