package eu.cz.yarovii.arrattainvest.model;

import org.springframework.stereotype.Repository;

@Repository
public class Detail {
    private String name;
    private String sheetName;
    private SpecificDetails type;
    private float DorH;
    private float dOrB;
    private float L;
    private String allowance;
    private float weight;
    private String steel;
    private int quantity;

    public Detail() {
    }

    public Detail(float dorH, float dOrB, float l) {
        DorH = dorH;
        this.dOrB = dOrB;
        L = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public SpecificDetails getType() {
        return type;
    }

    public void setType(SpecificDetails type) {
        this.type = type;
    }

    public float getDorH() {
        return DorH;
    }

    public void setDorH(float dorH) {
        DorH = dorH;
    }

    public float getdOrB() {
        return dOrB;
    }

    public void setdOrB(float dOrB) {
        this.dOrB = dOrB;
    }

    public float getL() {
        return L;
    }

    public void setL(float l) {
        L = l;
    }

    public String getAllowance() {
        return allowance;
    }

    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getSteel() {
        return steel;
    }

    public void setSteel(String steel) {
        this.steel = steel;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
