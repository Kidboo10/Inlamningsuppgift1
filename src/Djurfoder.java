public enum Djurfoder {
    KATT(150,"Djurfoder"),HUND(100,"Djurfoder"),ORM(20,"Ormpellet");
    private int portion;
    private String foderTyp;

    Djurfoder(int portion,String foderTyp){
        this.portion = portion;
        this.foderTyp = foderTyp;
    }
    public int getPortion() {
        return portion;
    }
    public String getFoderTyp() {
        return foderTyp;
    }
}
