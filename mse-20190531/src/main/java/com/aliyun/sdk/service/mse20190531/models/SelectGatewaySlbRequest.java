// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SelectGatewaySlbRequest} extends {@link RequestModel}
 *
 * <p>SelectGatewaySlbRequest</p>
 */
public class SelectGatewaySlbRequest extends Request {
    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Type")
    private String type;

    private SelectGatewaySlbRequest(Builder builder) {
        super(builder);
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectGatewaySlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SelectGatewaySlbRequest, Builder> {
        private String gatewayUniqueId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SelectGatewaySlbRequest response) {
            super(response);
            this.gatewayUniqueId = response.gatewayUniqueId;
            this.name = response.name;
            this.type = response.type;
        } 

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SelectGatewaySlbRequest build() {
            return new SelectGatewaySlbRequest(this);
        } 

    } 

}
