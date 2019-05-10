package service;

import model.Drug;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DrugService {

    @Autowired
    private SessionFactory sessionFactory;

    public void addDrug(Drug drug){
        sessionFactory.getCurrentSession().save(drug);
    }

    public List<Drug> getAllDrugs(){
        Query query = sessionFactory.getCurrentSession().createQuery("from Drug");
        return query.list();
    }

    public Drug getDrugById(int id){
        return(Drug) sessionFactory.getCurrentSession().get(Drug.class, id);
    }

    public void updateDrug (Drug drug){
        sessionFactory.getCurrentSession().update(drug);
    }

    public void deleteDrug(int id){
        Drug drug = getDrugById(id);
        sessionFactory.getCurrentSession().delete(drug);
    }
}
