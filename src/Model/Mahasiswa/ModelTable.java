package Model.Mahasiswa;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModelTable extends AbstractTableModel {
    List<ModelMahasiswa> daftarMahasiswa;

    String kolom[] = {"ID", "Nama", "NIM"};
    public ModelTable(List<ModelMahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    @Override
    public int getRowCount() {
        return daftarMahasiswa.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarMahasiswa.get(rowIndex).getId();
                case 1:
                    return daftarMahasiswa.get(rowIndex).getNama();
                    case 2:
                        return daftarMahasiswa.get(rowIndex).getNim();
                        default:
                            return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }
}
