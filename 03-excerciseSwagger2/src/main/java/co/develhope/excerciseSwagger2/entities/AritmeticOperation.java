package co.develhope.excerciseSwagger2.entities;

public class AritmeticOperation {
    private String name;
    private Integer minNumberOfOperands;
    private String description;
    String []proprieties;

    public AritmeticOperation(String name, Integer minNumberOfOperands, String description, String[] proprieties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.proprieties = proprieties;
    }

    public String getName() {
        return name;
    }

    public Integer getMinNumberOfOperands() {
        return minNumberOfOperands;
    }

    public String getDescription() {
        return description;
    }

    public String[] getProprieties() {
        return proprieties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinNumberOfOperands(Integer minNumberOfOperands) {
        this.minNumberOfOperands = minNumberOfOperands;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProprieties(String[] proprieties) {
        this.proprieties = proprieties;
    }
}
