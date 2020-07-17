package eu.cz.yarovii.arrattainvest.model;

public enum SpecificDetails implements DetailInterface{
    INVALID{
        @Override
        public boolean validate(Detail detail) {
            return false;
        }

    },

    SMOOTHROUND{
        @Override
        public boolean validate(Detail detail) {
            return detail.getL() < (1.2 * detail.getDorH()) || detail.getL() > (30*detail.getDorH());
        }

        @Override
        public float calculateWeight(Detail detail) {
            return 31;
        }

    };

    /*@Override
    public boolean validate() {
        return false;
    }*/

    @Override
    public float calculateWeight(Detail detail) {
        return 0;
    }
}
