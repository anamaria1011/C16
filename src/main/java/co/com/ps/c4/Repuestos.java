package co.com.ps.c4;

class Repuestos {

    private String tipo;
    private String tamano;
    private int codigo;

    public Repuestos(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Repuestos(int codigo) {
        this.codigo = codigo;
    }
}


