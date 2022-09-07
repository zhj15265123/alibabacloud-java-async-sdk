// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupIpMappingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupIpMappingRuleRequest</p>
 */
public class CreateGroupIpMappingRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DestinationIp")
    @Validation(required = true)
    private String destinationIp;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("IoTCloudConnectorGroupId")
    @Validation(required = true)
    private String ioTCloudConnectorGroupId;

    @Query
    @NameInMap("IpMappingRuleDescription")
    private String ipMappingRuleDescription;

    @Query
    @NameInMap("IpMappingRuleName")
    private String ipMappingRuleName;

    @Query
    @NameInMap("MappingIp")
    @Validation(required = true)
    private String mappingIp;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateGroupIpMappingRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationIp = builder.destinationIp;
        this.dryRun = builder.dryRun;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.ipMappingRuleDescription = builder.ipMappingRuleDescription;
        this.ipMappingRuleName = builder.ipMappingRuleName;
        this.mappingIp = builder.mappingIp;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupIpMappingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return destinationIp
     */
    public String getDestinationIp() {
        return this.destinationIp;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    /**
     * @return ipMappingRuleDescription
     */
    public String getIpMappingRuleDescription() {
        return this.ipMappingRuleDescription;
    }

    /**
     * @return ipMappingRuleName
     */
    public String getIpMappingRuleName() {
        return this.ipMappingRuleName;
    }

    /**
     * @return mappingIp
     */
    public String getMappingIp() {
        return this.mappingIp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateGroupIpMappingRuleRequest, Builder> {
        private String clientToken; 
        private String destinationIp; 
        private Boolean dryRun; 
        private String ioTCloudConnectorGroupId; 
        private String ipMappingRuleDescription; 
        private String ipMappingRuleName; 
        private String mappingIp; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupIpMappingRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationIp = request.destinationIp;
            this.dryRun = request.dryRun;
            this.ioTCloudConnectorGroupId = request.ioTCloudConnectorGroupId;
            this.ipMappingRuleDescription = request.ipMappingRuleDescription;
            this.ipMappingRuleName = request.ipMappingRuleName;
            this.mappingIp = request.mappingIp;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DestinationIp.
         */
        public Builder destinationIp(String destinationIp) {
            this.putQueryParameter("DestinationIp", destinationIp);
            this.destinationIp = destinationIp;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }

        /**
         * IpMappingRuleDescription.
         */
        public Builder ipMappingRuleDescription(String ipMappingRuleDescription) {
            this.putQueryParameter("IpMappingRuleDescription", ipMappingRuleDescription);
            this.ipMappingRuleDescription = ipMappingRuleDescription;
            return this;
        }

        /**
         * IpMappingRuleName.
         */
        public Builder ipMappingRuleName(String ipMappingRuleName) {
            this.putQueryParameter("IpMappingRuleName", ipMappingRuleName);
            this.ipMappingRuleName = ipMappingRuleName;
            return this;
        }

        /**
         * MappingIp.
         */
        public Builder mappingIp(String mappingIp) {
            this.putQueryParameter("MappingIp", mappingIp);
            this.mappingIp = mappingIp;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateGroupIpMappingRuleRequest build() {
            return new CreateGroupIpMappingRuleRequest(this);
        } 

    } 

}
