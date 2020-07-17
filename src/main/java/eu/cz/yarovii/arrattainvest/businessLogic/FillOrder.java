package eu.cz.yarovii.arrattainvest.businessLogic;

import eu.cz.yarovii.arrattainvest.model.SimpleRoundDetail;
import org.springframework.stereotype.Service;

@Service
public class FillOrder {


    private SimpleRoundDetail roundDetail;

    private Validation validation;


    public FillOrder() {
    }

    public SimpleRoundDetail getForgingSizes(float sizeD, float sizeSmD, float sizeL){
        roundDetail = new SimpleRoundDetail(sizeD, sizeSmD, sizeL);

        if(validation.validateRound(roundDetail))
            return roundDetail;


        return roundDetail;
    }
}
