//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:17 AM UTC 
//


package net.sourceforge.czt.zeves.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WrappedCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WrappedCommand">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/zeves}ProofCommand">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/zeves}ProofCommand" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WrappedCommand", propOrder = {
    "proofCommand"
})
@XmlSeeAlso({
    ComplexCommand.class,
    NormalizationCommand.class
})
public class WrappedCommand
    extends ProofCommand
{

    @XmlElementRef(name = "ProofCommand", namespace = "http://czt.sourceforge.net/zeves", type = JAXBElement.class)
    protected JAXBElement<? extends ProofCommand> proofCommand;

    /**
     * Gets the value of the proofCommand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WrappedCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubstitutionCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaseAnalysisCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link UseCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalizationCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplyCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuantifiersCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimplificationCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProofCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link WithCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstantiationCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link SorryCommand }{@code >}
     *     
     */
    public JAXBElement<? extends ProofCommand> getProofCommand() {
        return proofCommand;
    }

    /**
     * Sets the value of the proofCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WrappedCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link SubstitutionCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link CaseAnalysisCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link UseCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link NormalizationCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link ComplexCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplyCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuantifiersCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link SimplificationCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProofCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link WithCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstantiationCommand }{@code >}
     *     {@link JAXBElement }{@code <}{@link SorryCommand }{@code >}
     *     
     */
    public void setProofCommand(JAXBElement<? extends ProofCommand> value) {
        this.proofCommand = value;
    }

}