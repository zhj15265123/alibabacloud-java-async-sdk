// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEngineNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateEngineNamespaceRequest</p>
 */
public class CreateEngineNamespaceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ServiceCount")
    private Integer serviceCount;

    private CreateEngineNamespaceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.desc = builder.desc;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.serviceCount = builder.serviceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEngineNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return serviceCount
     */
    public Integer getServiceCount() {
        return this.serviceCount;
    }

    public static final class Builder extends Request.Builder<CreateEngineNamespaceRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String desc; 
        private String instanceId; 
        private String name; 
        private Integer serviceCount; 

        private Builder() {
            super();
        } 

        private Builder(CreateEngineNamespaceRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.clusterId = response.clusterId;
            this.desc = response.desc;
            this.instanceId = response.instanceId;
            this.name = response.name;
            this.serviceCount = response.serviceCount;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * ServiceCount.
         */
        public Builder serviceCount(Integer serviceCount) {
            this.putQueryParameter("ServiceCount", serviceCount);
            this.serviceCount = serviceCount;
            return this;
        }

        @Override
        public CreateEngineNamespaceRequest build() {
            return new CreateEngineNamespaceRequest(this);
        } 

    } 

}
