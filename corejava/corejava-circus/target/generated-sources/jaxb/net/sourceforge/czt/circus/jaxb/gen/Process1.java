//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.18 at 08:38:59 AM UTC 
//


package net.sourceforge.czt.circus.jaxb.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Process1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Process1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://czt.sourceforge.net/circus}CircusProcess">
 *       &lt;sequence>
 *         &lt;element ref="{http://czt.sourceforge.net/circus}CircusProcess"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Process1", propOrder = {
    "circusProcess"
})
@XmlSeeAlso({
    HideProcess.class,
    RenameProcess.class,
    ProcessD.class
})
public class Process1
    extends CircusProcess
{

    @XmlElementRef(name = "CircusProcess", namespace = "http://czt.sourceforge.net/circus", type = JAXBElement.class)
    protected JAXBElement<? extends CircusProcess> circusProcess;

    /**
     * Gets the value of the circusProcess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlphabetisedParallelProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExtChoiceProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParamProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasicProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link HideProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntChoiceProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExtChoiceProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterleaveProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessD }{@code >}
     *     {@link JAXBElement }{@code <}{@link Process2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntChoiceProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link Process1 }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircusProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterleaveProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExtChoiceProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndexedProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntChoiceProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenameProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterleaveProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link CallProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlphabetisedParallelProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlphabetisedParallelProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessIdx }{@code >}
     *     
     */
    public JAXBElement<? extends CircusProcess> getCircusProcess() {
        return circusProcess;
    }

    /**
     * Sets the value of the circusProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlphabetisedParallelProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExtChoiceProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParamProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasicProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link HideProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntChoiceProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExtChoiceProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterleaveProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessD }{@code >}
     *     {@link JAXBElement }{@code <}{@link Process2 }{@code >}
     *     {@link JAXBElement }{@code <}{@link ParallelProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link SeqProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntChoiceProcessIdx }{@code >}
     *     {@link JAXBElement }{@code <}{@link Process1 }{@code >}
     *     {@link JAXBElement }{@code <}{@link CircusProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterleaveProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExtChoiceProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link IndexedProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntChoiceProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link RenameProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link InterleaveProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link CallProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlphabetisedParallelProcessIte }{@code >}
     *     {@link JAXBElement }{@code <}{@link AlphabetisedParallelProcess }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProcessIdx }{@code >}
     *     
     */
    public void setCircusProcess(JAXBElement<? extends CircusProcess> value) {
        this.circusProcess = value;
    }

}
