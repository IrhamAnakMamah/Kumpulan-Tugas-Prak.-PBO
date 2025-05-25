package Model.Mahasiswa;

import java.util.List;

public interface InterfaceDAOMahasiswa {
    public void insert(ModelMahasiswa Mahasiswa);
    public void update(ModelMahasiswa Mahasiswa);
    public void delete(int id);
    public List<ModelMahasiswa> getAll();
}
