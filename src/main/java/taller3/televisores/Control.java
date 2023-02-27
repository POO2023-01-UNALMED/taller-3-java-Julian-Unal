package taller3.televisores;

public class Control {
    TV tv;

    public boolean enlazar(TV tv) {
        this.tv = tv;
        this.tv.setControl(this);
        return true;
    }
    public boolean volumenUp() {

        return this.tv.volumenUp();
    }

    public boolean volumenDown() {

        return this.tv.volumenDown();
    }

    public boolean canalUp() {

        return this.tv.canalUp();
    }

    public boolean canalDown() {

        return this.tv.canalDown();
    }

    public boolean turnOn() {
        return this.tv.turnOn();
    }
    public boolean turnOff() {
        return this.tv.turnOff();
    }

    public boolean setCanal(int canal) {
        this.tv.setCanal(canal);
        return true;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}
