package eu.cz.yarovii.arrattainvest.businessLogic;

import eu.cz.yarovii.arrattainvest.model.Detail;
import eu.cz.yarovii.arrattainvest.model.SpecificDetails;
import org.springframework.stereotype.Service;

@Service
public class DetailValidation {

    private static DetailValidation single_instance = null;

    public static DetailValidation getInstance() {
        if (single_instance == null)
            single_instance = new DetailValidation();

        return single_instance;
    }

    private DetailValidation() {
    }

    public boolean validateAll(Detail detail){
        if(validateSmoothRound(detail))
            return true;
        else {
            detail.setType(SpecificDetails.INVALID);
            return false;
        }

    }

    public boolean validateSmoothRound(Detail detail){
        if(SpecificDetails.SMOOTHROUND.validate(detail)) {
            detail.setType(SpecificDetails.SMOOTHROUND);
            detail.setSheetName("smooth_round");
            return true;
        }
        return false;
    }

}
