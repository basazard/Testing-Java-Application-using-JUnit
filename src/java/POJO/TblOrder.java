package POJO;
// Generated Oct 24, 2020 12:31:22 PM by Hibernate Tools 4.3.1

import DAO.DAOOrder;
import javax.faces.bean.ManagedBean;




@ManagedBean
public class TblOrder  implements java.io.Serializable {


     private Integer idOrder;
     private String nama;
     private String tglBooking;
     private String alamat;
     private String jenisLayanan;
     private Integer berat;
     private Integer hargaBerat;
     private Integer jumlah;
     private Integer hargaJumlah;
     private Integer total;
     
     public void save_booking()
     {
        DAOOrder add = new DAOOrder();
        add.AddBooking(this);
     }

    public TblOrder() {
    }

	
    public TblOrder(String nama, String tglBooking, String alamat, String jenisLayanan) {
        this.nama = nama;
        this.tglBooking = tglBooking;
        this.alamat = alamat;
        this.jenisLayanan = jenisLayanan;
    }
    public TblOrder(String nama, String tglBooking, String alamat, String jenisLayanan, Integer berat, Integer hargaBerat, Integer jumlah, Integer hargaJumlah, Integer total) {
       this.nama = nama;
       this.tglBooking = tglBooking;
       this.alamat = alamat;
       this.jenisLayanan = jenisLayanan;
       this.berat = berat;
       this.hargaBerat = hargaBerat;
       this.jumlah = jumlah;
       this.hargaJumlah = hargaJumlah;
       this.total = total;
    }
   
    public Integer getIdOrder() {
        return this.idOrder;
    }
    
    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getTglBooking() {
        return this.tglBooking;
    }
    
    public void setTglBooking(String tglBooking) {
        this.tglBooking = tglBooking;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getJenisLayanan() {
        return this.jenisLayanan;
    }
    
    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }
    public Integer getBerat() {
        return this.berat;
    }
    
    public void setBerat(Integer berat) {
        this.berat = berat;
    }
    public Integer getHargaBerat() {
        return this.hargaBerat;
    }
    
    public void setHargaBerat(Integer hargaBerat) {
        this.hargaBerat = hargaBerat;
    }
    public Integer getJumlah() {
        return this.jumlah;
    }
    
    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
    public Integer getHargaJumlah() {
        return this.hargaJumlah;
    }
    
    public void setHargaJumlah(Integer hargaJumlah) {
        this.hargaJumlah = hargaJumlah;
    }
    public Integer getTotal() {
        return this.total;
    }
    
    public void setTotal(Integer total) {
        this.total = total;
    }




}


