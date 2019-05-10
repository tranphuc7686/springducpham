package controller;

import model.Icd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.IcdService;

import java.util.List;

@RestController
public class IcdController {
    @Autowired
    private IcdService icdService;
    @CrossOrigin
    @RequestMapping(path = "/icd", method = RequestMethod.POST)
    public void saveVisit(@RequestBody Icd icd){
        icdService.addIcd(icd);
    };
    @CrossOrigin
    @RequestMapping(path = "/icd", method = RequestMethod.GET)
    public List<Icd> getAllIcds(){
        return icdService.getAllIcds();
    }
    @CrossOrigin
    @RequestMapping(path = "/icd", method = RequestMethod.PUT)
    public void updateIcd(@RequestBody Icd icd) {
        icdService.updateIcd(icd);
    }
    @CrossOrigin
    @RequestMapping(path = "/icd/id/{id}", method = RequestMethod.DELETE)
    public void deleteIcd(@PathVariable int id) {
        icdService.deleteIcd(id);
    }
}
