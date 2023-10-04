package Problema_2.Dto;

import java.io.Serializable;

public class Toy_Dto implements Serializable {
    private Integer id;
    private String toyName;
    private String categoryToy;
    private Double price;
    private Integer existingQuantity;

    public Toy_Dto(Integer id, String toyName, String categoryToy, Double price, Integer existingQuantity) {
        this.id = id;
        this.toyName = toyName;
        this.categoryToy = categoryToy;
        this.price = price;
        this.existingQuantity = existingQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getCategoryToy() {
        return categoryToy;
    }

    public void setCategoryToy(String categoryToy) {
        this.categoryToy = categoryToy;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getExistingQuantity() {
        return existingQuantity;
    }

    public void setExistingQuantity(Integer existingQuantity) {
        this.existingQuantity = existingQuantity;
    }

    @Override
    public String toString() {
        return "Juguete:" +
                "\n Id=" + id +
                "\n Nombre del Juguete=" + toyName +
                "\n Categoría del Juguete=" + categoryToy +
                "\n Precio=" + price +
                "\n Cantidad Existente=" + existingQuantity;
    }
}
