// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveOrderRequest} extends {@link RequestModel}
 *
 * <p>ApproveOrderRequest</p>
 */
public class ApproveOrderRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ApprovalNodeId")
    private Long approvalNodeId;

    @Query
    @NameInMap("ApprovalNodePos")
    private String approvalNodePos;

    @Query
    @NameInMap("ApprovalType")
    @Validation(required = true)
    private String approvalType;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("NewApprover")
    private Long newApprover;

    @Query
    @NameInMap("OldApprover")
    private Long oldApprover;

    @Query
    @NameInMap("Tid")
    private Long tid;

    @Query
    @NameInMap("WorkflowInstanceId")
    @Validation(required = true, minimum = 1)
    private Long workflowInstanceId;

    private ApproveOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approvalNodeId = builder.approvalNodeId;
        this.approvalNodePos = builder.approvalNodePos;
        this.approvalType = builder.approvalType;
        this.comment = builder.comment;
        this.newApprover = builder.newApprover;
        this.oldApprover = builder.oldApprover;
        this.tid = builder.tid;
        this.workflowInstanceId = builder.workflowInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveOrderRequest create() {
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
     * @return approvalNodeId
     */
    public Long getApprovalNodeId() {
        return this.approvalNodeId;
    }

    /**
     * @return approvalNodePos
     */
    public String getApprovalNodePos() {
        return this.approvalNodePos;
    }

    /**
     * @return approvalType
     */
    public String getApprovalType() {
        return this.approvalType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return newApprover
     */
    public Long getNewApprover() {
        return this.newApprover;
    }

    /**
     * @return oldApprover
     */
    public Long getOldApprover() {
        return this.oldApprover;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return workflowInstanceId
     */
    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public static final class Builder extends Request.Builder<ApproveOrderRequest, Builder> {
        private String regionId; 
        private Long approvalNodeId; 
        private String approvalNodePos; 
        private String approvalType; 
        private String comment; 
        private Long newApprover; 
        private Long oldApprover; 
        private Long tid; 
        private Long workflowInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.approvalNodeId = request.approvalNodeId;
            this.approvalNodePos = request.approvalNodePos;
            this.approvalType = request.approvalType;
            this.comment = request.comment;
            this.newApprover = request.newApprover;
            this.oldApprover = request.oldApprover;
            this.tid = request.tid;
            this.workflowInstanceId = request.workflowInstanceId;
        } 

        /**
         * The ID of the region in which you want to call this operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ApprovalNodeId.
         */
        public Builder approvalNodeId(Long approvalNodeId) {
            this.putQueryParameter("ApprovalNodeId", approvalNodeId);
            this.approvalNodeId = approvalNodeId;
            return this;
        }

        /**
         * ApprovalNodePos.
         */
        public Builder approvalNodePos(String approvalNodePos) {
            this.putQueryParameter("ApprovalNodePos", approvalNodePos);
            this.approvalNodePos = approvalNodePos;
            return this;
        }

        /**
         * The action that you want to perform on the ticket. Valid values:
         * <p>
         * 
         * *   AGREE: approve
         * *   CANCEL: cancel
         * *   REJECT: reject
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * The description of the ticket.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * NewApprover.
         */
        public Builder newApprover(Long newApprover) {
            this.putQueryParameter("NewApprover", newApprover);
            this.newApprover = newApprover;
            return this;
        }

        /**
         * OldApprover.
         */
        public Builder oldApprover(Long oldApprover) {
            this.putQueryParameter("OldApprover", oldApprover);
            this.oldApprover = oldApprover;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The ID of the approval process. You can call the [GetOrderBaseInfo](~~144642~~) operation to obtain the ID of the approval process.
         */
        public Builder workflowInstanceId(Long workflowInstanceId) {
            this.putQueryParameter("WorkflowInstanceId", workflowInstanceId);
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }

        @Override
        public ApproveOrderRequest build() {
            return new ApproveOrderRequest(this);
        } 

    } 

}
