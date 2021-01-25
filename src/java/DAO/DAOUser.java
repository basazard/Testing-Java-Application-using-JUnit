/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.LaundryUtil;
import POJO.TblUser;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ARSY
 */
public class DAOUser {
    public List<TblUser> getBy (String email, String password){
      TblUser u = new TblUser();
      List<TblUser> user = new ArrayList();
      
      Transaction trans = null;
      Session session = LaundryUtil.getSessionFactory().openSession();
      try
      {
          trans = session.beginTransaction();
          Query query = session.createQuery("from TblUser where email= :email AND password= :pass");
          query.setString("email", email);
          query.setString("pass", password);
          u = (TblUser) query.uniqueResult();
          user = query.list();
          
          trans.commit();
      } catch (Exception e) {
          System.out.println(e);
      }
      return user;
    }
    
    public List<TblUser> getByEmail (String email){
      TblUser u = new TblUser();
      List<TblUser> user = new ArrayList();
      
      Transaction trans = null;
      Session session = LaundryUtil.getSessionFactory().openSession();
      try
      {
          trans = session.beginTransaction();
          Query query = session.createQuery("from TblUser where email= :email");
          query.setString("email", email);
          u = (TblUser) query.uniqueResult();
          user = query.list();
          
          trans.commit();
      } catch (Exception e) {
          System.out.println(e);
      }
      return user;
    }
    
    public void AddUser(TblUser user){
          Transaction trans = null;
          Session session = LaundryUtil.getSessionFactory().openSession();
          try {
              trans = session.beginTransaction();
              session.save(user);
              trans.commit();
          } catch (Exception e) {
              System.out.println(e);
          }
      }
    
    public List<TblUser> ShowPelanggan(){
            List us = new ArrayList();
            TblUser us1 = new TblUser();
            Transaction trans = null;
            Session session = LaundryUtil.getSessionFactory().openSession();
            try{
                trans = session.beginTransaction();
                Query query = session.createQuery("from TblUser");
                us = query.list();
                us.add(us1.getIdUser());
                us.add(us1.getEmail());
                us.add(us1.getNamaPanjang());
                us.add(us1.getNoTelp());
                us.add(us1.getAlamat());
                us.add(us1.getPassword());
                trans.commit();
            } catch (Exception e){
                System.out.println(e);
            }
            return us;
        }
    
    public List<TblUser> ShowPelangganbyName(){
            List us = new ArrayList();
            TblUser us1 = new TblUser();
            Transaction trans = null;
            Session session = LaundryUtil.getSessionFactory().openSession();
            try{
                trans = session.beginTransaction();
                Query query = session.createQuery("from TblUser WHERE name LIKE ?");
                us = query.list();
                us.add(us1.getIdUser());
                us.add(us1.getEmail());
                us.add(us1.getNamaPanjang());
                us.add(us1.getNoTelp());
                us.add(us1.getAlamat());
                us.add(us1.getPassword());
                trans.commit();
            } catch (Exception e){
                System.out.println(e);
            }
            return us;
        }
        
        public List<TblUser> getbyID(String idU){
            TblUser usr = new TblUser();
            List<TblUser> iUsr = new ArrayList();
            Transaction trans = null;
            Session session = LaundryUtil.getSessionFactory().openSession();
            try{
                trans = session.beginTransaction();
                Query query = session.createQuery("from TblUser where id_user = :id");
                query.setString("id", idU);
                usr = (TblUser) query.uniqueResult();
                iUsr = query.list();
                trans.commit();
            } catch (Exception e){
                System.out.println(e);
            }return iUsr;
        }
        
        public List<TblUser> getbyEmail(String emailUser){
            TblUser tbluser = new TblUser();
            List<TblUser> listUser = new ArrayList();
            Transaction trans = null;
            Session session = LaundryUtil.getSessionFactory().openSession();
            try{
                trans = session.beginTransaction();
                Query query = session.createQuery("from TblUser where email = :email");
                query.setString("email", emailUser);
                tbluser = (TblUser) query.uniqueResult();
                listUser = query.list();
                trans.commit();
            } catch (Exception e){
                System.out.println(e);
            }return listUser;
        }
        
        public void deleteUser(Integer idU) {
            Transaction trans = null;
            Session session = LaundryUtil.getSessionFactory().openSession();
            try{
                trans = session.beginTransaction();
                TblUser usr = (TblUser) session.load(TblUser.class, new Integer(idU));
                session.delete(usr);
                trans.commit();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        public void editUser(TblUser usr)
        {
            Transaction trans = null;
            Session session = LaundryUtil.getSessionFactory().openSession();
            try {
                trans = session.beginTransaction();
                session.update(usr);
                trans.commit();
            }catch (Exception e){
                System.out.println(e);
            }
        }
}
