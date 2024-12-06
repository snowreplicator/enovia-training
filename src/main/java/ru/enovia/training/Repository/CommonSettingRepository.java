package ru.enovia.training.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.enovia.training.Entity.CommonSetting;

public interface CommonSettingRepository extends JpaRepository<CommonSetting, String> {
}
