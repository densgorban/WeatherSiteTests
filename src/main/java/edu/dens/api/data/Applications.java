package edu.dens.api.data;

public enum Applications {
    MOCK("b6907d289e10d714a6e88b30761fae22"),
    KEY_1("6f37737f30fdd7dfd9600ca4726ef24f"),
    KEY_2("eb7cb0704d39ff1b4d699c02f78d6bb5"),
    EMPTY("");
    private final String key;

    Applications(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
