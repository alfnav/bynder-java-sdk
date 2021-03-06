/*
 * Copyright (c) 2017 Bynder B.V. All rights reserved.
 *
 * Licensed under the MIT License. See LICENSE file in the project root for full license
 * information.
 */
package com.bynder.sdk.query;

import com.bynder.sdk.query.decoder.ApiField;

/**
 * Query to create asset usage.
 */
public class UsageCreateQuery {

    /**
     * Id of the integration.
     */
    @ApiField(name = "integration_id")
    private final String integrationId;
    /**
     * Id of the asset.
     */
    @ApiField(name = "asset_id")
    private final String assetId;
    /**
     * Timestamp of the asset usage creation.
     */
    @ApiField
    private String timestamp;
    /**
     * URI with the location of the asset in the integration.
     */
    @ApiField(name = "uri")
    private String location;
    /**
     * Additional information about the asset usage.
     */
    @ApiField
    private String additional;

    public UsageCreateQuery(final String integrationId, final String assetId) {
        this.integrationId = integrationId;
        this.assetId = assetId;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public UsageCreateQuery setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public UsageCreateQuery setLocation(final String location) {
        this.location = location;
        return this;
    }

    public String getAdditional() {
        return additional;
    }

    public UsageCreateQuery setAdditional(final String additional) {
        this.additional = additional;
        return this;
    }
}
