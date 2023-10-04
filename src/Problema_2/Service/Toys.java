package Problema_2.Service;

import Problema_2.Dto.Toy_Dto;
import Problema_2.Interface.Toy_Interface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Toys implements Toy_Interface {
    private List<Toy_Dto> Toys;

    public Toys() throws IOException, ClassNotFoundException {
        Toys = new ArrayList<>();
    }

    @Override
    public Toy_Dto findById(int id) {
        return Toys.stream()
                .filter(Toy -> Toy.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Toy_Dto> findAll() throws IOException, ClassNotFoundException {
        Toys = (List<Toy_Dto>) ObjectSerializer.readObjectFromFile("juguetes.ax");
        return Toys;
    }

    @Override
    public void save(Toy_Dto Toy) throws IOException {
        Toys.add(Toy);
        ObjectSerializer.writeObjectToFile(Toys, "juguetes.ax");
    }

    @Override
    public void update(Toy_Dto Toy) throws IOException {
        Toy_Dto oldProducto = findById(Toy.getId());
        if (oldProducto != null) {
            Toys.remove(oldProducto);
            Toys.add(Toy);
            ObjectSerializer.writeObjectToFile(Toys, "juguetes.ax");
        }
    }

    @Override
    public void delete(Toy_Dto Toy) throws IOException {
        Toys.remove(Toy);
        ObjectSerializer.writeObjectToFile(Toys, "juguetes.ax");
    }
}
