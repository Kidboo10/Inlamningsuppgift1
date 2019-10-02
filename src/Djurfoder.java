public enum Djurfoder {
    //Enum med förbestämda portionsstorlekar och namnet på fodret
    KATT(150, "Djurfoder"),
    HUND(100, "Djurfoder"),
    ORM(20, "Ormpellet"),
    RÅTTA(200,"Djurfoder"); //skapat ytterligare en klass för att se implementeringstiden

    //Inkapslad instansvariabler för att inte kunna ändra portion och fodernamn
    private final int portion;
    private final String foderNamn;
    //Konstruktor för enum
    Djurfoder(int portion, String foderNamn) {
        this.portion = portion;
        this.foderNamn = foderNamn;
    }
    //Getters
    public int getPortion() {
        return portion;
    }

    public String getFoderNamn() {
        return foderNamn;
    }
}
