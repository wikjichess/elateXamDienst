//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.2-b15-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.10.15 at 06:48:35 CEST 
//


package de.thorstenberger.taskmodel.complex.jaxb.impl;

public class AnyTypeImpl implements de.thorstenberger.taskmodel.complex.jaxb.AnyType, java.io.Serializable, com.sun.xml.bind.JAXBObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallableObject, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializable, de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.ValidatableObject
{

    private final static long serialVersionUID = 1L;
    protected com.sun.xml.bind.util.ListImpl _Content = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
    public final static java.lang.Class version = (de.thorstenberger.taskmodel.complex.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (de.thorstenberger.taskmodel.complex.jaxb.AnyType.class);
    }

    public java.util.List getContent() {
        return _Content;
    }

    public boolean isSetContent() {
        return _Content.isModified();
    }

    public void unsetContent() {
        _Content.clear();
        _Content.setModified(false);
    }

    public de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingEventHandler createUnmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
        return new de.thorstenberger.taskmodel.complex.jaxb.impl.AnyTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Content.size();
        while (idx1 != len1) {
            {
                java.lang.Object o = _Content.get(idx1);
                if (o instanceof java.lang.String) {
                    try {
                        context.text(((java.lang.String) _Content.get(idx1 ++)), "Content");
                    } catch (java.lang.Exception e) {
                        de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
                    }
                } else {
                    if (o instanceof java.lang.Object) {
                        context.childAsBody(((com.sun.xml.bind.JAXBObject) _Content.get(idx1 ++)), "Content");
                    } else {
                        throw new org.xml.sax.SAXException("type mismatch error");
                    }
                }
            }
        }
    }

    public void serializeAttributes(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Content.size();
        while (idx1 != len1) {
            {
                java.lang.Object o = _Content.get(idx1);
                if (o instanceof java.lang.String) {
                    try {
                        idx1 += 1;
                    } catch (java.lang.Exception e) {
                        de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
                    }
                } else {
                    if (o instanceof java.lang.Object) {
                        idx1 += 1;
                    } else {
                        throw new org.xml.sax.SAXException("type mismatch error");
                    }
                }
            }
        }
    }

    public void serializeURIs(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = _Content.size();
        while (idx1 != len1) {
            {
                java.lang.Object o = _Content.get(idx1);
                if (o instanceof java.lang.String) {
                    try {
                        idx1 += 1;
                    } catch (java.lang.Exception e) {
                        de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.Util.handlePrintConversionException(this, e, context);
                    }
                } else {
                    if (o instanceof java.lang.Object) {
                        idx1 += 1;
                    } else {
                        throw new org.xml.sax.SAXException("type mismatch error");
                    }
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (de.thorstenberger.taskmodel.complex.jaxb.AnyType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001ccom.sun.msv.grammar.MixedExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.m"
+"sv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expt\u0000 Lcom/sun/msv/grammar/"
+"Expression;xr\u0000\u001ecom.sun.msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0003I\u0000\u000ec"
+"achedHashCodeL\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xp\u0000\u00f3\u0004\u00c2ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q"
+"\u0000~\u0000\u0002L\u0000\u0004exp2q\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00f3\u0004\u00b6ppsr\u0000 com.sun.msv.grammar.OneOrMor"
+"eExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001\u0000\u00f3\u0004\u00absr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005"
+"valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun"
+".msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttribu"
+"tesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003\u0000\u00f3\u0004\u00a8q\u0000~\u0000\fp\u0000sr\u0000 com.sun.msv.gram"
+"mar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u000exq\u0000~\u0000"
+"\u0003\u0000\u00f3\u0004\u009dppsr\u00002com.sun.msv.grammar.Expression$AnyStringExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\bsq\u0000~\u0000\u000b\u0001q\u0000~\u0000\u0014sr\u0000 com.sun.msv.grammar.An"
+"yNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xpsr\u0000&com.sun.msv.grammar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001"
+"L\u0000\fnamespaceURIt\u0000\u0012Ljava/lang/String;xq\u0000~\u0000\u0017t\u0000+http://java.sun"
+".com/jaxb/xjc/dummy-elementssr\u00000com.sun.msv.grammar.Expressi"
+"on$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003\u0000\u0000\u0000\tq\u0000~\u0000\u0015psr\u0000\"com.sun.m"
+"sv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/m"
+"sv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.gramm"
+"ar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0002\u0000\u0004I\u0000\u0005countI\u0000\tthresholdL"
+"\u0000\u0006parentq\u0000~\u0000 [\u0000\u0005tablet\u0000![Lcom/sun/msv/grammar/Expression;xp\u0000"
+"\u0000\u0000\u0003\u0000\u0000\u00009pur\u0000![Lcom.sun.msv.grammar.Expression;\u00d68D\u00c3]\u00ad\u00a7\n\u0002\u0000\u0000xp\u0000\u0000"
+"\u0000\u00bfpppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
+"pppppppppppppppppppppppppppppppppppppppppq\u0000~\u0000\nppppppppppq\u0000~\u0000"
+"\bpppppppppppq\u0000~\u0000\u0005ppppppppppppppppppppppppppppppppppppppppppp"
+"ppppppppppppppppppppppppp"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context) {
            super(context, "-");
        }

        protected Unmarshaller(de.thorstenberger.taskmodel.complex.jaxb.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return de.thorstenberger.taskmodel.complex.jaxb.impl.AnyTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (true) {
                            java.lang.Object co = spawnWildcard(0, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _Content.add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  0 :
                            eatText1(value);
                            state = 0;
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _Content.add(value);
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

    }

}
