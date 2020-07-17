package eu.cz.yarovii.arrattainvest.businessLogic;

import eu.cz.yarovii.arrattainvest.model.Detail;

import java.io.IOException;

public class FindInformation {

    private int row;
    private int column;

    private FindInformation() {
    }

    private static FindInformation single_instance = null;

    public static FindInformation getInstance() {
        if (single_instance == null)
            single_instance = new FindInformation();

        return single_instance;
    }

    public boolean putAllInfo(Detail detail) throws IOException {
        ReadFromXLSX rfxlsx = ReadFromXLSX.getInstance();

        row = rfxlsx.getRow(detail.getSheetName(), detail);
        column = rfxlsx.getColumn(detail.getSheetName(), detail);

        if(row == -1 || column == -1)
            return false;

        detail.setAllowance(rfxlsx.getAllowance(row, column, detail.getSheetName()));
        return true;
    }

    private String findAllowance(Detail detail){
        return "";
    }

    private float findWeight(Detail detail){
        return detail.getType().calculateWeight(detail);
    }

}
