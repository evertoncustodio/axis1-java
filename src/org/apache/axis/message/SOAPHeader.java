/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 2001 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Axis" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.axis.message;

import org.apache.axis.Constants;
import org.apache.axis.encoding.DeserializationContext;
import org.apache.axis.encoding.SerializationContext;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

import javax.xml.rpc.namespace.QName;

/** A simple header abstraction.  Extends MessageElement with header-specific
 * stuff like mustUnderstand, actor, and a 'processed' flag.
 *
 * @author Glen Daniels (gdaniels@macromedia.com)
 *
 */
public class SOAPHeader extends MessageElement {
    protected boolean   processed = false;

    protected String    actor;
    protected boolean   mustUnderstand = false;

    public SOAPHeader() {
    }

    public SOAPHeader(String namespace, String localPart)
    {
        setNamespaceURI(namespace);
        setName(localPart);
    }

    public SOAPHeader(String namespace, String localPart, Object value)
    {
        setNamespaceURI(namespace);
        setName(localPart);
        setObjectValue(value);
    }

    public SOAPHeader(Element elem)
    {
        super(elem);
        String val = elem.getAttributeNS(Constants.URI_SOAP_ENV,
                                         Constants.ATTR_MUST_UNDERSTAND);
        mustUnderstand = ((val != null) && val.equals("1")) ? true : false;

        actor = elem.getAttributeNS(Constants.URI_SOAP_ENV,
                                    Constants.ATTR_ACTOR);
    }

    public SOAPHeader(String namespace, String localPart, String prefix,
                      Attributes attributes, DeserializationContext context) {
        super(namespace, localPart, prefix, attributes, context);

        // Check for mustUnderstand
        String val = attributes.getValue(Constants.URI_SOAP_ENV,
                                         Constants.ATTR_MUST_UNDERSTAND);
        mustUnderstand = ((val != null) && val.equals("1")) ? true : false;

        actor = attributes.getValue(Constants.URI_SOAP_ENV,
                                    Constants.ATTR_ACTOR);

        processed = false;
    }

    public boolean isMustUnderstand() { return( mustUnderstand ); }
    public void setMustUnderstand(boolean b) {
        mustUnderstand = b ;
        String val = b ? "1" : "0";
        setAttribute(Constants.URI_SOAP_ENV,
                     Constants.ATTR_MUST_UNDERSTAND,
                     val);
    }

    public String getActor() { return( actor ); }
    public void setActor(String a) {
        actor = a ;
        setAttribute(Constants.URI_SOAP_ENV, Constants.ATTR_ACTOR, a);
    }

    public void setProcessed(boolean value) {
        processed = value ;
    }

    public boolean isProcessed() {
        return( processed );
    }

    protected void outputImpl(SerializationContext context) throws Exception {
        Object value = getObjectValue();
        if (value == null) {
            super.outputImpl(context);
        } else {
            context.serialize(new QName(namespaceURI,name),
                              attributes, 
                              value, 
                              value.getClass() );
        }
    }
}
