package ru.enovia.training.ims3_ncm_eldabaa.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;
import ru.enovia.training.ims3_ncm_eldabaa.service.interfaces.NonconformityNotificationService;
import ru.enovia.training.ims3_ncm_eldabaa.web.api.v1.dto.viewmodel.NonconformityNotificationViewModelDTO;

@Service
@RequiredArgsConstructor
public class NonconformityNotificationServiceImpl implements NonconformityNotificationService {

    @Override
    public NonconformityNotificationViewModelDTO get(String id) {
        throw new NotImplementedException();
    }

}