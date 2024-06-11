public class Moto {
    

    public Moto() {
    }

    public Moto(String placa, String marca, int modelo, int cilindraje) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }

    private String placa;
    private String marca;
    private int modelo;
    private int cilindraje;

    

    void encender(){

    }
    void acelerar(){

    }
    void desplazar(){

    }
    void frenar(){

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

}