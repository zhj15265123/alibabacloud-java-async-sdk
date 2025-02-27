// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateXpackMonitorConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateXpackMonitorConfigRequest</p>
 */
public class UpdateXpackMonitorConfigRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("enable")
    private Boolean enable;

    @Body
    @NameInMap("endpoints")
    private java.util.List < String > endpoints;

    @Body
    @NameInMap("password")
    private String password;

    @Body
    @NameInMap("userName")
    private String userName;

    private UpdateXpackMonitorConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.enable = builder.enable;
        this.endpoints = builder.endpoints;
        this.password = builder.password;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateXpackMonitorConfigRequest create() {
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
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return endpoints
     */
    public java.util.List < String > getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<UpdateXpackMonitorConfigRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private Boolean enable; 
        private java.util.List < String > endpoints; 
        private String password; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateXpackMonitorConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.enable = request.enable;
            this.endpoints = request.endpoints;
            this.password = request.password;
            this.userName = request.userName;
        } 

        /**
         * ls-cn-oew1qbgl\*\*\*\*
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
         * xpack 监控是否启用。设置为false时，无需设置其他参数
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Elasticsearch实例的访问地址。
         */
        public Builder endpoints(java.util.List < String > endpoints) {
            this.putBodyParameter("endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Elasticsearch实例的访问密码。
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * Elasticsearch实例的用户名。
         */
        public Builder userName(String userName) {
            this.putBodyParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public UpdateXpackMonitorConfigRequest build() {
            return new UpdateXpackMonitorConfigRequest(this);
        } 

    } 

}
