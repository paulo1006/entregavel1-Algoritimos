import  java.util.Scanner;
public class Carro {
    private String marca;
    private String modelo;
    private String cor;

    public void setPreco(float preco) {
        this.preco = preco;
    }

    private float preco;
    public Carro(String marca, String modelo, String cor, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPreco() {
        return preco;
    }


    public String getMostrar() {
        return "MODELO DO CARRO : "+modelo+" DA MARCA "+marca+" DA COR : "+cor+" pelo preco de "+preco;
    }
}
