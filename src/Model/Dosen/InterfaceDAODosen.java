package Model.Dosen;

import Model.Dosen.ModelDosen;

import java.util.List;

public interface InterfaceDAODosen {
    public void insert(ModelDosen Dosen);
    public void update(ModelDosen Dosen);
    public void delete(int id);
    public List<ModelDosen> getAll();
}
