package ru.enovia.training.ims3_ncm_eldabaa.web.api.v1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.enovia.training.ims3_ncm_eldabaa.service.interfaces.NonconformityNotificationService;
import ru.enovia.training.ims3_ncm_eldabaa.web.api.v1.dto.viewmodel.NonconformityNotificationViewModelDTO;

@Tag(name = "NonconformityNotificationControllerV1 - контроллер ncn", description = "Операции связанные с объектом ncn")
@RestController
@RequestMapping("/api/v1/ncn")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class NonconformityNotificationControllerV1 {

    private final NonconformityNotificationService nonconformityNotificationService;

    @Operation(summary = "getNonconformityNotification", description = "Получить ncn по id")
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<NonconformityNotificationViewModelDTO> getNonconformityNotification(@PathVariable() String id) {
        return new ResponseEntity<>(nonconformityNotificationService.get(id), HttpStatus.OK);
    }

}
