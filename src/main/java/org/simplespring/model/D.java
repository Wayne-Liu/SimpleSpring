package org.simplespring.model;

public class D {
    private String nameAttribute;
    private String valueAttribute;
    private A refAttribute;
    private double doubleAttribute;

    public D(String nameAttribute, String valueAttribute, A refAttribute) {
        this.nameAttribute = nameAttribute;
        this.valueAttribute = valueAttribute;
        this.refAttribute = refAttribute;
    }

    public D(String nameAttribute, String valueAttribute, double doubleAttribute) {
        this.nameAttribute = nameAttribute;
        this.valueAttribute = valueAttribute;
        this.doubleAttribute = doubleAttribute;
    }

    @Override
    public String toString() {
        return "D{" +
                "nameAttribute='" + nameAttribute + '\'' +
                ", valueAttribute='" + valueAttribute + '\'' +
                ", refAttribute=" + refAttribute +
                ", doubleAttribute=" + doubleAttribute +
                '}';
    }
}
