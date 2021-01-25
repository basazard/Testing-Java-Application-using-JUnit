package POJO;
// Generated Oct 24, 2020 12:31:22 PM by Hibernate Tools 4.3.1

import DAO.DAOAdmin;
import java.util.List;
import javax.faces.bean.ManagedBean;




@ManagedBean
public class TblAdmin  implements java.io.Serializable {


     private Integer idAdmin;
     private String username;
     private String password;
     
     public String validasiLoginAdmin(){
        DAOAdmin uDaoAdmin = new DAOAdmin();
        List<TblAdmin> u = uDaoAdmin.getBy(username,password);
        if(u !=null)
        {
            username = u.get(0).username;
            password = u.get(0).password;
            return "DashboardAdmin";
        }
        return"LoginFailed";
        }

    public TblAdmin() {
    }

    public TblAdmin(String username, String password) {
       this.username = username;
       this.password = password;
    }
   
    public Integer getIdAdmin() {
        return this.idAdmin;
    }
    
    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


