//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.15 at 06:48:35 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for addonSubTaskDef element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal_head/taskmodel-core/jaxb/complexTaskDef.xsd line 655)
 * <p>
 * <pre>
 * &lt;element name="addonSubTaskDef">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{http://complex.taskmodel.thorstenberger.de/complexTaskDef}SubTaskDefType">
 *         &lt;sequence>
 *           &lt;element name="correctionHint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="Memento" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;/sequence>
 *         &lt;attribute name="textFieldWidth" type="{http://www.w3.org/2001/XMLSchema}int" />
 *         &lt;attribute name="textFieldHeight" type="{http://www.w3.org/2001/XMLSchema}int" />
 *         &lt;attribute name="taskType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface AddonSubTaskDef
    extends javax.xml.bind.Element, de.thorstenberger.taskmodel.complex.jaxb.AddonSubTaskDefType
{


}
