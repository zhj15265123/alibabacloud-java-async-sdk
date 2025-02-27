// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFreeNodesRequest} extends {@link RequestModel}
 *
 * <p>ListFreeNodesRequest</p>
 */
public class ListFreeNodesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("HpnZone")
    private String hpnZone;

    @Body
    @NameInMap("MachineType")
    private String machineType;

    @Body
    @NameInMap("MaxResults")
    private Long maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    private ListFreeNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.hpnZone = builder.hpnZone;
        this.machineType = builder.machineType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFreeNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListFreeNodesRequest, Builder> {
        private String regionId; 
        private String hpnZone; 
        private String machineType; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListFreeNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.hpnZone = request.hpnZone;
            this.machineType = request.machineType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * HpnZone.
         */
        public Builder hpnZone(String hpnZone) {
            this.putBodyParameter("HpnZone", hpnZone);
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * MachineType.
         */
        public Builder machineType(String machineType) {
            this.putBodyParameter("MachineType", machineType);
            this.machineType = machineType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListFreeNodesRequest build() {
            return new ListFreeNodesRequest(this);
        } 

    } 

}
