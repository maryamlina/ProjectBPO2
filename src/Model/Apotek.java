package Model;

import java.util.Date;

public class Apotek {
    private int id;
    private String namaJabatan;
    private String namaLengkap;
    private Date tanggalLahir;
    private String alamat;
    private int nomortelpon;
    private String jenjangJabatan;
    private String instansi;


    public void tampilkanIdentitas() {
        System.out.println("ID : " + id);
        System.out.println("Nama Jabatan : " + namaJabatan);
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("jenjangJabatan : " + jenjangJabatan);
        System.out.println("instansi : " + instansi);
    }

    public void membuatObat() {
        System.out.println("apoteker sedang membuat obat");
    }

}
