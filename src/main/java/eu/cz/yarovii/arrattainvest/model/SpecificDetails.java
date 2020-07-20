package eu.cz.yarovii.arrattainvest.model;

public enum SpecificDetails implements DetailInterface{
    INVALID{
        @Override
        public boolean validate(Detail detail) {
            return false;
        }

        @Override
        public String getNameEng() {
            return "Not found";
        }

        @Override
        public String getNameRus() {
            return "Не найдено";
        }
    },

    SMOOTHROUND{
        @Override
        public boolean validate(Detail detail) {
            return detail.getL() >= (1.2 * detail.getDorH()) && detail.getL() <= (30*detail.getDorH());
        }


        @Override
        public float calculateWeight(Detail detail) {
            return 31;
        }

        @Override
        public String getNameEng() {
            return "Smooth forgings of round cross-section";
        }

        @Override
        public String getNameRus() {
            return "Гладкое круглое сечение";
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
