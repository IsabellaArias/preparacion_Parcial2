package Problema_2.Interface;

import Problema_2.Dto.Toy_Dto;
import java.io.IOException;
import java.util.List;

public interface Toy_Interface {
    Toy_Dto findById(int id);
    List<Toy_Dto> findAll() throws IOException, ClassNotFoundException;
    void save(Toy_Dto toy) throws IOException;
    void update(Toy_Dto toy) throws IOException;
    void delete(Toy_Dto toy) throws IOException;
}
