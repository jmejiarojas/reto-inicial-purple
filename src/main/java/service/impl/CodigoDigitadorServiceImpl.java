package service.impl;

import dto.api.DniRequest;
import service.CodigoDigitadorService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodigoDigitadorServiceImpl implements CodigoDigitadorService {

    @Override
    public String generateCodigo(DniRequest request) {

        List<Integer> multiplos = Arrays.asList(3, 2, 7, 6, 5, 4, 3, 2);
        Integer suma = Arrays.stream(request.getNumero().split(""))
                .flatMap(s -> multiplos.stream().map(
                        integer -> Integer.parseInt(s) * integer
                )).reduce(0, Integer::sum);
        int residuo = suma % 11;
        return null;
    }
}
