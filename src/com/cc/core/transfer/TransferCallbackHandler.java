/**
 * TransferCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.1  Built on : Feb 20, 2016 (10:01:29 GMT)
 */
package com.cc.core.transfer;


/**
 *  TransferCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class TransferCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public TransferCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public TransferCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for transfer90To84 method
     * override this method for handling normal response from transfer90To84 operation
     */
    public void receiveResulttransfer90To84(
        com.cc.core.transfer.TransferStub.Transfer90To84Response result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from transfer90To84 operation
     */
    public void receiveErrortransfer90To84(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for transfer84To90 method
     * override this method for handling normal response from transfer84To90 operation
     */
    public void receiveResulttransfer84To90(
        com.cc.core.transfer.TransferStub.Transfer84To90Response result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from transfer84To90 operation
     */
    public void receiveErrortransfer84To90(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getDataUsingDataContract method
     * override this method for handling normal response from getDataUsingDataContract operation
     */
    public void receiveResultgetDataUsingDataContract(
        com.cc.core.transfer.TransferStub.GetDataUsingDataContractResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getDataUsingDataContract operation
     */
    public void receiveErrorgetDataUsingDataContract(java.lang.Exception e) {
    }
}
