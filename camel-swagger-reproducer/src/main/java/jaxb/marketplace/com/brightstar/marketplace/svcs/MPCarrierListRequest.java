
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MPCarrierListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MPCarrierListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://svcs.marketplace.brightstar.com/}MPGenericListRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseObjectList" type="{http://svcs.marketplace.brightstar.com/}MPCarrierList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPCarrierListRequest", propOrder = {
    "responseObjectList"
})
public class MPCarrierListRequest
    extends MPGenericListRequest
{

    @XmlElement(name = "ResponseObjectList")
    protected MPCarrierList responseObjectList;

    /**
     * Gets the value of the responseObjectList property.
     * 
     * @return
     *     possible object is
     *     {@link MPCarrierList }
     *     
     */
    public MPCarrierList getResponseObjectList() {
        return responseObjectList;
    }

    /**
     * Sets the value of the responseObjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MPCarrierList }
     *     
     */
    public void setResponseObjectList(MPCarrierList value) {
        this.responseObjectList = value;
    }

}
