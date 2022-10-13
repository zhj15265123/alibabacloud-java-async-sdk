// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApprovePermissionApplyOrderRequest} extends {@link RequestModel}
 *
 * <p>ApprovePermissionApplyOrderRequest</p>
 */
public class ApprovePermissionApplyOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ApproveAction")
    @Validation(required = true, maximum = 5)
    private Integer approveAction;

    @Query
    @NameInMap("ApproveComment")
    @Validation(required = true)
    private String approveComment;

    @Query
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    private ApprovePermissionApplyOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approveAction = builder.approveAction;
        this.approveComment = builder.approveComment;
        this.flowId = builder.flowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApprovePermissionApplyOrderRequest create() {
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
     * @return approveAction
     */
    public Integer getApproveAction() {
        return this.approveAction;
    }

    /**
     * @return approveComment
     */
    public String getApproveComment() {
        return this.approveComment;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    public static final class Builder extends Request.Builder<ApprovePermissionApplyOrderRequest, Builder> {
        private String regionId; 
        private Integer approveAction; 
        private String approveComment; 
        private String flowId; 

        private Builder() {
            super();
        } 

        private Builder(ApprovePermissionApplyOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.approveAction = request.approveAction;
            this.approveComment = request.approveComment;
            this.flowId = request.flowId;
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
         * ApproveAction.
         */
        public Builder approveAction(Integer approveAction) {
            this.putQueryParameter("ApproveAction", approveAction);
            this.approveAction = approveAction;
            return this;
        }

        /**
         * ApproveComment.
         */
        public Builder approveComment(String approveComment) {
            this.putQueryParameter("ApproveComment", approveComment);
            this.approveComment = approveComment;
            return this;
        }

        /**
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        @Override
        public ApprovePermissionApplyOrderRequest build() {
            return new ApprovePermissionApplyOrderRequest(this);
        } 

    } 

}
