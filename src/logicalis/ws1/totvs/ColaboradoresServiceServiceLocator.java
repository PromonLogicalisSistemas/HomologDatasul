/**
 * ColaboradoresServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package logicalis.ws1.totvs;

public class ColaboradoresServiceServiceLocator extends org.apache.axis.client.Service implements logicalis.ws1.totvs.ColaboradoresServiceService {

    public ColaboradoresServiceServiceLocator() {
    }


    public ColaboradoresServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ColaboradoresServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ColaboradoresServiceObj
    private java.lang.String ColaboradoresServiceObj_address = "https://br1nidbm002:8080/wsa/wsa1";

    public java.lang.String getColaboradoresServiceObjAddress() {
        return ColaboradoresServiceObj_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ColaboradoresServiceObjWSDDServiceName = "ColaboradoresServiceObj";

    public java.lang.String getColaboradoresServiceObjWSDDServiceName() {
        return ColaboradoresServiceObjWSDDServiceName;
    }

    public void setColaboradoresServiceObjWSDDServiceName(java.lang.String name) {
        ColaboradoresServiceObjWSDDServiceName = name;
    }

    public logicalis.ws1.totvs.ColaboradoresServiceObj getColaboradoresServiceObj() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ColaboradoresServiceObj_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getColaboradoresServiceObj(endpoint);
    }

    public logicalis.ws1.totvs.ColaboradoresServiceObj getColaboradoresServiceObj(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            logicalis.ws1.totvs.ColaboradoresServiceObjStub _stub = new logicalis.ws1.totvs.ColaboradoresServiceObjStub(portAddress, this);
            _stub.setPortName(getColaboradoresServiceObjWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setColaboradoresServiceObjEndpointAddress(java.lang.String address) {
        ColaboradoresServiceObj_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (logicalis.ws1.totvs.ColaboradoresServiceObj.class.isAssignableFrom(serviceEndpointInterface)) {
                logicalis.ws1.totvs.ColaboradoresServiceObjStub _stub = new logicalis.ws1.totvs.ColaboradoresServiceObjStub(new java.net.URL(ColaboradoresServiceObj_address), this);
                _stub.setPortName(getColaboradoresServiceObjWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ColaboradoresServiceObj".equals(inputPortName)) {
            return getColaboradoresServiceObj();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:totvs:ws1:logicalis", "ColaboradoresServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:totvs:ws1:logicalis", "ColaboradoresServiceObj"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ColaboradoresServiceObj".equals(portName)) {
            setColaboradoresServiceObjEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
