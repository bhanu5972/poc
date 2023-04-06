package gov.nic.poc.saveandeditform;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "save_and_edit_form_data")
@Getter
@Setter
@NoArgsConstructor
public class FormData {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Boolean checkBoxValue;

    private String favoriteLanguage;

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

    public Boolean getCheckBoxValue(){

        return checkBoxValue;
    }

    public void setCheckBoxValue(Boolean checkBoxValue){
        this.checkBoxValue = checkBoxValue;
    }

    public String getFavoriteLanguage() {

        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage){

        this.favoriteLanguage = favoriteLanguage;
    }

}
