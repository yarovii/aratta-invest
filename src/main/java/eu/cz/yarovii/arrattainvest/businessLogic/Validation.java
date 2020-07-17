package eu.cz.yarovii.arrattainvest.businessLogic;

import eu.cz.yarovii.arrattainvest.model.Detail;
import eu.cz.yarovii.arrattainvest.model.SimpleRoundDetail;
import org.springframework.stereotype.Service;


public class Validation {

    public boolean smoothRoundValidation(SimpleRoundDetail detail){
        return detail.getL() < (1.2 * detail.getD()) || detail.getL() > (30*detail.getD());
    }

    public boolean validateRound(SimpleRoundDetail roundDetail) {
        if(smoothRoundValidation(roundDetail)) roundDetail.setDetailName(Detail.SMOOTHROUND);
        else {
            roundDetail.setDetailName(Detail.INVALID);
            return false;
        }

        return true;
    }


}
