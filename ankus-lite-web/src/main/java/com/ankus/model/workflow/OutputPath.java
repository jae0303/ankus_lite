/**
 * This file is part of ankus.
 *
 * ankus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ankus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ankus.  If not, see <http://www.gnu.org/licenses/>.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.30 at 02:11:34 오후 KST 
//


package com.ankus.model.workflow;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="qualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="columnSize" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="columnNames" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="columnTypes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="deleteOnExist" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "outputPath")
public class OutputPath {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;
    @XmlAttribute(name = "delimiter")
    protected String delimiter;
    @XmlAttribute(name = "columnSize")
    protected String columnSize;
    @XmlAttribute(name = "columnNames")
    protected String columnNames;
    @XmlAttribute(name = "columnTypes")
    protected String columnTypes;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "deleteOnExist")
    protected Boolean deleteOnExist;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the delimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets the value of the delimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the columnSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnSize() {
        return columnSize;
    }

    /**
     * Sets the value of the columnSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnSize(String value) {
        this.columnSize = value;
    }

    /**
     * Gets the value of the columnNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnNames() {
        return columnNames;
    }

    /**
     * Sets the value of the columnNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnNames(String value) {
        this.columnNames = value;
    }

    /**
     * Gets the value of the columnTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnTypes() {
        return columnTypes;
    }

    /**
     * Sets the value of the columnTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnTypes(String value) {
        this.columnTypes = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the deleteOnExist property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeleteOnExist() {
        if (deleteOnExist == null) {
            return true;
        } else {
            return deleteOnExist;
        }
    }

    /**
     * Sets the value of the deleteOnExist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteOnExist(Boolean value) {
        this.deleteOnExist = value;
    }

}
