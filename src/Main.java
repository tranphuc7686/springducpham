import config.AppConfig;
import model.Prescription;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.*;
//import service.StudentService;

/**
 * Created by CoT on 7/29/18.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);

        context.refresh();

        PatientService patientService = context.getBean(PatientService.class);
        DrugDetailService drugDetailService = context.getBean(DrugDetailService.class);
        DrugService drugService = context.getBean(DrugService.class);
        IcdService icdService = context.getBean(IcdService.class);
        PrescriptionService prescriptionService = context.getBean(PrescriptionService.class);
        VisitService visitService = context.getBean(VisitService.class);


        //StudentService studentService = context.getBean(StudentService.class);

    }
}
