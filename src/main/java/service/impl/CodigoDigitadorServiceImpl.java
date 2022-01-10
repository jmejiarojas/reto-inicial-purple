package service.impl;

import dto.api.DniRequest;
import service.CodigoDigitadorService;
import util.Constants;

import java.util.Arrays;

public class CodigoDigitadorServiceImpl implements CodigoDigitadorService {

    @Override
    public String generateCodigo(DniRequest request) {
        Integer suma = getReduce(request);
        int residuo = suma % Constants.DEFAULT_RESIDUO;
        int resta = Constants.DEFAULT_VALUE - residuo;
        return Constants.DEFAULT_SERIE_NUMERICA.get(resta).toString();
    }

    private Integer getReduce(DniRequest request) {
        return Arrays.stream(request.getNumero().split(""))
                .flatMap(s -> Constants.MULTIPLOS.stream().map(
                        integer -> Integer.parseInt(s) * integer
                )).reduce(0, Integer::sum);
    }
}
