package edu.dens.api.data;

public enum Wind {
    N(348.75, 11.25),
    NNE(11.25, 33.75),
    NE(33.75, 56.25),
    ENE(56.25, 78.75),
    E(78.75, 101.25),
    ESE(101.25, 123.75),
    SE(123.75, 146.25),
    SSE(146.25, 168.75),
    S(168.75,  191.25),
    SSW(191.25, 213.75),
    SW(213.75, 236.25),
    WSW(236.25, 258.75),
    W(258.75, 281.25),
    WNW(281.25, 303.75),
    NW(303.75, 326.25),
    NNW(326.25, 348.75);

    private double min;
    private double max;

    Wind(double minDegree, double maxDegree) {
        min = minDegree;
        max = maxDegree;
    }

    public static Wind valueOf(double degree){
        for(Wind wind : Wind.values()){
            if(degree > wind.max && degree <= wind.min ) {
                return wind;
            }
        }
        throw new RuntimeException("Unable to convert wind degree to Wind enum value");
    }
}
