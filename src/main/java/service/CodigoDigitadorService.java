package service;

import dto.api.DniRequest;

public interface CodigoDigitadorService {
    String generateCodigo(DniRequest request);
}
