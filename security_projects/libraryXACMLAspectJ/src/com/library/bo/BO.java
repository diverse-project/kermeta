package com.library.bo;

import com.library.dao.dto.spec.DTO;

/**
 * User: Tej
 * Date: 5 mars 2007
 * Time: 08:46:05
 */
public interface BO {


    /**
     * Set the class fields with the informations contained in the dto
     * @param dto
     */
    void setFromDTO(DTO dto);


    /**
     * gets the DTO of the business object.
     * @return a DTO that corresponds the the business object infos
     */
    DTO getDTO();
}
