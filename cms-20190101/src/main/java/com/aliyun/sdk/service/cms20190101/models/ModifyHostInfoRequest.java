// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHostInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyHostInfoRequest</p>
 */
public class ModifyHostInfoRequest extends Request {
    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ModifyHostInfoRequest(Builder builder) {
        super(builder);
        this.hostName = builder.hostName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHostInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyHostInfoRequest, Builder> {
        private String hostName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHostInfoRequest request) {
            super(request);
            this.hostName = request.hostName;
            this.instanceId = request.instanceId;
        } 

        /**
         * The name of the host.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The ID of the instance. Only hosts not on Alibaba Cloud are supported.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyHostInfoRequest build() {
            return new ModifyHostInfoRequest(this);
        } 

    } 

}
