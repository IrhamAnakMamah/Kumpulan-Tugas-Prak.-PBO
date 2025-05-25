package Model.Dosen;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ModelTable extends AbstractTableModel {
    List<ModelDosen> daftarDosen;

    String kolom[] = {"ID", "Nama", "NIDN"};
    public ModelTable(List<ModelDosen> daftarDosen) {
        this.daftarDosen = daftarDosen;
    }

    @Override
    public int getRowCount() {
        return daftarDosen.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarDosen.get(rowIndex).getId();
            case 1:
                return daftarDosen.get(rowIndex).getNama();
            case 2:
                return daftarDosen.get(rowIndex).getNidn();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }
}
