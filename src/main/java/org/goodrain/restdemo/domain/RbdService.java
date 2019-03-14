package org.goodrain.restdemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RbdService {
    @JsonProperty("service_id")
    private String serviceID;

    @JsonProperty("tenant_name")
    private String tenantName;

    @JsonProperty("service_alias")
    private String serviceAlias;

    @JsonProperty("region_name")
    private String regionName;

    @JsonProperty("service_cname")
    private String serviceCname;

    public RbdService() {
    }

    public RbdService(String serviceID, String tenantName, String serviceAlias, String regionName, String serviceCname) {
        this.serviceID = serviceID;
        this.tenantName = tenantName;
        this.serviceAlias = serviceAlias;
        this.regionName = regionName;
        this.serviceCname = serviceCname;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getServiceAlias() {
        return serviceAlias;
    }

    public void setServiceAlias(String serviceAlias) {
        this.serviceAlias = serviceAlias;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getServiceCname() {
        return serviceCname;
    }

    public void setServiceCname(String serviceCname) {
        this.serviceCname = serviceCname;
    }
}
