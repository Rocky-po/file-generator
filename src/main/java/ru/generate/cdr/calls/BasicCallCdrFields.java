package ru.generate.cdr.calls;

import ru.generate.cdr.BasicCdrFields;

/**
 * Created by kosarim on 5/3/17.
 */
public abstract class BasicCallCdrFields extends BasicCdrFields {

    //    3FSP    4MSP
    private String code;
    //    7F    8M
    private String criteriaType = "24";
    //    8F    9M
    private String callType = "0";
    //    9F   10M
    private String suppServicePhase = "";
    //    10FSP  11MSP
    private String cgpnType = "";
    //    11FSP   14MSP
    private String cdpnType = "";
    //    14FSP   15MSP
    private String pnBsignCount;
    //    15FSP   16MSP
    private String cdpn;
    //    16F   17M
    private String trunkNum = "50";
    //    17F   18M
    private String tslA = "1";
    //    18F   19M
    private String tslB = "1";
    //    23F   24M
    private String priority = "2";
    //    24F   25M
    private String operationCode = "5";
    //    25F   26M
    private String serviceCode = "4294967295";
    //    26F   27M
    private String serviceDescr = "4294967295";
    //    27F   28M
    private String serviceAddCode = "4294967295";
    //    28F   29M
    private String addCode = "-1";

    String[] getBasicCallCdrFields() {
        String[] cdrFields = getBasicCdrFields();
        cdrFields[3] = getCode();
        cdrFields[7] = getCriteriaType();
        cdrFields[8] = getCallType();
        cdrFields[9] = getSuppServicePhase();
        cdrFields[10] = getCgpnType();
        cdrFields[11] = getCdpnType();
        cdrFields[14] = getPnBsignCount();
        cdrFields[15] = getCdpn();
        cdrFields[16] = getTrunkNum();
        cdrFields[17] = getTslA();
        cdrFields[18] = getTslB();
        cdrFields[23] = getPriority();
        cdrFields[24] = getOperationCode();
        cdrFields[25] = getServiceCode();
        cdrFields[26] = getServiceDescr();
        cdrFields[27] = getServiceAddCode();
        cdrFields[28] = getAddCode();
        return cdrFields;
    }

    private String getCode() {
        return code;
    }

    private String getCriteriaType() {
        return criteriaType;
    }

    private String getCallType() {
        return callType;
    }

    private String getSuppServicePhase() {
        return suppServicePhase;
    }

    private String getCgpnType() {
        return cgpnType;
    }

    private String getCdpnType() {
        return cdpnType;
    }

    private String getPnBsignCount() {
        return pnBsignCount;
    }

    private String getCdpn() {
        return cdpn;
    }

    private String getTrunkNum() {
        return trunkNum;
    }

    private String getTslA() {
        return tslA;
    }

    private String getTslB() {
        return tslB;
    }

    private String getPriority() {
        return priority;
    }

    private String getOperationCode() {
        return operationCode;
    }

    private String getServiceCode() {
        return serviceCode;
    }

    private String getServiceDescr() {
        return serviceDescr;
    }

    private String getServiceAddCode() {
        return serviceAddCode;
    }

    private String getAddCode() {
        return addCode;
    }
}
