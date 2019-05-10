package controller;

import model.DrugDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DrugDetailService;

@RestController
@RequestMapping(path = "/")
public class DrugDetailController {

    @Autowired
    private DrugDetailService drugdetailService;
    @CrossOrigin
    @RequestMapping(path = "drugdetail", method = RequestMethod.POST)
    public void saveDrugdetail(@RequestBody DrugDetail drugdetail){
        drugdetailService.saveDrugdetail(drugdetail);
    }
}
