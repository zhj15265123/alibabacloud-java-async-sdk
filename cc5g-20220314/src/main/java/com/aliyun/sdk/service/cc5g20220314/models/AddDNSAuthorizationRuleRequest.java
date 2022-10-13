// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDNSAuthorizationRuleRequest} extends {@link RequestModel}
 *
 * <p>AddDNSAuthorizationRuleRequest</p>
 */
public class AddDNSAuthorizationRuleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestinationIp")
    private String destinationIp;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("SourceDNSIp")
    @Validation(required = true)
    private String sourceDNSIp;

    @Query
    @NameInMap("WirelessCloudConnectorId")
    @Validation(required = true)
    private String wirelessCloudConnectorId;

    private AddDNSAuthorizationRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destinationIp = builder.destinationIp;
        this.dryRun = builder.dryRun;
        this.name = builder.name;
        this.sourceDNSIp = builder.sourceDNSIp;
        this.wirelessCloudConnectorId = builder.wirelessCloudConnectorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDNSAuthorizationRuleRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceDNSIp
     */
    public String getSourceDNSIp() {
        return this.sourceDNSIp;
    }

    /**
     * @return wirelessCloudConnectorId
     */
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static final class Builder extends Request.Builder<AddDNSAuthorizationRuleRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String destinationIp; 
        private Boolean dryRun; 
        private String name; 
        private String sourceDNSIp; 
        private String wirelessCloudConnectorId; 

        private Builder() {
            super();
        } 

        private Builder(AddDNSAuthorizationRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destinationIp = request.destinationIp;
            this.dryRun = request.dryRun;
            this.name = request.name;
            this.sourceDNSIp = request.sourceDNSIp;
            this.wirelessCloudConnectorId = request.wirelessCloudConnectorId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SourceDNSIp.
         */
        public Builder sourceDNSIp(String sourceDNSIp) {
            this.putQueryParameter("SourceDNSIp", sourceDNSIp);
            this.sourceDNSIp = sourceDNSIp;
            return this;
        }

        /**
         * WirelessCloudConnectorId.
         */
        public Builder wirelessCloudConnectorId(String wirelessCloudConnectorId) {
            this.putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
            this.wirelessCloudConnectorId = wirelessCloudConnectorId;
            return this;
        }

        @Override
        public AddDNSAuthorizationRuleRequest build() {
            return new AddDNSAuthorizationRuleRequest(this);
        } 

    } 

}
