package tools;

public enum EuropaStolice {
    POLSKA("Warszawa"),
    NIEMCY("Berlin"),
    FRANCJA("Paryż");


    private String stolica;

    EuropaStolice(String stolica){
        this.stolica = stolica;
    }

    public String getStolica() {
        return stolica;
    }
}
