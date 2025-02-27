// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostAutomateResponseConfigRequest} extends {@link RequestModel}
 *
 * <p>PostAutomateResponseConfigRequest</p>
 */
public class PostAutomateResponseConfigRequest extends Request {
    @Body
    @NameInMap("ActionConfig")
    private String actionConfig;

    @Body
    @NameInMap("ActionType")
    private String actionType;

    @Body
    @NameInMap("AutoResponseType")
    private String autoResponseType;

    @Body
    @NameInMap("ExecutionCondition")
    private String executionCondition;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RuleName")
    private String ruleName;

    @Body
    @NameInMap("SubUserId")
    private Long subUserId;

    private PostAutomateResponseConfigRequest(Builder builder) {
        super(builder);
        this.actionConfig = builder.actionConfig;
        this.actionType = builder.actionType;
        this.autoResponseType = builder.autoResponseType;
        this.executionCondition = builder.executionCondition;
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.ruleName = builder.ruleName;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostAutomateResponseConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionConfig
     */
    public String getActionConfig() {
        return this.actionConfig;
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return autoResponseType
     */
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    /**
     * @return executionCondition
     */
    public String getExecutionCondition() {
        return this.executionCondition;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<PostAutomateResponseConfigRequest, Builder> {
        private String actionConfig; 
        private String actionType; 
        private String autoResponseType; 
        private String executionCondition; 
        private Long id; 
        private String regionId; 
        private String ruleName; 
        private Long subUserId; 

        private Builder() {
            super();
        } 

        private Builder(PostAutomateResponseConfigRequest request) {
            super(request);
            this.actionConfig = request.actionConfig;
            this.actionType = request.actionType;
            this.autoResponseType = request.autoResponseType;
            this.executionCondition = request.executionCondition;
            this.id = request.id;
            this.regionId = request.regionId;
            this.ruleName = request.ruleName;
            this.subUserId = request.subUserId;
        } 

        /**
         * ActionConfig.
         */
        public Builder actionConfig(String actionConfig) {
            this.putBodyParameter("ActionConfig", actionConfig);
            this.actionConfig = actionConfig;
            return this;
        }

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.putBodyParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * AutoResponseType.
         */
        public Builder autoResponseType(String autoResponseType) {
            this.putBodyParameter("AutoResponseType", autoResponseType);
            this.autoResponseType = autoResponseType;
            return this;
        }

        /**
         * ExecutionCondition.
         */
        public Builder executionCondition(String executionCondition) {
            this.putBodyParameter("ExecutionCondition", executionCondition);
            this.executionCondition = executionCondition;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * SubUserId.
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public PostAutomateResponseConfigRequest build() {
            return new PostAutomateResponseConfigRequest(this);
        } 

    } 

}
