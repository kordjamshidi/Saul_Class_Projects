//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.15 at 01:35:25 PM CET 
//


package be.liir.SpRL2012.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import be.liir.SpRL.model.Containable;
import be.liir.SpRL.model.WithIdentifier;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="general_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RELATION")
public class RELATION implements Containable{

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "tr", required = true)
    protected String tr;
    @XmlAttribute(name = "lm")
    protected String lm;
    @XmlAttribute(name = "sp")
    protected String sp;
    @XmlAttribute(name = "general_type")
    protected String generalType;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the tr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTr() {
        return tr;
    }

    /**
     * Sets the value of the tr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTr(String value) {
        this.tr = value;
    }

    /**
     * Gets the value of the lm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLm() {
        return lm;
    }

    /**
     * Sets the value of the lm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLm(String value) {
        this.lm = value;
    }

    /**
     * Gets the value of the sp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSp() {
        return sp;
    }

    /**
     * Sets the value of the sp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSp(String value) {
        this.sp = value;
    }

    /**
     * Gets the value of the generalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralType() {
        return generalType;
    }

    /**
     * Sets the value of the generalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralType(String value) {
        this.generalType = value;
    }

	public String getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setContent(String content) {
		// TODO Auto-generated method stub
		
	}

}