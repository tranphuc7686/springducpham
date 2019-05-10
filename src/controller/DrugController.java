package controller;

import model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DrugService;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class DrugController {

    @Autowired
    private DrugService drugService;
    @CrossOrigin
    @RequestMapping(path = "drug", method = RequestMethod.POST)
    public void saveVisit(@RequestBody Drug drug){
        drugService.addDrug(drug);
    };
    @CrossOrigin
    @RequestMapping(path = "drug", method = RequestMethod.GET)
    public List<Drug> getAllDrugs(){
        return drugService.getAllDrugs();
    }
    @CrossOrigin
    @RequestMapping(path = "drug/id/{id}", method = RequestMethod.GET)
    public Drug getDrugById(@PathVariable int id) {
        return drugService.getDrugById(id);
    }
    @CrossOrigin
    @RequestMapping(path = "drug", method = RequestMethod.PUT)
    public void updateDrug(@RequestBody Drug drug) {
        drugService.updateDrug(drug);
    }
    @CrossOrigin
    @RequestMapping(path = "drug/id/{id}", method = RequestMethod.DELETE)
    public void deleteDrug(@PathVariable int id) {
        drugService.deleteDrug(id);
    }


}
