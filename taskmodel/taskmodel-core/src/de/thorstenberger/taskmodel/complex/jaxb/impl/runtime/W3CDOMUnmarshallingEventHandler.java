//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.15 at 06:48:35 CEST 
//

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

/*
 * @(#)$Id$
 */
package de.thorstenberger.taskmodel.complex.jaxb.impl.runtime;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.sun.xml.bind.marshaller.SAX2DOMEx;

/**
 * {@link UnmarshallingEventHandler} implementation for W3C DOM.
 * 
 * @optionalRuntime
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class W3CDOMUnmarshallingEventHandler extends UnmarshallingEventHandlerAdaptor {
    private Element owner;
    
    public W3CDOMUnmarshallingEventHandler(UnmarshallingContext _ctxt) throws ParserConfigurationException, SAXException {
        super(_ctxt, new SAX2DOMEx());
    }
    
    public void enterElement(String uri, String local, String qname, Attributes atts) throws SAXException {
        super.enterElement(uri, local, qname, atts);
        if( owner==null )
            owner = ((SAX2DOMEx)handler).getCurrentElement();
    }

    public Object owner() {
        return owner;
    }
    public Element getOwner() {
        return owner;
    }
}
