package POJO;
// Generated Oct 24, 2020 12:31:22 PM by Hibernate Tools 4.3.1

import DAO.DAOUser;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;



@ManagedBean
public class TblUser  implements java.io.Serializable {


     private Integer idUser;
     private String email;
     private String namaPanjang;
     private String noTelp;
     private String alamat;
     private String password;
     
     public String save_user()
     {
        DAOUser add = new DAOUser();
        add.AddUser(this);
        return "FormLoginUser";
     }
     
        public String validasiLoginUser(){
        DAOUser uDaoUser = new DAOUser();
        List<TblUser> u = uDaoUser.getBy(email,password);
        if(u !=null)
        {
            email = u.get(0).email;
            password = u.get(0).password;
            return "index";
        } else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Incorrect Username and Passowrd",
							"Please enter correct username and Password"));
			return "FormLoginUser";
		}
	}
        
        public List<TblUser> getAllRecords(){
         DAOUser usr = new DAOUser();
         List<TblUser> lUsr = usr.ShowPelanggan();
         return lUsr;
     }
     
     public String getByID(){
         String id_user = idUser.toString();
         DAOUser usr = new DAOUser();
         List<TblUser> lUsr = usr.getbyID(id_user);
         email = lUsr.get(0).email;
         namaPanjang = lUsr.get(0).namaPanjang;
         noTelp = lUsr.get(0).noTelp;
         alamat = lUsr.get(0).alamat;
         password = lUsr.get(0).password;
         return "";
     }
     
     public String getByEmail(){
         DAOUser usr = new DAOUser();
         List<TblUser> lUsr = usr.getbyEmail(email);
         namaPanjang = lUsr.get(0).namaPanjang;
         noTelp = lUsr.get(0).noTelp;
         alamat = lUsr.get(0).alamat;
         password = lUsr.get(0).password;
         return "DashboardUser";
     }
     
     public void edit(){
         DAOUser usr = new DAOUser();
         usr.editUser(this);
         email = "";
         namaPanjang = "";
         noTelp = "";
         alamat = "";
         password = "";
     }
     
     public void delete(){
         String id_user = idUser.toString();
         DAOUser usr = new DAOUser();
         usr.deleteUser(idUser);
         email = "";
         namaPanjang = "";
         noTelp = "";
         alamat = "";
         password = "";
     }

    public TblUser() {
    }

    public TblUser(String email, String namaPanjang, String noTelp, String alamat, String password) {
       this.email = email;
       this.namaPanjang = namaPanjang;
       this.noTelp = noTelp;
       this.alamat = alamat;
       this.password = password;
    }
   
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNamaPanjang() {
        return this.namaPanjang;
    }
    
    public void setNamaPanjang(String namaPanjang) {
        this.namaPanjang = namaPanjang;
    }
    public String getNoTelp() {
        return this.noTelp;
    }
    
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

}


