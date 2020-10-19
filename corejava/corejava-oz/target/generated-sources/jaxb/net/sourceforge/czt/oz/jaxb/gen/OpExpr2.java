//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:27 AM UTC 
//


package net.sourceforge.czt.oz.jaxb.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpExpr2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpExpr2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/object-z}OpExpr">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/object-z}OpExpr" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpExpr2", propOrder = {
    "opExpr"
})
@XmlSeeAlso({
    ConjOpExpr.class,
    AssoParallelOpExpr.class,
    SeqOpExpr.class,
    ScopeEnrichOpExpr.class,
    ParallelOpExpr.class,
    ExChoiceOpExpr.class
})
public class OpExpr2
    extends OpExpr
{

    @XmlElementRef(name = "OpExpr", namespace = "http://czt.sourceforge.net/object-z", type = JAXBElement.class)
    protected List<JAXBElement<? extends OpExpr>> opExpr;

    /**
     * Gets the value of the opExpr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opExpr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpExpr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DistConjOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link OpPromotionExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ExChoiceOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link OpExpr2 }{@code >}
     * {@link JAXBElement }{@code <}{@link RenameOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link DistOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link AssoParallelOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link HideOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ParallelOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link OpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ConjOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link AnonOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link ScopeEnrichOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link DistSeqOpExpr }{@code >}
     * {@link JAXBElement }{@code <}{@link DistChoiceOpExpr }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends OpExpr>> getOpExpr() {
        if (opExpr == null) {
            opExpr = new ArrayList<JAXBElement<? extends OpExpr>>();
        }
        return this.opExpr;
    }

}
