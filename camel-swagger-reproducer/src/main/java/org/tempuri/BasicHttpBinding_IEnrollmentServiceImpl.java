
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.tempuri;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-01-27T15:53:44.730+05:30
 * Generated source version: 3.1.4
 * 
 */

@javax.jws.WebService(
                      serviceName = "EnrollmentService",
                      portName = "BasicHttpBinding_IEnrollmentService",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "file:/C:/Users/satish-s/workspace/SoapConsumeTest/src/main/resources/wsdl/HITS/HITS.wsdl",
                      endpointInterface = "org.tempuri.IEnrollmentService")
                      
public class BasicHttpBinding_IEnrollmentServiceImpl implements IEnrollmentService {

    private static final Logger LOG = Logger.getLogger(BasicHttpBinding_IEnrollmentServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#cancelCoverage(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrolledEquipment  enrolledEquipment ,)java.lang.Integer  cancelReason ,)java.lang.String  cancelDate ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result cancelCoverage(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrolledEquipment enrolledEquipment,java.lang.Integer cancelReason,java.lang.String cancelDate,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation cancelCoverage");
        System.out.println(accountNumber);
        System.out.println(enrolledEquipment);
        System.out.println(cancelReason);
        System.out.println(cancelDate);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#selectServicePlan(java.lang.Integer  clientId )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.ServicePlanResult selectServicePlan(java.lang.Integer clientId) { 
        LOG.info("Executing operation selectServicePlan");
        System.out.println(clientId);
        try {
            org.datacontract.schemas._2004._07.integrationservice.ServicePlanResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#getServicePlanDetailAndSku(java.lang.Integer  clientId ,)java.lang.Integer  phoneFlag ,)java.lang.String  featureCode ,)java.lang.String  productDescription )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.ServicePlanDetailResult getServicePlanDetailAndSku(java.lang.Integer clientId,java.lang.Integer phoneFlag,java.lang.String featureCode,java.lang.String productDescription) { 
        LOG.info("Executing operation getServicePlanDetailAndSku");
        System.out.println(clientId);
        System.out.println(phoneFlag);
        System.out.println(featureCode);
        System.out.println(productDescription);
        try {
            org.datacontract.schemas._2004._07.integrationservice.ServicePlanDetailResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#selectResultCodes(*
     */
    public org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrollmentResultCode selectResultCodes() { 
        LOG.info("Executing operation selectResultCodes");
        try {
            org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrollmentResultCode _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#resume(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrolledEquipment  enrolledEquipment ,)java.lang.String  resumeDate ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result resume(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrolledEquipment enrolledEquipment,java.lang.String resumeDate,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation resume");
        System.out.println(accountNumber);
        System.out.println(enrolledEquipment);
        System.out.println(resumeDate);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#changeServicePlan(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfServicePlanChange  servicePlanChange ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result changeServicePlan(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfServicePlanChange servicePlanChange,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation changeServicePlan");
        System.out.println(accountNumber);
        System.out.println(servicePlanChange);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#changeAccountNumber(org.datacontract.schemas._2004._07.integrationservice.AccountNumberChange  accountNumberChange ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result changeAccountNumber(org.datacontract.schemas._2004._07.integrationservice.AccountNumberChange accountNumberChange,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation changeAccountNumber");
        System.out.println(accountNumberChange);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#enroll(org.datacontract.schemas._2004._07.integrationservice.Customer  customer ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipment  equipment ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment  payment ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result enroll(org.datacontract.schemas._2004._07.integrationservice.Customer customer,org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipment equipment,org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment payment,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation enroll");
        System.out.println(customer);
        System.out.println(equipment);
        System.out.println(payment);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#changeEquipment(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipmentChange  equipmentChange ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result changeEquipment(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipmentChange equipmentChange,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation changeEquipment");
        System.out.println(accountNumber);
        System.out.println(equipmentChange);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#changePhoneNumber(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfPhoneNumberChange  phoneNumberChange ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result changePhoneNumber(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfPhoneNumberChange phoneNumberChange,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation changePhoneNumber");
        System.out.println(accountNumber);
        System.out.println(phoneNumberChange);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#selectSku(java.lang.Integer  clientId )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.ModelResult selectSku(java.lang.Integer clientId) { 
        LOG.info("Executing operation selectSku");
        System.out.println(clientId);
        try {
            org.datacontract.schemas._2004._07.integrationservice.ModelResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#getServicePlanDetails(java.lang.Integer  clientId ,)java.lang.Integer  servicePlanId )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.ServicePlanDetailResult getServicePlanDetails(java.lang.Integer clientId,java.lang.Integer servicePlanId) { 
        LOG.info("Executing operation getServicePlanDetails");
        System.out.println(clientId);
        System.out.println(servicePlanId);
        try {
            org.datacontract.schemas._2004._07.integrationservice.ServicePlanDetailResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#suspend(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrolledEquipment  enrolledEquipment ,)java.lang.Integer  suspendReason ,)java.lang.String  suspendDate ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result suspend(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfEnrolledEquipment enrolledEquipment,java.lang.Integer suspendReason,java.lang.String suspendDate,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation suspend");
        System.out.println(accountNumber);
        System.out.println(enrolledEquipment);
        System.out.println(suspendReason);
        System.out.println(suspendDate);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#changeCustomerInformation(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfCustomerChange  customerChange ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result changeCustomerInformation(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfCustomerChange customerChange,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation changeCustomerInformation");
        System.out.println(accountNumber);
        System.out.println(customerChange);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#transferEquipment(org.datacontract.schemas._2004._07.integrationservice.AccountNumberChange  accountNumberChange ,)org.datacontract.schemas._2004._07.integrationservice.Customer  newCustomer ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipmentChange  equipmentChange ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment  payment ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result transferEquipment(org.datacontract.schemas._2004._07.integrationservice.AccountNumberChange accountNumberChange,org.datacontract.schemas._2004._07.integrationservice.Customer newCustomer,org.datacontract.schemas._2004._07.integrationservice.ArrayOfEquipmentChange equipmentChange,org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment payment,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation transferEquipment");
        System.out.println(accountNumberChange);
        System.out.println(newCustomer);
        System.out.println(equipmentChange);
        System.out.println(payment);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#changeCustomerAccountNumber(java.lang.String  newAccountNumber ,)java.lang.String  phoneNumber ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result changeCustomerAccountNumber(java.lang.String newAccountNumber,java.lang.String phoneNumber,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation changeCustomerAccountNumber");
        System.out.println(newAccountNumber);
        System.out.println(phoneNumber);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.tempuri.IEnrollmentService#updatePayment(java.lang.String  accountNumber ,)org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment  payment ,)org.datacontract.schemas._2004._07.integrationservice.ChannelInformation  channelInformation )*
     */
    public org.datacontract.schemas._2004._07.integrationservice.Result updatePayment(java.lang.String accountNumber,org.datacontract.schemas._2004._07.integrationservice.ArrayOfPayment payment,org.datacontract.schemas._2004._07.integrationservice.ChannelInformation channelInformation) { 
        LOG.info("Executing operation updatePayment");
        System.out.println(accountNumber);
        System.out.println(payment);
        System.out.println(channelInformation);
        try {
            org.datacontract.schemas._2004._07.integrationservice.Result _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
