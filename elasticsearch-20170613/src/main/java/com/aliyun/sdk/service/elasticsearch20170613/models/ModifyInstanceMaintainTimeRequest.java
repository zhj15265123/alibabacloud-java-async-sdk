// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceMaintainTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceMaintainTimeRequest</p>
 */
public class ModifyInstanceMaintainTimeRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("body")
    private String body;

    private ModifyInstanceMaintainTimeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceMaintainTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceMaintainTimeRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceMaintainTimeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.body = request.body;
        } 

        /**
         * es-cn-n6w1o1x0w001c\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceMaintainTimeRequest build() {
            return new ModifyInstanceMaintainTimeRequest(this);
        } 

    } 

}
