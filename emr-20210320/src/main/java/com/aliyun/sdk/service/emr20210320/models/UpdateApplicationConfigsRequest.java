// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationConfigsRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationConfigsRequest</p>
 */
public class UpdateApplicationConfigsRequest extends Request {
    @Query
    @NameInMap("ApplicationConfigs")
    @Validation(required = true)
    private java.util.List < UpdateApplicationConfig > applicationConfigs;

    @Query
    @NameInMap("ApplicationName")
    @Validation(required = true)
    private String applicationName;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ConfigAction")
    private String configAction;

    @Query
    @NameInMap("ConfigScope")
    private String configScope;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateApplicationConfigsRequest(Builder builder) {
        super(builder);
        this.applicationConfigs = builder.applicationConfigs;
        this.applicationName = builder.applicationName;
        this.clusterId = builder.clusterId;
        this.configAction = builder.configAction;
        this.configScope = builder.configScope;
        this.description = builder.description;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeId = builder.nodeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationConfigs
     */
    public java.util.List < UpdateApplicationConfig > getApplicationConfigs() {
        return this.applicationConfigs;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configAction
     */
    public String getConfigAction() {
        return this.configAction;
    }

    /**
     * @return configScope
     */
    public String getConfigScope() {
        return this.configScope;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationConfigsRequest, Builder> {
        private java.util.List < UpdateApplicationConfig > applicationConfigs; 
        private String applicationName; 
        private String clusterId; 
        private String configAction; 
        private String configScope; 
        private String description; 
        private String nodeGroupId; 
        private String nodeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationConfigsRequest request) {
            super(request);
            this.applicationConfigs = request.applicationConfigs;
            this.applicationName = request.applicationName;
            this.clusterId = request.clusterId;
            this.configAction = request.configAction;
            this.configScope = request.configScope;
            this.description = request.description;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeId = request.nodeId;
            this.regionId = request.regionId;
        } 

        /**
         * 应用配置列表。
         */
        public Builder applicationConfigs(java.util.List < UpdateApplicationConfig > applicationConfigs) {
            this.putQueryParameter("ApplicationConfigs", applicationConfigs);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * 应用名称。
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 配置项操作。取值范围：
         * <p>
         * - ADD：添加。
         * - DELETE：删除。
         * - UPDATE：更新。
         */
        public Builder configAction(String configAction) {
            this.putQueryParameter("ConfigAction", configAction);
            this.configAction = configAction;
            return this;
        }

        /**
         * 配置操作范围。取值范围：
         * <p>
         * - CLUSTER：集群范围。
         * - NODE_GROUP：节点组范围。
         */
        public Builder configScope(String configScope) {
            this.putQueryParameter("ConfigScope", configScope);
            this.configScope = configScope;
            return this;
        }

        /**
         * 本次更新操作描述。
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 节点组ID。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 节点ID。
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateApplicationConfigsRequest build() {
            return new UpdateApplicationConfigsRequest(this);
        } 

    } 

}
