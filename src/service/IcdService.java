package service;

import model.Icd;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class IcdService {
    @Autowired
    private SessionFactory sessionFactory;

    public void addIcd(Icd icd){
        sessionFactory.getCurrentSession().save(icd);
    }

    public List<Icd> getAllIcds(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Icd");
        return query.list();
    }

    public Icd getIcdById(int id){
        return(Icd) sessionFactory.getCurrentSession().get(Icd.class, id);
    }

    public void updateIcd (Icd icd){
        sessionFactory.getCurrentSession().update(icd);
    }

    public void deleteIcd(int id){
        Icd icd = getIcdById(id);
        sessionFactory.getCurrentSession().delete(icd);
    }
}
