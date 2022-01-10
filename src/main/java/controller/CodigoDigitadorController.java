package controller;

import dto.api.DniRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CodigoDigitadorService;

@AllArgsConstructor
@RestController
@RequestMapping("/codigo")
public class CodigoDigitadorController {

    private final CodigoDigitadorService service;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> registrar(@RequestBody DniRequest request) {
        String response = this.service.generateCodigo(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
