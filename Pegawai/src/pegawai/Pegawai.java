/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pegawai;

/**
 *
 * @author AFIFA SALSABILA
 */
public class Pegawai {

    /**
     * @param args the command line arguments
     */
    String pegNama;
    String pegAlamat;
    int gaji = 0;
    
    public Pegawai(String nama, String alamat){
        pegNama = nama;
        pegAlamat = alamat;
    }
    
    public void myDept(int dept){
        switch (dept) {
            case 1:
                gaji = gaji + 8000000;
                break;
            case 2:
                gaji = gaji + 5000000;
                break;
            case 3:
                gaji = gaji + 4000000;
                break;
        }
    }
    
    public void myPeng(int peng){
        switch (peng) {
            case 1:
                gaji = gaji + 500000;
                break;
            case 2:
                gaji = gaji + 1000000;
                break;
            case 3:
                gaji = gaji + 2000000;
                break;
        }
    }
    
    public void mySkill(int skill){
        switch (skill) {
            case 1:
                gaji = gaji + 1000000;
                break;
            case 2:
                gaji = gaji + 2000000;
                break;
            case 3:
                gaji = gaji + 2500000;
                break;
        }
        System.out.println("Gaji = "+gaji);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai myPeg1 = new Pegawai("Timur Nusantara", "Surabaya");
        
        System.out.println("=====================");
        System.out.println("DATA PERSONAL PEGAWAI");
        System.out.println("=====================");
        System.out.println("Nama = "+myPeg1.pegNama);
        System.out.println("Alamat = "+myPeg1.pegAlamat);
        myPeg1.myDept(1);
        myPeg1.myPeng(2);
        myPeg1.mySkill(3);
    }
    
}
