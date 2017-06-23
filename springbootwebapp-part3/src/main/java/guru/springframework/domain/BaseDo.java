/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guru.springframework.domain;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author mohitm@bdcvit.com
 */

@MappedSuperclass
public class BaseDo implements Serializable {
    
    String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
}
