// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDisposeStrategyRequest} extends {@link RequestModel}
 *
 * <p>ListDisposeStrategyRequest</p>
 */
public class ListDisposeStrategyRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("EffectiveStatus")
    private Integer effectiveStatus;

    @Body
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Body
    @NameInMap("EntityIdentity")
    private String entityIdentity;

    @Body
    @NameInMap("EntityType")
    private String entityType;

    @Body
    @NameInMap("Order")
    private String order;

    @Body
    @NameInMap("OrderField")
    private String orderField;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("PlaybookName")
    private String playbookName;

    @Body
    @NameInMap("PlaybookTypes")
    private String playbookTypes;

    @Body
    @NameInMap("PlaybookUuid")
    private String playbookUuid;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SophonTaskId")
    private String sophonTaskId;

    @Body
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private ListDisposeStrategyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.effectiveStatus = builder.effectiveStatus;
        this.endTime = builder.endTime;
        this.entityIdentity = builder.entityIdentity;
        this.entityType = builder.entityType;
        this.order = builder.order;
        this.orderField = builder.orderField;
        this.pageSize = builder.pageSize;
        this.playbookName = builder.playbookName;
        this.playbookTypes = builder.playbookTypes;
        this.playbookUuid = builder.playbookUuid;
        this.regionId = builder.regionId;
        this.sophonTaskId = builder.sophonTaskId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDisposeStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return effectiveStatus
     */
    public Integer getEffectiveStatus() {
        return this.effectiveStatus;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return entityIdentity
     */
    public String getEntityIdentity() {
        return this.entityIdentity;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playbookName
     */
    public String getPlaybookName() {
        return this.playbookName;
    }

    /**
     * @return playbookTypes
     */
    public String getPlaybookTypes() {
        return this.playbookTypes;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sophonTaskId
     */
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListDisposeStrategyRequest, Builder> {
        private Integer currentPage; 
        private Integer effectiveStatus; 
        private Long endTime; 
        private String entityIdentity; 
        private String entityType; 
        private String order; 
        private String orderField; 
        private Integer pageSize; 
        private String playbookName; 
        private String playbookTypes; 
        private String playbookUuid; 
        private String regionId; 
        private String sophonTaskId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListDisposeStrategyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.effectiveStatus = request.effectiveStatus;
            this.endTime = request.endTime;
            this.entityIdentity = request.entityIdentity;
            this.entityType = request.entityType;
            this.order = request.order;
            this.orderField = request.orderField;
            this.pageSize = request.pageSize;
            this.playbookName = request.playbookName;
            this.playbookTypes = request.playbookTypes;
            this.playbookUuid = request.playbookUuid;
            this.regionId = request.regionId;
            this.sophonTaskId = request.sophonTaskId;
            this.startTime = request.startTime;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EffectiveStatus.
         */
        public Builder effectiveStatus(Integer effectiveStatus) {
            this.putBodyParameter("EffectiveStatus", effectiveStatus);
            this.effectiveStatus = effectiveStatus;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EntityIdentity.
         */
        public Builder entityIdentity(String entityIdentity) {
            this.putBodyParameter("EntityIdentity", entityIdentity);
            this.entityIdentity = entityIdentity;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putBodyParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlaybookName.
         */
        public Builder playbookName(String playbookName) {
            this.putBodyParameter("PlaybookName", playbookName);
            this.playbookName = playbookName;
            return this;
        }

        /**
         * PlaybookTypes.
         */
        public Builder playbookTypes(String playbookTypes) {
            this.putBodyParameter("PlaybookTypes", playbookTypes);
            this.playbookTypes = playbookTypes;
            return this;
        }

        /**
         * PlaybookUuid.
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
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
         * SophonTaskId.
         */
        public Builder sophonTaskId(String sophonTaskId) {
            this.putBodyParameter("SophonTaskId", sophonTaskId);
            this.sophonTaskId = sophonTaskId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListDisposeStrategyRequest build() {
            return new ListDisposeStrategyRequest(this);
        } 

    } 

}
