package gov.nic.poc.saveandeditform;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormDataRepository extends CrudRepository<FormData,Integer>{
    
}
