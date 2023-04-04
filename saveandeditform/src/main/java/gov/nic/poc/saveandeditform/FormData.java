package gov.nic.poc.saveandeditform;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "save_and_edit_form_data")
public class FormData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public String getName() {
         return name;
    }
    public void setName(String name){

        this.name = name;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
