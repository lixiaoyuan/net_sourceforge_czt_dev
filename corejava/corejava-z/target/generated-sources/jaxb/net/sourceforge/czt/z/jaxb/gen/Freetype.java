//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:37:58 AM UTC 
//


package net.sourceforge.czt.z.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Freetype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Freetype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}Term">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Name"/>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}BranchList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Freetype", propOrder = {
    "name",
    "branchList"
})
public class Freetype
    extends Term
{

    @XmlElementRef(name = "Name", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends Name> name;
    @XmlElementRef(name = "BranchList", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected JAXBElement<? extends BranchList> branchList;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZName }{@code >}
     *     
     */
    public JAXBElement<? extends Name> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Name }{@code >}
     *     {@link JAXBElement }{@code <}{@link ZName }{@code >}
     *     
     */
    public void setName(JAXBElement<? extends Name> value) {
        this.name = value;
    }

    /**
     * Gets the value of the branchList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZBranchList }{@code >}
     *     {@link JAXBElement }{@code <}{@link BranchList }{@code >}
     *     
     */
    public JAXBElement<? extends BranchList> getBranchList() {
        return branchList;
    }

    /**
     * Sets the value of the branchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZBranchList }{@code >}
     *     {@link JAXBElement }{@code <}{@link BranchList }{@code >}
     *     
     */
    public void setBranchList(JAXBElement<? extends BranchList> value) {
        this.branchList = value;
    }

}
