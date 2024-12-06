package ru.enovia.training.ims3_ncm_eldabaa.web.api.v1.dto.viewmodel;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NonconformityNotificationViewModelDTO {

    private String id;
    private String state;
    private String code;
    private String creator;
    private String revision;
    private List<String> lettersIds;
    private List<String> momsIds;
}
