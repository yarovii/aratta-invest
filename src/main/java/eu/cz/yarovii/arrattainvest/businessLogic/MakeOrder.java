package eu.cz.yarovii.arrattainvest.businessLogic;

import eu.cz.yarovii.arrattainvest.model.Detail;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MakeOrder {

    private DetailValidation detailValidation;
    private FindInformation findInformation;

    public boolean makeDetail(Detail detail) throws IOException {

        if(!detailValidation.validateAll(detail))
            return false;
        System.err.println(" l     here     ..............");

        return findInformation.putAllInfo(detail);
    }


    public MakeOrder() {
        detailValidation = DetailValidation.getInstance();
        findInformation = FindInformation.getInstance();
    }

}
