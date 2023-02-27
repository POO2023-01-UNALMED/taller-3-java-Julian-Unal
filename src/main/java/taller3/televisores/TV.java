package taller3.televisores;

public class TV {
    public static int numTV = 1;
    Marca marca;
    int canal = 1;
    int precio = 500;
    boolean estado;
    int volumen = 1;
    Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;

        TV.numTV+=1;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public boolean volumenUp() {
        if (!this.isOn()) {
            return false;
        }
        if (isInValidLimitsVolume("UP")) {
            this.volumen += 1;
            return true;
        }
        return false;
    }

    public boolean volumenDown() {
        if (!this.isOn()) {
            return false;
        }
        if (isInValidLimitsVolume("DOWN")) {
            this.volumen -= 1;
            return true;
        }
        return false;
    }

    private boolean isInValidLimitsVolume(String upOrDown) {
        if (upOrDown == "UP") {
            if (this.volumen + 1 > 7) {
                return false;
            }
            return true;
        }
        if (upOrDown == "DOWN") {
            if (this.canal - 1 < 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean canalUp() {
        if (!this.isOn()) {
            return false;
        }
        if (isInValidLimitsChannels("UP")) {
            this.canal += 1;
            return true;
        }
        return false;
    }

    public boolean canalDown() {
        if (!this.isOn()) {
            return false;
        }
        if (isInValidLimitsChannels("DOWN")) {
            this.canal -= 1;
            return true;
        }
        return false;
    }

    private boolean isInValidLimitsChannels(String upOrDown) {
        if (upOrDown == "UP") {
            if (this.canal + 1 > 120) {
                return false;
            }
            return true;
        }
        if (upOrDown == "DOWN") {
            if (this.canal - 1 < 1) {
                return false;
            }
            return true;
        }
        return false;
    }
    private boolean isOn() {
        return this.estado;
    }

    public boolean turnOn() {
        this.estado = true;
        return true;
    }
    public boolean turnOff() {
        this.estado = false;
        return false;
    }
    public static int getNumTV() {
        return numTV;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (!isOn()) {
            return;
        }
        if (canal > 120 || canal < 1) {
            return;
        }
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public boolean getEstado() {
        return estado;
    }
}
