// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAdminPasswordRequest} extends {@link RequestModel}
 *
 * <p>UpdateAdminPasswordRequest</p>
 */
public class UpdateAdminPasswordRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("esAdminPassword")
    @Validation(maxLength = 32, minLength = 8)
    private String esAdminPassword;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    private UpdateAdminPasswordRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.esAdminPassword = builder.esAdminPassword;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAdminPasswordRequest create() {
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
     * @return esAdminPassword
     */
    public String getEsAdminPassword() {
        return this.esAdminPassword;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateAdminPasswordRequest, Builder> {
        private String instanceId; 
        private String esAdminPassword; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAdminPasswordRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.esAdminPassword = request.esAdminPassword;
            this.clientToken = request.clientToken;
        } 

        /**
         * es-cn-nif1q9o8r0008\*\*\*\*
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Elasticsearch实例的elastic账号的密码。
         */
        public Builder esAdminPassword(String esAdminPassword) {
            this.putBodyParameter("esAdminPassword", esAdminPassword);
            this.esAdminPassword = esAdminPassword;
            return this;
        }

        /**
         * 5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateAdminPasswordRequest build() {
            return new UpdateAdminPasswordRequest(this);
        } 

    } 

}
