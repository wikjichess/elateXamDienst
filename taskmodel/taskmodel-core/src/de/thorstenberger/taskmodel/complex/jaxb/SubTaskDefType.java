//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.25 at 09:48:26 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for SubTaskDefType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 675)
 * <p>
 * <pre>
 * &lt;complexType name="SubTaskDefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="problem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correctionHint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="trash" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="interactiveFeedback" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface SubTaskDefType {


    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getCorrectionHint();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setCorrectionHint(java.lang.String value);

    boolean isSetCorrectionHint();

    void unsetCorrectionHint();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getHint();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setHint(java.lang.String value);

    boolean isSetHint();

    void unsetHint();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getProblem();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setProblem(java.lang.String value);

    boolean isSetProblem();

    void unsetProblem();

    /**
     * 
     */
    boolean isInteractiveFeedback();

    /**
     * 
     */
    void setInteractiveFeedback(boolean value);

    boolean isSetInteractiveFeedback();

    void unsetInteractiveFeedback();

    /**
     * 
     */
    boolean isTrash();

    /**
     * 
     */
    void setTrash(boolean value);

    boolean isSetTrash();

    void unsetTrash();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    boolean isSetId();

    void unsetId();

}
