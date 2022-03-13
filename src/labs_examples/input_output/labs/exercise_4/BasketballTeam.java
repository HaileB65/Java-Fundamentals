package labs_examples.input_output.labs.exercise_4;

class BasketballTeam {
    private double height;
    private double weight;
    private String eyeColor;

    BasketballTeam() {
    }

    public BasketballTeam(double height, double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "BasketballTeam{" +
                "height=" + height +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
