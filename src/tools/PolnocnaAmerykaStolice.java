package tools;

public enum PolnocnaAmerykaStolice {
    MEXICO("Mexico City"),
    USA("Washington"),
    CANADA("Ottawa");


    private String stolica;

    PolnocnaAmerykaStolice(String stolica){
        this.stolica = stolica;
    }

    public String getStolica() {
        return stolica;
    }
}

