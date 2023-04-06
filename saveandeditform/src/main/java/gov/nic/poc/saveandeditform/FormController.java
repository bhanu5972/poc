package gov.nic.poc.saveandeditform;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    
    private static final Logger log = LoggerFactory.getLogger(FormController.class);
    @Autowired
    FormDataRepository formDataRepository;

    @RequestMapping({"/", "/home","/index"})
    public String getIndexPage(Model model){

        FormData formData = new FormData();
        model.addAttribute("formData", formData);
        Iterable<FormData> formDataIterator = formDataRepository.findAll();
        List<FormData> formDataList = new ArrayList<FormData>();
        formDataIterator.forEach(formDataList::add);
        model.addAttribute("formDataList",formDataList);
        return "formData";

    }

    @GetMapping("/getFormData")
    public String getFormData(Model model){

        FormData formData = new FormData();
        model.addAttribute("formData", formData);
        Iterable<FormData> formDataIterator = formDataRepository.findAll();
        List<FormData> formDataList = new ArrayList<FormData>();
        formDataIterator.forEach(formDataList::add);
        model.addAttribute("formDataList",formDataList);
        return "formData";

    }
    @PostMapping("/saveForm")
    @Transactional
    public String saveData(@Validated FormData formData, BindingResult bindingResult, Model model) {

        log.info("Saving Data");
        if(bindingResult.hasErrors()) {

            log.error("so many errors");
        }
        formDataRepository.save(formData);
        model.addAttribute("formData", formData);

        return "formData";
    }

}
