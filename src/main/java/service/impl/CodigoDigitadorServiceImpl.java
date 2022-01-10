package service.impl;

import dto.api.DniRequest;
import service.CodigoDigitadorService;

import java.util.Arrays;

public class CodigoDigitadorServiceImpl implements CodigoDigitadorService {

    @Override
    public String generateCodigo(DniRequest request) {

        Arrays.stream(request.getNumero().split(""))
        return null;
    }
}
