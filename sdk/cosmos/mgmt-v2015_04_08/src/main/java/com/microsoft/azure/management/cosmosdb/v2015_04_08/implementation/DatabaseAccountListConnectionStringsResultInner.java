/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabaseAccountConnectionString;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection strings for the given database account.
 */
public class DatabaseAccountListConnectionStringsResultInner {
    /**
     * An array that contains the connection strings for the Cosmos DB account.
     */
    @JsonProperty(value = "connectionStrings")
    private List<DatabaseAccountConnectionString> connectionStrings;

    /**
     * Get an array that contains the connection strings for the Cosmos DB account.
     *
     * @return the connectionStrings value
     */
    public List<DatabaseAccountConnectionString> connectionStrings() {
        return this.connectionStrings;
    }

    /**
     * Set an array that contains the connection strings for the Cosmos DB account.
     *
     * @param connectionStrings the connectionStrings value to set
     * @return the DatabaseAccountListConnectionStringsResultInner object itself.
     */
    public DatabaseAccountListConnectionStringsResultInner withConnectionStrings(List<DatabaseAccountConnectionString> connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }

}