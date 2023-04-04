package gov.nic.poc.saveandeditform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    
    private static final Logger log = LoggerFactory.getLogger(FormController.class);
    @Autowired
    FormDataRepository formDataRepository;
    @PostMapping("/saveForm")
    @Transactional
    public String saveData(@ModelAttribute("formData") FormData formData, Model model) {

        log.info("Saving Data");
        formDataRepository.save(formData);

        return "index";
    }

}
