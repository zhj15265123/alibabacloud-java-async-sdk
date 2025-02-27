// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunApplicationActionRequest} extends {@link RequestModel}
 *
 * <p>RunApplicationActionRequest</p>
 */
public class RunApplicationActionRequest extends Request {
    @Query
    @NameInMap("ActionName")
    @Validation(required = true)
    private String actionName;

    @Query
    @NameInMap("BatchSize")
    private Integer batchSize;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComponentInstanceSelector")
    @Validation(required = true)
    private ComponentInstanceSelector componentInstanceSelector;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExecuteStrategy")
    private String executeStrategy;

    @Query
    @NameInMap("Interval")
    private Long interval;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RollingExecute")
    private Boolean rollingExecute;

    private RunApplicationActionRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.batchSize = builder.batchSize;
        this.clusterId = builder.clusterId;
        this.componentInstanceSelector = builder.componentInstanceSelector;
        this.description = builder.description;
        this.executeStrategy = builder.executeStrategy;
        this.interval = builder.interval;
        this.regionId = builder.regionId;
        this.rollingExecute = builder.rollingExecute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunApplicationActionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return batchSize
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentInstanceSelector
     */
    public ComponentInstanceSelector getComponentInstanceSelector() {
        return this.componentInstanceSelector;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executeStrategy
     */
    public String getExecuteStrategy() {
        return this.executeStrategy;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rollingExecute
     */
    public Boolean getRollingExecute() {
        return this.rollingExecute;
    }

    public static final class Builder extends Request.Builder<RunApplicationActionRequest, Builder> {
        private String actionName; 
        private Integer batchSize; 
        private String clusterId; 
        private ComponentInstanceSelector componentInstanceSelector; 
        private String description; 
        private String executeStrategy; 
        private Long interval; 
        private String regionId; 
        private Boolean rollingExecute; 

        private Builder() {
            super();
        } 

        private Builder(RunApplicationActionRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.batchSize = request.batchSize;
            this.clusterId = request.clusterId;
            this.componentInstanceSelector = request.componentInstanceSelector;
            this.description = request.description;
            this.executeStrategy = request.executeStrategy;
            this.interval = request.interval;
            this.regionId = request.regionId;
            this.rollingExecute = request.rollingExecute;
        } 

        /**
         * 操作名称。取值范围：
         * <p>
         * - start：启动。
         * - stop：停止。
         * - config: 下发配置。
         * - refresh_queues: 刷新yarn队列。
         * 等
         */
        public Builder actionName(String actionName) {
            this.putQueryParameter("ActionName", actionName);
            this.actionName = actionName;
            return this;
        }

        /**
         * 每批数量。
         */
        public Builder batchSize(Integer batchSize) {
            this.putQueryParameter("BatchSize", batchSize);
            this.batchSize = batchSize;
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
         * 组件实例选择器。
         */
        public Builder componentInstanceSelector(ComponentInstanceSelector componentInstanceSelector) {
            this.putQueryParameter("ComponentInstanceSelector", componentInstanceSelector);
            this.componentInstanceSelector = componentInstanceSelector;
            return this;
        }

        /**
         * 描述。
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 运行策略。
         */
        public Builder executeStrategy(String executeStrategy) {
            this.putQueryParameter("ExecuteStrategy", executeStrategy);
            this.executeStrategy = executeStrategy;
            return this;
        }

        /**
         * 间隔时间。
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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

        /**
         * 是否滚动执行。
         */
        public Builder rollingExecute(Boolean rollingExecute) {
            this.putQueryParameter("RollingExecute", rollingExecute);
            this.rollingExecute = rollingExecute;
            return this;
        }

        @Override
        public RunApplicationActionRequest build() {
            return new RunApplicationActionRequest(this);
        } 

    } 

}
