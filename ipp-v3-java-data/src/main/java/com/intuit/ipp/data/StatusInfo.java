//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.01 at 02:14:53 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: QBO
 * 				Description: Log of Statuses for Transactions. Currently is used for Invoice. Can be extended to others.								
 * 			
 * 
 * <p>Java class for StatusInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="callToAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusInfo", propOrder = {
    "status",
    "statusDate",
    "callToAction"
})
public class StatusInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    protected String status;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date statusDate;
    protected String callToAction;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStatusDate() {
        return statusDate;
    }

    /**
     * Sets the value of the statusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDate(Date value) {
        this.statusDate = value;
    }

    /**
     * Gets the value of the callToAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToAction() {
        return callToAction;
    }

    /**
     * Sets the value of the callToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallToAction(String value) {
        this.callToAction = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StatusInfo that = ((StatusInfo) object);
        {
            String lhsStatus;
            lhsStatus = this.getStatus();
            String rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            Date lhsStatusDate;
            lhsStatusDate = this.getStatusDate();
            Date rhsStatusDate;
            rhsStatusDate = that.getStatusDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "statusDate", lhsStatusDate), LocatorUtils.property(thatLocator, "statusDate", rhsStatusDate), lhsStatusDate, rhsStatusDate, (this.statusDate!= null), (that.statusDate!= null))) {
                return false;
            }
        }
        {
            String lhsCallToAction;
            lhsCallToAction = this.getCallToAction();
            String rhsCallToAction;
            rhsCallToAction = that.getCallToAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callToAction", lhsCallToAction), LocatorUtils.property(thatLocator, "callToAction", rhsCallToAction), lhsCallToAction, rhsCallToAction, (this.callToAction!= null), (that.callToAction!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            Date theStatusDate;
            theStatusDate = this.getStatusDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "statusDate", theStatusDate), currentHashCode, theStatusDate, (this.statusDate!= null));
        }
        {
            String theCallToAction;
            theCallToAction = this.getCallToAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callToAction", theCallToAction), currentHashCode, theCallToAction, (this.callToAction!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
