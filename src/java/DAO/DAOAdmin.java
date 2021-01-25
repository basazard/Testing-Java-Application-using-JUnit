/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.LaundryUtil;
import POJO.TblAdmin;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ARSY
 */
public class DAOAdmin {
    public List<TblAdmin> getBy (String uName, String aPass){
      TblAdmin a = new TblAdmin();
      List<TblAdmin> user = new ArrayList();
      
      Transaction trans = null;
      Session session = LaundryUtil.getSessionFactory().openSession();
      try
      {
          trans = session.beginTransaction();
          Query query = session.createQuery("from TblAdmin where username= :uName AND password= :aPass");
          query.setString("uName", uName);
          query.setString("aPass", aPass);
          a = (TblAdmin) query.uniqueResult();
          user = query.list();
          
          trans.commit();
      } catch (Exception e) {
          System.out.println(e);
      }
      return user;
    }
}
    

