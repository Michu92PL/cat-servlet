package cats_servlet;

public class Cat {
    private String name;
    private String race;
    private String color;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Cat() {
    }

    public Cat(String name, String race, String color) {
        this.name = name;
        this.race = race;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

