/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.LaundryUtil;
import POJO.TblOrder;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ARSY
 */
public class DAOOrder {
    public List<TblOrder> getBy (){
      TblOrder o = new TblOrder();
      List<TblOrder> user = new ArrayList();
      
      Transaction trans = null;
      Session session = LaundryUtil.getSessionFactory().openSession();
      try
      {
          trans = session.beginTransaction();
          Query query = session.createQuery("from TblOrder");
          o = (TblOrder) query.uniqueResult();
          user = query.list();
          
          trans.commit();
      } catch (Exception e) {
          System.out.println(e);
      }
      return user;
    }
    
    public void AddBooking(TblOrder order){
          Transaction trans = null;
          Session session = LaundryUtil.getSessionFactory().openSession();
          try {
              trans = session.beginTransaction();
              session.save(order);
              trans.commit();
          } catch (Exception e) {
              System.out.println(e);
          }
      }
    
}
