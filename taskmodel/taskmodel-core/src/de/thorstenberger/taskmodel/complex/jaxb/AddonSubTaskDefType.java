//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.25 at 09:48:26 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal/taskmodel-core/jaxb/complexTaskDef.xsd line 644)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://complex.taskmodel.thorstenberger.de/complexTaskDef}SubTaskDefType">
 *       &lt;sequence>
 *         &lt;element name="Memento" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="textFieldHeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="textFieldWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="taskType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AddonSubTaskDefType
    extends de.thorstenberger.taskmodel.complex.jaxb.SubTaskDefType
{


    /**
     * 
     */
    int getTextFieldWidth();

    /**
     * 
     */
    void setTextFieldWidth(int value);

    boolean isSetTextFieldWidth();

    void unsetTextFieldWidth();

    /**
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTaskType();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTaskType(java.lang.String value);

    boolean isSetTaskType();

    void unsetTaskType();

    /**
     * 
     */
    int getTextFieldHeight();

    /**
     * 
     */
    void setTextFieldHeight(int value);

    boolean isSetTextFieldHeight();

    void unsetTextFieldHeight();

    /**
     * 
     * @return
     *     possible object is
     *     {@link org.w3c.dom.Element}
     */
    org.w3c.dom.Element getMemento();

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link org.w3c.dom.Element}
     */
    void setMemento(org.w3c.dom.Element value);

    boolean isSetMemento();

    void unsetMemento();

}
