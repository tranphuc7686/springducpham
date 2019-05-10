package service;

import model.DrugDetail;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Transactional
@Service
public class DrugDetailService {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveDrugdetail(DrugDetail drugdetail){
        sessionFactory.getCurrentSession().save(drugdetail);
    }
}
