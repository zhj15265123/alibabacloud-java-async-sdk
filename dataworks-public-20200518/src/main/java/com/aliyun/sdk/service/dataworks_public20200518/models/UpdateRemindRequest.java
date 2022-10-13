// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRemindRequest} extends {@link RequestModel}
 *
 * <p>UpdateRemindRequest</p>
 */
public class UpdateRemindRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AlertInterval")
    @Validation(maximum = 1800, minimum = 1200)
    private Integer alertInterval;

    @Body
    @NameInMap("AlertMethods")
    private String alertMethods;

    @Body
    @NameInMap("AlertTargets")
    private String alertTargets;

    @Body
    @NameInMap("AlertUnit")
    private String alertUnit;

    @Body
    @NameInMap("BaselineIds")
    private String baselineIds;

    @Body
    @NameInMap("BizProcessIds")
    private String bizProcessIds;

    @Body
    @NameInMap("Detail")
    private String detail;

    @Body
    @NameInMap("DndEnd")
    private String dndEnd;

    @Body
    @NameInMap("MaxAlertTimes")
    @Validation(maximum = 10, minimum = 1)
    private Integer maxAlertTimes;

    @Body
    @NameInMap("NodeIds")
    private String nodeIds;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("RemindId")
    @Validation(required = true)
    private Long remindId;

    @Body
    @NameInMap("RemindName")
    private String remindName;

    @Body
    @NameInMap("RemindType")
    private String remindType;

    @Body
    @NameInMap("RemindUnit")
    private String remindUnit;

    @Body
    @NameInMap("RobotUrls")
    private String robotUrls;

    @Body
    @NameInMap("UseFlag")
    private Boolean useFlag;

    private UpdateRemindRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertInterval = builder.alertInterval;
        this.alertMethods = builder.alertMethods;
        this.alertTargets = builder.alertTargets;
        this.alertUnit = builder.alertUnit;
        this.baselineIds = builder.baselineIds;
        this.bizProcessIds = builder.bizProcessIds;
        this.detail = builder.detail;
        this.dndEnd = builder.dndEnd;
        this.maxAlertTimes = builder.maxAlertTimes;
        this.nodeIds = builder.nodeIds;
        this.projectId = builder.projectId;
        this.remindId = builder.remindId;
        this.remindName = builder.remindName;
        this.remindType = builder.remindType;
        this.remindUnit = builder.remindUnit;
        this.robotUrls = builder.robotUrls;
        this.useFlag = builder.useFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRemindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alertInterval
     */
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    /**
     * @return alertMethods
     */
    public String getAlertMethods() {
        return this.alertMethods;
    }

    /**
     * @return alertTargets
     */
    public String getAlertTargets() {
        return this.alertTargets;
    }

    /**
     * @return alertUnit
     */
    public String getAlertUnit() {
        return this.alertUnit;
    }

    /**
     * @return baselineIds
     */
    public String getBaselineIds() {
        return this.baselineIds;
    }

    /**
     * @return bizProcessIds
     */
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return dndEnd
     */
    public String getDndEnd() {
        return this.dndEnd;
    }

    /**
     * @return maxAlertTimes
     */
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return remindId
     */
    public Long getRemindId() {
        return this.remindId;
    }

    /**
     * @return remindName
     */
    public String getRemindName() {
        return this.remindName;
    }

    /**
     * @return remindType
     */
    public String getRemindType() {
        return this.remindType;
    }

    /**
     * @return remindUnit
     */
    public String getRemindUnit() {
        return this.remindUnit;
    }

    /**
     * @return robotUrls
     */
    public String getRobotUrls() {
        return this.robotUrls;
    }

    /**
     * @return useFlag
     */
    public Boolean getUseFlag() {
        return this.useFlag;
    }

    public static final class Builder extends Request.Builder<UpdateRemindRequest, Builder> {
        private String regionId; 
        private Integer alertInterval; 
        private String alertMethods; 
        private String alertTargets; 
        private String alertUnit; 
        private String baselineIds; 
        private String bizProcessIds; 
        private String detail; 
        private String dndEnd; 
        private Integer maxAlertTimes; 
        private String nodeIds; 
        private Long projectId; 
        private Long remindId; 
        private String remindName; 
        private String remindType; 
        private String remindUnit; 
        private String robotUrls; 
        private Boolean useFlag; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRemindRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertInterval = request.alertInterval;
            this.alertMethods = request.alertMethods;
            this.alertTargets = request.alertTargets;
            this.alertUnit = request.alertUnit;
            this.baselineIds = request.baselineIds;
            this.bizProcessIds = request.bizProcessIds;
            this.detail = request.detail;
            this.dndEnd = request.dndEnd;
            this.maxAlertTimes = request.maxAlertTimes;
            this.nodeIds = request.nodeIds;
            this.projectId = request.projectId;
            this.remindId = request.remindId;
            this.remindName = request.remindName;
            this.remindType = request.remindType;
            this.remindUnit = request.remindUnit;
            this.robotUrls = request.robotUrls;
            this.useFlag = request.useFlag;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AlertInterval.
         */
        public Builder alertInterval(Integer alertInterval) {
            this.putBodyParameter("AlertInterval", alertInterval);
            this.alertInterval = alertInterval;
            return this;
        }

        /**
         * AlertMethods.
         */
        public Builder alertMethods(String alertMethods) {
            this.putBodyParameter("AlertMethods", alertMethods);
            this.alertMethods = alertMethods;
            return this;
        }

        /**
         * AlertTargets.
         */
        public Builder alertTargets(String alertTargets) {
            this.putBodyParameter("AlertTargets", alertTargets);
            this.alertTargets = alertTargets;
            return this;
        }

        /**
         * AlertUnit.
         */
        public Builder alertUnit(String alertUnit) {
            this.putBodyParameter("AlertUnit", alertUnit);
            this.alertUnit = alertUnit;
            return this;
        }

        /**
         * BaselineIds.
         */
        public Builder baselineIds(String baselineIds) {
            this.putBodyParameter("BaselineIds", baselineIds);
            this.baselineIds = baselineIds;
            return this;
        }

        /**
         * BizProcessIds.
         */
        public Builder bizProcessIds(String bizProcessIds) {
            this.putBodyParameter("BizProcessIds", bizProcessIds);
            this.bizProcessIds = bizProcessIds;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.putBodyParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * DndEnd.
         */
        public Builder dndEnd(String dndEnd) {
            this.putBodyParameter("DndEnd", dndEnd);
            this.dndEnd = dndEnd;
            return this;
        }

        /**
         * MaxAlertTimes.
         */
        public Builder maxAlertTimes(Integer maxAlertTimes) {
            this.putBodyParameter("MaxAlertTimes", maxAlertTimes);
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(String nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RemindId.
         */
        public Builder remindId(Long remindId) {
            this.putBodyParameter("RemindId", remindId);
            this.remindId = remindId;
            return this;
        }

        /**
         * RemindName.
         */
        public Builder remindName(String remindName) {
            this.putBodyParameter("RemindName", remindName);
            this.remindName = remindName;
            return this;
        }

        /**
         * RemindType.
         */
        public Builder remindType(String remindType) {
            this.putBodyParameter("RemindType", remindType);
            this.remindType = remindType;
            return this;
        }

        /**
         * RemindUnit.
         */
        public Builder remindUnit(String remindUnit) {
            this.putBodyParameter("RemindUnit", remindUnit);
            this.remindUnit = remindUnit;
            return this;
        }

        /**
         * RobotUrls.
         */
        public Builder robotUrls(String robotUrls) {
            this.putBodyParameter("RobotUrls", robotUrls);
            this.robotUrls = robotUrls;
            return this;
        }

        /**
         * UseFlag.
         */
        public Builder useFlag(Boolean useFlag) {
            this.putBodyParameter("UseFlag", useFlag);
            this.useFlag = useFlag;
            return this;
        }

        @Override
        public UpdateRemindRequest build() {
            return new UpdateRemindRequest(this);
        } 

    } 

}
