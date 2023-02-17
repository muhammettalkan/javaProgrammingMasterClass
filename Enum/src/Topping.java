public enum Topping {
    MUSTARD,
    PICKLES,
    CHEDDAR,
    TOMATO,
    SALAMI;

    public double getPrice(){

        return switch (this){
            case SALAMI -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }
}
