package homework8;

import java.util.Objects;


public class Computer {



    private String model;
    private  int memory;
    private int price;
    private int videoСard;

    public Computer(String model, int memory, int price, int videoСard) {
        this.model = model;
        this.memory = memory;
        this.price = price;
        this.videoСard = videoСard;
    }
public void getInfo () {
    System.out.println("Создан PC." +
            "        Имя = " + getModel() +
            "        Цена = " + price +
            "        Видеокарта = " + videoСard +
            "        ОЗУ = "+ memory);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return getMemory() == computer.getMemory() && getVideoСard() == computer.getVideoСard() && getModel().equals(computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getMemory(), getVideoСard());
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVideoСard() {
        return videoСard;
    }

    public void setVideoСard(int videoСard) {
        this.videoСard = videoСard;
    }



}
