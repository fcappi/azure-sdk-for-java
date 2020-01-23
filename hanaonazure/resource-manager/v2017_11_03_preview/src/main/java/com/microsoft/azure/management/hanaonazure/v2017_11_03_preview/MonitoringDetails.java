/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details needed to monitor a Hana Instance.
 */
public class MonitoringDetails {
    /**
     * ARM ID of an Azure Subnet with access to the HANA instance.
     */
    @JsonProperty(value = "hanaSubnet")
    private String hanaSubnet;

    /**
     * Hostname of the HANA Instance blade.
     */
    @JsonProperty(value = "hanaHostname")
    private String hanaHostname;

    /**
     * Name of the database itself.
     */
    @JsonProperty(value = "hanaDbName")
    private String hanaDbName;

    /**
     * The port number of the tenant DB. Used to connect to the DB.
     */
    @JsonProperty(value = "hanaDbSqlPort")
    private Integer hanaDbSqlPort;

    /**
     * Username for the HANA database to login to for monitoring.
     */
    @JsonProperty(value = "hanaDbUsername")
    private String hanaDbUsername;

    /**
     * Password for the HANA database to login for monitoring.
     */
    @JsonProperty(value = "hanaDbPassword")
    private String hanaDbPassword;

    /**
     * Get aRM ID of an Azure Subnet with access to the HANA instance.
     *
     * @return the hanaSubnet value
     */
    public String hanaSubnet() {
        return this.hanaSubnet;
    }

    /**
     * Set aRM ID of an Azure Subnet with access to the HANA instance.
     *
     * @param hanaSubnet the hanaSubnet value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaSubnet(String hanaSubnet) {
        this.hanaSubnet = hanaSubnet;
        return this;
    }

    /**
     * Get hostname of the HANA Instance blade.
     *
     * @return the hanaHostname value
     */
    public String hanaHostname() {
        return this.hanaHostname;
    }

    /**
     * Set hostname of the HANA Instance blade.
     *
     * @param hanaHostname the hanaHostname value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaHostname(String hanaHostname) {
        this.hanaHostname = hanaHostname;
        return this;
    }

    /**
     * Get name of the database itself.
     *
     * @return the hanaDbName value
     */
    public String hanaDbName() {
        return this.hanaDbName;
    }

    /**
     * Set name of the database itself.
     *
     * @param hanaDbName the hanaDbName value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaDbName(String hanaDbName) {
        this.hanaDbName = hanaDbName;
        return this;
    }

    /**
     * Get the port number of the tenant DB. Used to connect to the DB.
     *
     * @return the hanaDbSqlPort value
     */
    public Integer hanaDbSqlPort() {
        return this.hanaDbSqlPort;
    }

    /**
     * Set the port number of the tenant DB. Used to connect to the DB.
     *
     * @param hanaDbSqlPort the hanaDbSqlPort value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaDbSqlPort(Integer hanaDbSqlPort) {
        this.hanaDbSqlPort = hanaDbSqlPort;
        return this;
    }

    /**
     * Get username for the HANA database to login to for monitoring.
     *
     * @return the hanaDbUsername value
     */
    public String hanaDbUsername() {
        return this.hanaDbUsername;
    }

    /**
     * Set username for the HANA database to login to for monitoring.
     *
     * @param hanaDbUsername the hanaDbUsername value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaDbUsername(String hanaDbUsername) {
        this.hanaDbUsername = hanaDbUsername;
        return this;
    }

    /**
     * Get password for the HANA database to login for monitoring.
     *
     * @return the hanaDbPassword value
     */
    public String hanaDbPassword() {
        return this.hanaDbPassword;
    }

    /**
     * Set password for the HANA database to login for monitoring.
     *
     * @param hanaDbPassword the hanaDbPassword value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaDbPassword(String hanaDbPassword) {
        this.hanaDbPassword = hanaDbPassword;
        return this;
    }

}