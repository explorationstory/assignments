package hoofdstuk04;


public enum Seasons {
        WINTER("cold"),
        SUMMER("hot"),
        SPRING("hot"),
        FALL("cold"),
        DRY("Unknown"),
        Wet("Unknown");

        public final String hotOrCold;

        private Seasons(String hotOrCold) {
            this.hotOrCold = hotOrCold;
        }
}
