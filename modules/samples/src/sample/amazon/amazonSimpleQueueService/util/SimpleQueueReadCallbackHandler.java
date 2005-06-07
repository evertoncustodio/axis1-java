/*
* Copyright 2004,2005 The Apache Software Foundation.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package sample.amazon.amazonSimpleQueueService.util;

import org.apache.axis.clientapi.AsyncResult;
import org.apache.axis.clientapi.Callback;
import org.apache.axis.om.OMElement;
import org.apache.axis.om.OMNode;
import org.apache.axis.soap.SOAPBody;

import javax.swing.*;
import java.util.Iterator;
/**
 * Callback class which deals with the outcome of the operation
 * @author Saminda Abeyruwan <saminda@opensource.lk>
 *
 */
public class SimpleQueueReadCallbackHandler extends Callback {
    private String returnString = "";
    JTextField queueCode;
    JTextArea results;
    public SimpleQueueReadCallbackHandler(){}//defalut handler
    public SimpleQueueReadCallbackHandler(JTextField queueCode, JTextArea results){
        super();
        this.queueCode = queueCode;
        this.results = results;
    }
    public void onComplete(AsyncResult result) {
        SOAPBody body = result.getResponseEnvelope().getBody();
        this.getQueueEntryBody(body);
    }
    public void reportError(Exception e) {

    }
    private void getQueueEntryBody(OMElement element) {
        Iterator iterator = element.getChildren();
        while (iterator.hasNext()) {
            OMNode omNode = (OMNode) iterator.next();
            if (omNode.getType() == OMNode.ELEMENT_NODE) {
                OMElement omElement = (OMElement) omNode;
                if (omElement.getLocalName().equals("QueueEntryBody")) {
                    this.readTheQueue(omElement);
                }else{
                    getQueueEntryBody(omElement);
                }
            }
        }
    }
    private void readTheQueue(OMElement element) {
        returnString = returnString + element.getText() + "\n";
        this.results.setText(returnString + "\n");
    }
}