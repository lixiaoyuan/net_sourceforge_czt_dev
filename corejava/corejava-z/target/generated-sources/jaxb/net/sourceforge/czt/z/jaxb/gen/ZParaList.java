//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:37:58 AM UTC 
//


package net.sourceforge.czt.z.jaxb.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZParaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZParaList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zml}ParaList">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zml}Para" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZParaList", propOrder = {
    "para"
})
public class ZParaList
    extends ParaList
{

    @XmlElementRef(name = "Para", namespace = "http://czt.sourceforge.net/zml", type = JAXBElement.class)
    protected List<JAXBElement<? extends Para>> para;

    /**
     * Gets the value of the para property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the para property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPara().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FreePara }{@code >}
     * {@link JAXBElement }{@code <}{@link OptempPara }{@code >}
     * {@link JAXBElement }{@code <}{@link GivenPara }{@code >}
     * {@link JAXBElement }{@code <}{@link Para }{@code >}
     * {@link JAXBElement }{@code <}{@link LatexMarkupPara }{@code >}
     * {@link JAXBElement }{@code <}{@link NarrPara }{@code >}
     * {@link JAXBElement }{@code <}{@link ConjPara }{@code >}
     * {@link JAXBElement }{@code <}{@link UnparsedPara }{@code >}
     * {@link JAXBElement }{@code <}{@link AxPara }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Para>> getPara() {
        if (para == null) {
            para = new ArrayList<JAXBElement<? extends Para>>();
        }
        return this.para;
    }

}
