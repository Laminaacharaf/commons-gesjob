/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rintio.commons.models;

import java.util.List;

/**
 * Class that contains the search criterias and the object fields to retrieve
 *
 * @author Bello
 */
public class RechercheClass {

    private Criterias criterias;
    private List<String> fields;

    /**
     * Get the search criterias
     *
     * @return the criterias
     */
    public Criterias getCriterias() {
        return criterias;
    }

    /**
     * Set the search criterias
     *
     * @param criterias the criterias to set
     */
    public void setCriterias(Criterias criterias) {
        this.criterias = criterias;
    }

    /**
     * Get the search fields to retrieve
     *
     * @return the fields
     */
    public List<String> getFields() {
        return fields;
    }

    /**
     * Set the search fields to retrieve
     *
     * @param fields the fields to set
     */
    public void setFields(List<String> fields) {
        this.fields = fields;
    }

}
