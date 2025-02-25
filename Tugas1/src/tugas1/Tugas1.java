/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

interface Aksi{
    void serang();
    void bertahan();
    void naikLevel();
}

abstract class Karakter implements Aksi{
    String namaKarakter;
    int levelKarakter, nyawaKarakter;
    
    public Karakter (String nama, int level, int nyawa){
        namaKarakter = nama;
        levelKarakter = level;
        nyawaKarakter = nyawa;
    }
    
    abstract void skillUltimate();
    
    void tampilkanStatus(){
        System.out.println("Nama : " + namaKarakter);
        System.out.println("Level : " + levelKarakter);
        System.out.println("Nyawa : " + nyawaKarakter);
    }
    
}

class Pendekar extends Karakter implements Aksi{
    public Pendekar (String nama, int level, int nyawa){
        super(nama,level,nyawa);
    }
    
    @Override
    void skillUltimate(){
        System.out.println(namaKarakter + " Mengeluarkan Hujan Petir di Sekitar Lawan!");
    }
    
    @Override
    public void serang(){
        System.out.println(namaKarakter + " menyerang dengan mengayunkan pedang kepada musuh");
    }
    
    @Override
    public void bertahan(){
        System.out.println(namaKarakter + " bertahan dengan menggunakan perisai kapten amerika");
    }
    
    @Override
    public void naikLevel(){
        levelKarakter++;
        nyawaKarakter += 20;
        System.out.println(namaKarakter + " telah bertambah level menjadi " + levelKarakter);
    }
}

class Pemanah extends Karakter implements Aksi{
    public Pemanah (String nama, int level, int nyawa){
        super(nama,level,nyawa);
    }
    
    @Override
    void skillUltimate(){
        System.out.println(namaKarakter + " Mengeluarkan Hujan Api di Sekitar Lawan!");
    }
    
    @Override
    public void serang(){
        System.out.println(namaKarakter + " menyerang dengan memanah kepada musuh");
    }
    
    @Override
    public void bertahan(){
        System.out.println(namaKarakter + " bertahan dengan menggunakan tangan besi");
    }
    
    @Override
    public void naikLevel(){
        levelKarakter++;
        nyawaKarakter += 15;
        System.out.println(namaKarakter + " telah bertambah level menjadi " + levelKarakter);
    }
}

class Penyihir extends Karakter implements Aksi{
    public Penyihir (String nama, int level, int nyawa){
        super(nama,level,nyawa);
    }
    
    @Override
    void skillUltimate(){
        System.out.println(namaKarakter + " Mengeluarkan Kage Bunshin berjumlah Ratusan!");
    }
    
    @Override
    public void serang(){
        System.out.println(namaKarakter + " menyerang dengan meramalkan ilmu santet kepada musuh");
    }
    
    @Override
    public void bertahan(){
        System.out.println(namaKarakter + " bertahan dengan menggunakan tongkat ajaibnya");
    }
    
    @Override
    public void naikLevel(){
        levelKarakter++;
        nyawaKarakter += 10;
        System.out.println(namaKarakter + " telah bertambah level menjadi " + levelKarakter);
    }
    
}

/**
 *
 * @author Irham
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Karakter Opi = new Pendekar("Opi", 12, 100);
        Opi.tampilkanStatus();
        Opi.skillUltimate();
        Opi.serang();
        Opi.bertahan();
        Opi.naikLevel();
        
        System.out.println("");
        
        Karakter Yukari = new Pemanah("Yukari", 10, 60);
        Yukari.tampilkanStatus();
        Yukari.skillUltimate();
        Yukari.serang();
        Yukari.bertahan();
        Yukari.naikLevel();
        
        System.out.println("");

        Karakter Harry = new Penyihir("Harry", 20, 80);
        Harry.tampilkanStatus();
        Harry.skillUltimate();
        Harry.serang();
        Harry.bertahan();
        Harry.naikLevel();        
    }
    
    
}
