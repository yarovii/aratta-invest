package eu.cz.yarovii.arrattainvest.model;

public class SimpleRoundDetail {

    private float D;
    private float smD;
    private float L;
    private int forgingSize;
    private String allowance;
    private Detail detailName;

    public SimpleRoundDetail() {
    }

    public SimpleRoundDetail(float d, float smD, float l) {
        D = d;
        this.smD = smD;
        L = l;
    }

    public Detail getDetailName() {
        return detailName;
    }

    public void setDetailName(Detail detailName) {
        this.detailName = detailName;
    }

    public float getD() {
        return D;
    }

    public void setD(float d) {
        D = d;
    }

    public float getSmD() {
        return smD;
    }

    public void setSmD(float smD) {
        this.smD = smD;
    }

    public float getL() {
        return L;
    }

    public void setL(float l) {
        L = l;
    }

    public int getForgingSize() {
        return forgingSize;
    }

    public void setForgingSize(int forgingSize) {
        this.forgingSize = forgingSize;
    }

    public String getAllowance() {
        return allowance;
    }

    public void setAllowance(String allowance) {
        this.allowance = allowance;
    }

}
