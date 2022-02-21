// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteHTTPRewriteRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteHTTPRewriteRequest</p>
 */
public class UpdateGatewayRouteHTTPRewriteRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    private Long gatewayId;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("HttpRewriteJSON")
    private String httpRewriteJSON;

    @Query
    @NameInMap("Id")
    private Long id;

    private UpdateGatewayRouteHTTPRewriteRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.httpRewriteJSON = builder.httpRewriteJSON;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteHTTPRewriteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return httpRewriteJSON
     */
    public String getHttpRewriteJSON() {
        return this.httpRewriteJSON;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteHTTPRewriteRequest, Builder> {
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private String httpRewriteJSON; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteHTTPRewriteRequest response) {
            super(response);
            this.gatewayId = response.gatewayId;
            this.gatewayUniqueId = response.gatewayUniqueId;
            this.httpRewriteJSON = response.httpRewriteJSON;
            this.id = response.id;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
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
         * HttpRewriteJSON.
         */
        public Builder httpRewriteJSON(String httpRewriteJSON) {
            this.putQueryParameter("HttpRewriteJSON", httpRewriteJSON);
            this.httpRewriteJSON = httpRewriteJSON;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateGatewayRouteHTTPRewriteRequest build() {
            return new UpdateGatewayRouteHTTPRewriteRequest(this);
        } 

    } 

}
