//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.15 at 06:48:35 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb;


/**
 * Java content class for mappingSubTaskDef element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/G:/elateWorkspace/elatePortal_head/taskmodel-core/jaxb/complexTaskDef.xsd line 530)
 * <p>
 * <pre>
 * &lt;element name="mappingSubTaskDef">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{http://complex.taskmodel.thorstenberger.de/complexTaskDef}SubTaskDefType">
 *         &lt;sequence>
 *           &lt;element name="concept" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="correctAssignmentID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="assignment" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface MappingSubTaskDef
    extends javax.xml.bind.Element, de.thorstenberger.taskmodel.complex.jaxb.MappingSubTaskDefType
{


}
