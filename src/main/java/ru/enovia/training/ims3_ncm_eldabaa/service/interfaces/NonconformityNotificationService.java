package ru.enovia.training.ims3_ncm_eldabaa.service.interfaces;

import ru.enovia.training.ims3_ncm_eldabaa.web.api.v1.dto.viewmodel.NonconformityNotificationViewModelDTO;

public interface NonconformityNotificationService {

    NonconformityNotificationViewModelDTO get(String id);

}
